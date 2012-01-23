package Liza;

import org.bukkit.event.Event;

public interface LizaEventListener {

	public void waitForEvent(Event.Type type);
	public void waitForEvent(Event.Type type, int time);
}
