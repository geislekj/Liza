package LizaCraft;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;

public class LizaBlockListener extends BlockListener {
    private LizaPlugin plugin;
    
    public LizaBlockListener(LizaPlugin plugin) {
        this.plugin = plugin;
    }

    public void onBlockBreak(BlockBreakEvent e) {
        if (this.plugin.waitingQueue.containsKey(e.getType())) {
            LizaCraftEventListener lcel = (LizaCraftEventListener) this.plugin.waitingQueue.get(e.getType());
            lcel.setWaiting(false);
        }
    }
}
