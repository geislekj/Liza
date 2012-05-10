package LizaCraft.Entity;

import org.bukkit.entity.Spider;
import Liza.LizaSpider;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftSpider is the Liza entity representation of the Bukkit Spider class.
 * 
 * @author collinbc
 */
public class LizaCraftSpider extends LizaCraftMonster implements LizaSpider {
	
	/**
	 * LizaCraftSpider Constructor.
	 *
	 * @param spider A Bukkit Spider
	 */
	public LizaCraftSpider(Spider spider) {
		super(spider);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMonster#getBukkitHandle()
	 */
	@Override
	public Spider getBukkitHandle() {
		return (Spider) this.entity;
	}
}
