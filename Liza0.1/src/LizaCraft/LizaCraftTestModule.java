package LizaCraft;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.ThreadServerApplication;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import Liza.LizaServer;
import LizaCraft.Events.LizaPlugin;

public class LizaCraftTestModule {
    private static final String MINECRAFT_SERVER_THREAD_NAME = "Server thread";
    private static final String MINECRAFT_SERVER_FIELD_NAME = "a";
    
    private static final String PLUGIN_MANAGER_LIST_NAME = "plugins";
    private static final String PLUGIN_MANAGER_FILE_ASSOCIATION_MAP = "fileAssociations";
    
    private static final String PLUGIN_ENABLED_FIELD_NAME = "isEnabled";
    private static final String PLUGIN_SERVER_FIELD_NAME = "server";
    private static final String PLUGIN_LOADER_FIELD_NAME = "loader";
    private static final String PLUGIN_DESCRIPTION_FIELD_NAME = "description";
    private static final String PLUGIN_LOOKUP_FIELD_NAME = "lookupNames";
    
    private static final String PLUGIN_EXTENSION = ".jar";
    
    private LizaServerThread serverThread;
    private LizaServer server;
    private LizaPlugin eventListener;
    
    private String name;
    
    private boolean waiting = false;
    private Event waitingOn;
    
    public LizaCraftTestModule(String name) {
        this.name = name;
        
        this.eventListener = new LizaPlugin();
    }

    public String getName() {
        return this.name;
    }
    
    public void disableEvents() {
        // TODO Auto-generated method stub
        
    }
    
    @SuppressWarnings("unchecked")
    public void enableEvents() {
        // TODO: Use something other than Field f a bunch of times
        
        // Step 1: Find the appropriate PluginLoader
        Class<? extends PluginManager> pluginManager = ((SimplePluginManager) this.server.getPluginManager()).getClass();
        Field f;
        PluginLoader pluginLoader = null;
        try {
            f = pluginManager.getDeclaredField(PLUGIN_MANAGER_FILE_ASSOCIATION_MAP);
            f.setAccessible(true);
            Map<Pattern, PluginLoader> fileAssociations = ((HashMap) f.get(this.server.getPluginManager()));
            
            for (Pattern p : fileAssociations.keySet()) {
                Matcher match = p.matcher(PLUGIN_EXTENSION);
                if (match.find()) {
                    pluginLoader = fileAssociations.get(p);
                }
            }
            f.setAccessible(false);
        } catch (Exception e) {
            // TODO: Proper exception handling
            e.printStackTrace();
        }
        
        // Step 2: Tell the PluginLoader to load the plugin
        // Step 2.a: Create PluginDescriptionFile object
        PluginDescriptionFile desc = new PluginDescriptionFile(LizaPlugin.PLUGIN_NAME, null, null);
                
        // Step 2.b: Call initialize on the plugin
        Class<? extends JavaPlugin> plugin = this.eventListener.getClass();
        try {
            f = plugin.getSuperclass().getDeclaredField(PLUGIN_ENABLED_FIELD_NAME);
            f.setAccessible(true);
            f.set(this.eventListener, true);
            f.setAccessible(false);
            
            f = plugin.getSuperclass().getDeclaredField(PLUGIN_LOADER_FIELD_NAME);
            f.setAccessible(true);
            f.set(this.eventListener, pluginLoader);
            f.setAccessible(false);
            
            f = plugin.getSuperclass().getDeclaredField(PLUGIN_SERVER_FIELD_NAME);
            f.setAccessible(true);
            f.set(this.eventListener, this.server);
            f.setAccessible(false);
            
            f = plugin.getSuperclass().getDeclaredField(PLUGIN_DESCRIPTION_FIELD_NAME);
            f.setAccessible(true);
            f.set(this.eventListener, desc);
            f.setAccessible(false);
        } catch (Exception e) {
            //TODO
            e.printStackTrace();
        }
        
        // Step 3: Add to list of plugins
        List<Plugin> plugins;
        try {
            f = pluginManager.getDeclaredField(PLUGIN_MANAGER_LIST_NAME);
            f.setAccessible(true);
            plugins = (List<Plugin>) f.get(this.server.getPluginManager());
            plugins.add(this.eventListener);
            f.set(this.server.getPluginManager(), plugins);
            f.setAccessible(false);
        } catch (Exception e) {
            // TODO
            e.printStackTrace();
        }
        
        // Step 4: Add to lookup table
        Map<String, Plugin> lookupNames;
        try {
            f = pluginManager.getDeclaredField(PLUGIN_LOOKUP_FIELD_NAME);
            f.setAccessible(true);
            lookupNames = (HashMap<String, Plugin>)f.get(this.server.getPluginManager());
            lookupNames.put(LizaPlugin.PLUGIN_NAME, this.eventListener);
            f.set(this.server.getPluginManager(), lookupNames);
            f.setAccessible(false);
        } catch (Exception e) {
            // TODO
            e.printStackTrace();
        }
        
        this.eventListener.onEnable();
    }
    
    /**
     * Retrieves the LizaCraftServer object
     * 
     * @return
     */
    public LizaServer getServer() {
        CraftServer cs = null;
        try { // talk about jury rigging
            while (cs == null) {
                cs = searchThreads();
            }
        } catch (Exception e) {
            return getServer();
        }
        
        this.server = new LizaCraftServer(cs);
        return (LizaServer)this.server;
    }
    
    /**
     * Here be voodoo magic
     * 
     * @return
     */
    private CraftServer searchThreads() {
        ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();

        while (rootGroup.getParent() != null) {
            rootGroup = rootGroup.getParent();
        }

        Thread threads[] = new Thread[rootGroup.activeCount()];

        // activeCount() only provides an estimate for the number of
        // running threads, so this loop ensures that all threads are
        // captured.
        while (rootGroup.enumerate(threads, true) >= threads.length) {
            threads = new Thread[threads.length * 2];
        }

        // This is the Minecraft thread that is running the server
        ThreadServerApplication tsa = null;

        for (Thread t : threads) {
            if (t != null && t.getName() != null
                    && t.getName().equals(MINECRAFT_SERVER_THREAD_NAME)) {
                tsa = (ThreadServerApplication) t;
                break;
            }
        }

        Class<? extends ThreadServerApplication> c = tsa.getClass();
        Field f;
        MinecraftServer ms = null;
        try {
            f = c.getDeclaredField(MINECRAFT_SERVER_FIELD_NAME);
            f.setAccessible(true);
            ms = (MinecraftServer) f.get(tsa);
            f.setAccessible(false);
        } catch (Exception e) { // lol
            // TODO: do some proper exception handling
            e.printStackTrace();
        }

        return ms.server;
    }
    
    public Event waitForEvent(Class<? extends Event> event) {
        this.waiting = true;
        this.eventListener.waitForEvent(event, this);
        while (this.waiting) {}
        return this.waitingOn;
    }
    
    public void release(Event event) {
        this.waitingOn = event;
        this.waiting = false;
    }
    
    public LizaPlugin getEventListener() {
        return this.eventListener;
    }

    /**
     * Starts the thread that runs the server
     */
    public void startModule() {
        this.serverThread = new LizaServerThread(this.name);
        this.serverThread.start();
    }

    public void endModule() {
        this.server.shutdown();
        this.serverThread.interrupt();
    }
    
    public void spoofEvent(Event e) {
        this.server.getPluginManager().callEvent(e);
    }
}
