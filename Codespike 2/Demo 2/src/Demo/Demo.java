package Demo;

import Liza.LizaPlayer;
import Liza.LizaServer;
import LizaCraft.LizaCraftPlayer;
import LizaCraft.LizaCraftTestModule;
import LizaCraft.Events.LizaPlugin;

import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;

public class Demo {
    protected static int xpCount = 0;

    public static void main(String args[]) {
        DemoListener listener = new DemoListener();
        
        LizaCraftTestModule test = new LizaCraftTestModule("This class name is really long");
        
        test.startModule(); // perhaps just be test.start()
        LizaServer server = test.getServer(); // perhaps startModule() should return server object
        
        test.enableEvents();

        LizaPlugin eventListener = test.getEventListener();
        eventListener.registerEvent(PlayerJoinEvent.class); // Any way to do without the .class part?
        eventListener.registerEvent(BlockBreakEvent.class);
        eventListener.registerEvent(PlayerQuitEvent.class, listener);
        eventListener.registerEvent(PlayerExpChangeEvent.class, listener);

        PlayerJoinEvent pje = (PlayerJoinEvent)test.waitForEvent(PlayerJoinEvent.class);
        if (pje == null) System.out.println("Oh noes");
        LizaPlayer player = new LizaCraftPlayer(pje.getPlayer()); // oh jesus dont tell me we need to make our own event objects too
        
        player.setItemInHand(new ItemStack(Material.DIAMOND_SPADE, 1));
        player.setLevel(0);
        player.setOp(true);
        
        int blockLimit = 100;
        int count = 0;
        while (count < blockLimit) {
            test.waitForEvent(BlockBreakEvent.class);
            count += 1;
            if ((count%10)==0) {
                System.out.println(count);
            }
        }
        
        System.out.println("Report: Out of " + count + " block destroyed, dropped " + xpCount + " orbs.");
        System.out.println("Average: " + ((float)xpCount)/count);
    }
}
