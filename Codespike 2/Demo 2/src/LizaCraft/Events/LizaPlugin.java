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
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import Liza.LizaListener;
import LizaCraft.LizaCraftTestModule;

public class LizaPlugin extends JavaPlugin implements Listener {
    private static final Logger log = Logger.getLogger("Minecraft");
    
    protected Map<Class<? extends Event>, LizaCraftTestModule> waitingList = new HashMap<Class<? extends Event>, LizaCraftTestModule>();
    
    private Map<Class<? extends Event>, LizaListener> listenerList = new HashMap<Class<? extends Event>, LizaListener>();
    
    @Override
    public void onDisable() {
        log.info("LizaPlugin disabled");
    }

    @Override
    public void onEnable() {
        log.info("LizaPlugin enabled");
        //getServer().getPluginManager().registerEvents(this, this);
    }
    
    public void waitForEvent(Class<? extends Event> event, LizaCraftTestModule testModule) {
        this.waitingList.put(event, testModule);
    }
    
    public void releaseFromEvent(Event event) {
        LizaCraftTestModule waitee = this.waitingList.remove(event.getClass());
        if (waitee != null) {
            waitee.release();
        }
    }
    
    public void registerEvent(Class<? extends Event> event) throws IllegalArgumentException {
        PluginManager pm = this.getServer().getPluginManager();
        EventExecutor exec = null;
        
        Method[] methods = this.getClass().getDeclaredMethods();
        for (final Method method : methods) {
            final EventHandler eh = method.getAnnotation(EventHandler.class);
            if (eh == null) continue;
            final Class<? extends Event> eventClass = method.getParameterTypes()[0].asSubclass(Event.class);
            if (event.equals(eventClass)) {
                exec = new EventExecutor() {
                    public void execute(Listener listener, Event event) throws EventException {
                        try {
                            if (!eventClass.isAssignableFrom(event.getClass())) {
                                throw new EventException("Wrong event type passed");
                            }
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
    
    public void registerEvent(Class<? extends Event> event, LizaListener listener) {
        registerEvent(event);
        this.listenerList.put(event, listener);
    }
    
    @EventHandler(priority=EventPriority.MONITOR)
    public void playerExpChange(final PlayerExpChangeEvent e) {
        releaseFromEvent(e);
        relayEvent(e);
    }
    
    @EventHandler(priority=EventPriority.MONITOR)
    public void onPlayerJoin(final PlayerJoinEvent e) {
        releaseFromEvent(e);
        relayEvent(e);
    }
    
    @EventHandler(priority=EventPriority.MONITOR)
    public void onBlockBreak(final BlockBreakEvent e) {
        releaseFromEvent(e);
        relayEvent(e);
    }
    
    @EventHandler(priority=EventPriority.MONITOR)
    public void onPlayerQuit(final PlayerQuitEvent e) {
        releaseFromEvent(e);
        relayEvent(e);
    }
    
    @EventHandler(priority=EventPriority.MONITOR)
    public void onPlayerExpChange(final PlayerExpChangeEvent e) {
        releaseFromEvent(e);
        relayEvent(e);
    }
    
    public void relayEvent(Event e) {
        LizaListener ll = this.listenerList.get(e.getClass());
        if (ll != null) {
            ll.handleEvent(e);
        }
    }
}
