package DemoTest;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import Liza.LizaBlock;
import Liza.LizaCraftBlock;
import Liza.LizaServer;

public class Demo {

	public static void main(String[] args) {
		//start up the server
		LizaServer ls = new LizaServer();
		
		System.out.println("Connect to localhost to begin demo!");
		
		Player playerList[];
		// Here, we would make the mock player and connect it to the server
		// But for now, we wait (very busily) until I log in
		while ((playerList = ls.getOnlinePlayers()).length == 0) {}
		
		Player activePlayer = playerList[0];
		World w = activePlayer.getWorld();
		
		try {
			ls.broadcastMessage("Hi there, " + activePlayer.getDisplayName() + "!");
			ls.broadcastMessage("Making sure it's daytime...");
			w.setTime(0L);
			ls.broadcastMessage("Making sure you're an op");
			activePlayer.setOp(true);
			
			Thread.sleep(5000);
			
			ls.broadcastMessage("Before we begin, I'd like to clear your inventory.");
			activePlayer.getInventory().clear();
			
			Thread.sleep(5000);
			
			ls.broadcastMessage("Now, take this diamond pickaxe. :)");
			activePlayer.setItemInHand(new ItemStack(Material.DIAMOND_PICKAXE, 1));
			
			Thread.sleep(500);
			
			Location l = activePlayer.getLocation();
			LizaBlock b = new LizaCraftBlock(w.getBlockAt(l).getRelative(BlockFace.NORTH));
			b.setType(Material.GOLD_BLOCK);
			
			ls.broadcastMessage("There should be a gold block nearby. Use the diamond pickaxe to destroy it");
			ls.broadcastMessage("Because I haven't implemented event listening, I'll be annoying and spam the result of assertBlockType() periodically");
			
			boolean annoying = true;
			while (annoying) {
				ls.broadcastMessage("assertBlockType returned " + !annoying + "! (expected AIR but got " + b.getType() + ")");
				Thread.sleep(1000);
				annoying = !b.assertBlockType(Material.AIR);
			}
			
			ls.broadcastMessage("assertBlockType returned " + !annoying + "! (" + b.getType() + ")");
			
			Thread.sleep(500);
			
			ls.broadcastMessage("Congratulations. This test module will explode in 3 seconds.");
			
			Thread.sleep(3000);
			
			w.createExplosion(activePlayer.getLocation(), 10.0f);
			
			
		} catch (InterruptedException e) {
			
		}
		
		// Normally we would wait until the mock player is removed
		// But for now, we wait (very busily) until I log off
		try {
			while (ls.getOnlinePlayers().length != 0) {}
		} catch (Exception e) {
			// possible when I disconnect due to synchronization
		}
		
		
		//shut down server
		ls.stop();
	}
}
