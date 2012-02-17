package demo;

import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import Liza.LizaListener;

public class DemoTestListener implements LizaListener {

	@Override
	public void handleEvent(Event e) {
		if (e instanceof PlayerExpChangeEvent) {
			DemoTest.xpCounter++;
		} else if (e instanceof PlayerQuitEvent) {
			DemoTest.tearDownOnce();
		}
	}
	
}
