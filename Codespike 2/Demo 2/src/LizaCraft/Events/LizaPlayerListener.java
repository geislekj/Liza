package LizaCraft.Events;

import org.bukkit.event.player.*;
import org.bukkit.event.player.PlayerListener;

@Deprecated //TODO: Update to new event handling
public class LizaPlayerListener extends PlayerListener {
    private LizaPlugin plugin;
    
    public LizaPlayerListener(LizaPlugin plugin) {
        this.plugin = plugin;
    }
    
    public void onPlayerJoin(PlayerJoinEvent e) {
        plugin.releaseFromEvent(e);
    }
    
    public void onPlayerExpChange(PlayerExpChangeEvent e) {
        plugin.releaseFromEvent(e);
    }
    
    public void onPlayerQuit(PlayerQuitEvent e) {
        plugin.releaseFromEvent(e);
    }
}
