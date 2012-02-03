package Demo;

import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerQuitEvent;

import Liza.LizaListener;

public class DemoListener implements LizaListener {
    
    @SuppressWarnings("deprecation")
    @Override
    public void handleEvent(Event e) {
        // TODO Auto-generated method stub
        if (e.getType().equals(Event.Type.PLAYER_EXP_CHANGE)) {
            Demo.xpCount += 1;
        }
        if (e.getType().equals(Event.Type.PLAYER_QUIT)) {
            PlayerQuitEvent pqe = (PlayerQuitEvent) e;
            pqe.getPlayer().getServer().shutdown();
        }
        
    }
}