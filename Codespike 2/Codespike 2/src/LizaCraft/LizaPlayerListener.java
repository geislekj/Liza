package LizaCraft;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;

public class LizaPlayerListener extends PlayerListener {

    public LizaPlayerListener() {

    }

    public void onPlayerJoin(PlayerJoinEvent e) {
        e.getPlayer().getServer().broadcastMessage("OMGWTFBBQ");
        // relay message to developer
        // send message to all waiting
    }
}
