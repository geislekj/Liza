package src;

import java.io.File;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import LizaCraft.LizaCraftTestModule;

public class BobTest {

	public static void main(String[] args) {
		File plugin = new File("bobplugin.jar");
		
		if (plugin.exists()) {
			LizaCraftTestModule testModule = new LizaCraftTestModule("Bob's Test");
			testModule.startModule();
			
			testModule.getServer();
			
			testModule.enableEvents();
			
			
			testModule.getEventListener().registerEvent(PlayerJoinEvent.class);
			testModule.getEventListener().registerEvent(BlockBreakEvent.class);
			testModule.getEventListener().registerEvent(PlayerQuitEvent.class);
			
			testModule.waitForEvent(PlayerJoinEvent.class);
			
			testModule.waitForEvent(BlockBreakEvent.class);
			
			testModule.getServer().broadcastMessage("Loading plugin now");
			
			testModule.loadPlugin(plugin);
			
			testModule.waitForEvent(BlockBreakEvent.class);
			
			testModule.getServer().broadcastMessage("Disabling plugin now");
			
			testModule.disablePlugin(plugin);
			
			testModule.waitForEvent(PlayerQuitEvent.class);
		} else {
			System.out.println("File not found!");
		}
	}
	
}
