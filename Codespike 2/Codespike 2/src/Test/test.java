package Test;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.event.Event;

import Liza.LizaEventListener;
import LizaCraft.LizaCraftServer;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LizaCraftServer ls = new LizaCraftServer();
		
		try {
			Thread.sleep(4000);
			
			
			System.out.println("Before");
			PluginManager pm = ls.getPluginManager();
			Plugin ps[] = pm.getPlugins();
			System.out.println(ps.length);
			
			System.out.println("After");
			ls.enableLizaPlugin();
			ps = pm.getPlugins();
			System.out.println(ps.length);
			
			LizaEventListener lel = ls.getEventListener();
			System.out.println("I'm going to wait until you break a block");
			lel.waitForEvent(Event.Type.BLOCK_BREAK);
			System.out.println("Yayyyyaaaaayyy!!!");
		} catch (InterruptedException e) {
			
		}
		
		
	}

}
