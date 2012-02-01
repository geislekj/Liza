package LizaCraft.Events;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;

@Deprecated //TODO: Update to new event handling
public class LizaBlockListener extends BlockListener {
    private LizaPlugin plugin;
    
    public LizaBlockListener(LizaPlugin plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public void onBlockBreak(BlockBreakEvent e) {
        this.plugin.releaseFromEvent(e);
    }
}
