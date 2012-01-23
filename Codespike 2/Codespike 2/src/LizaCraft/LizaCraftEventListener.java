package LizaCraft;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Type;

import Liza.LizaEventListener;
import Liza.LizaServer;

public class LizaCraftEventListener implements LizaEventListener {
    private boolean waiting = false;
    private LizaCraftServer server;
    
    public LizaCraftEventListener(LizaCraftServer server) {
        this.server = server;
    }
    
	@Override
	public void waitForEvent(Event.Type type) {
		// TODO Auto-generated method stub
		// block until event happens
	    this.waiting = true;
	    server.spoof.waitingQueue.put(type, this);
	    
	    while(waiting) {
	        //something, maybe nothing?
	    }
	    return;
	}

	@Override
	public void waitForEvent(Type type, int time) {
		// TODO Auto-generated method stub
		
	}
	
	protected void setWaiting(boolean value) {
	    waiting = value;
	}

}
