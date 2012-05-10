package LizaCraft.Events;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.event.EventException;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import Liza.LizaListener;
import LizaCraft.LizaCraftTestModule;

// TODO: Auto-generated Javadoc
/**
 * The Class LizaPlugin.
 */
public class LizaPlugin extends JavaPlugin implements Listener {
    
    /** The Constant log. */
    private static final Logger log = Logger.getLogger("Minecraft");
    
    /** The Constant PLUGIN_NAME. */
    public static final String PLUGIN_NAME = "Liza Event Listener";
    
    /** The waiting list. */
    protected Map<Class<? extends Event>, LizaCraftTestModule> waitingList = new HashMap<Class<? extends Event>, LizaCraftTestModule>();
    
    /** The listener list. */
    private Map<Class<? extends Event>, LizaListener> listenerList = new HashMap<Class<? extends Event>, LizaListener>();
    
    /* (non-Javadoc)
     * @see org.bukkit.plugin.java.JavaPlugin#onDisable()
     */
    @Override
    public void onDisable() {
        log.info("LizaPlugin disabled");
    }

    /* (non-Javadoc)
     * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
     */
    @Override
    public void onEnable() {
        log.info("LizaPlugin enabled");
    }
    
    /**
     * Register event.
     *
     * @param event the event
     * @throws IllegalArgumentException the illegal argument exception
     */
    public void registerEvent(Class<? extends Event> event) throws IllegalArgumentException {
        PluginManager pm = this.getServer().getPluginManager();
        EventExecutor exec = null;
        
        Method[] methods = this.getClass().getDeclaredMethods();
        for (final Method method : methods) {
            final EventHandler eh = method.getAnnotation(EventHandler.class);
            if (eh == null) continue;
            if (method.getParameterTypes()[0].equals(Event.class)) {
                exec = new EventExecutor() {
                    public void execute(Listener listener, Event event) throws EventException {
                        try {
                            method.invoke(listener, event);
                        } catch (Throwable t) {
                            throw new EventException(t);
                        }
                    }
                };
            }
        }
        
        if (exec == null) {
            throw new IllegalArgumentException("Failed to register event.");
        }
        
        pm.registerEvent(event, this, EventPriority.MONITOR, exec, this);
    }
    
    /**
     * Register event.
     *
     * @param event the event
     * @param listener the listener
     */
    public void registerEvent(Class<? extends Event> event, LizaListener listener) {
        registerEvent(event);
        this.listenerList.put(event, listener);
    }
    
    /**
     * Handle event.
     *
     * @param e the e
     */
    @EventHandler(priority=EventPriority.MONITOR)
    public void handleEvent(Event e) {
        releaseFromEvent(e);
        relayEvent(e);
    }
    
    /**
     * Wait for event.
     *
     * @param event the event
     * @param testModule the test module
     */
    public void waitForEvent(Class<? extends Event> event, LizaCraftTestModule testModule) {
        this.waitingList.put(event, testModule);
    }
    
    /**
     * Release from event.
     *
     * @param event the event
     */
    public void releaseFromEvent(Event event) {
        LizaCraftTestModule waitee = this.waitingList.remove(event.getClass());
        if (waitee != null) {
            waitee.release(event);
        }
    }
    
    /**
     * Relay event.
     *
     * @param e the e
     */
    public void relayEvent(Event e) {
        LizaListener ll = this.listenerList.get(e.getClass());
        if (ll != null) {
            ll.handleEvent(e);
        }
    }
}
