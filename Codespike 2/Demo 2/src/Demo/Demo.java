package Demo;

import Liza.LizaPlayer;
import Liza.LizaServer;
import LizaCraft.LizaCraftTestModule;
import LizaCraft.Events.LizaPlugin;

import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;

@Deprecated
public class Demo {
    protected static int xpCount = 0;

    public static void main(String args[]) {
        DemoListener listener = new DemoListener();
        
        LizaCraftTestModule test = new LizaCraftTestModule("This class name is really long");
        
        test.startModule(); // perhaps just be test.start()
        LizaServer server = test.getServer(); // perhaps startModule() should return server object
        
        test.enableEvents();

        LizaPlugin eventListener = test.getEventListener();
        eventListener.registerEvent(PlayerJoinEvent.class); // perhaps this shouldn't be necessary
        eventListener.registerEvent(BlockBreakEvent.class); // but this registers an event without
        eventListener.registerEvent(PlayerQuitEvent.class); // committing to a listener
        eventListener.registerEvent(PlayerExpChangeEvent.class, listener);

        test.waitForEvent(PlayerJoinEvent.class); // It'd be nice if this returned the Event object or something to determine who joined and such
        
        LizaPlayer player = (LizaPlayer) server.getPlayer("soggynoose");
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
        
        test.waitForEvent(PlayerQuitEvent.class);
        
        test.disableEvents();
        test.endModule(); // perhaps just be test.end()
    }
}
