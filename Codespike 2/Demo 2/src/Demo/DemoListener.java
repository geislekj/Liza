package Demo;

import org.bukkit.event.Event;

import Liza.LizaListener;

public class DemoListener implements LizaListener {
    
    @SuppressWarnings("deprecation")
    @Override
    public void handleEvent(Event e) {
        // TODO Auto-generated method stub
        if (e.getType().equals(Event.Type.PLAYER_EXP_CHANGE)) {
            Demo.xpCount += 1;
        }
    }
}