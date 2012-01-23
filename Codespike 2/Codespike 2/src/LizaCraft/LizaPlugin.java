package LizaCraft;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import Liza.LizaEventListener;

public class LizaPlugin extends JavaPlugin {
    private static final Logger log = Logger.getLogger("Minecraft");
    
    protected Map<Event.Type, LizaEventListener> waitingQueue = new HashMap<Event.Type, LizaEventListener>();

    private LizaPlayerListener playerListener = new LizaPlayerListener();
    private LizaBlockListener blockListener = new LizaBlockListener(this);

    @Override
    public void onDisable() {
        // TODO Auto-generated method stub

    }

    @Override
    public void onEnable() {
        // TODO Auto-generated method stub
        // register events here
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.PLAYER_JOIN, playerListener,
                Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.BLOCK_BREAK, blockListener,
                Event.Priority.Normal, this);

        log.info("LizaPlugin enabled");
    }

}
