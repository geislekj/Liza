package LizaCraft.Entity;

import org.bukkit.entity.CaveSpider;
import Liza.LizaCaveSpider;

/**
 * LizaCraftCaveSpider is the Liza entity representation of the Bukkit
 * CaveSpider class.
 * 
 * @author collinbc
 */
public class LizaCraftCaveSpider extends LizaCraftSpider implements
		LizaCaveSpider {
	
	/**
	 * LizaCraftCaveSpider Constructor.
	 *
	 * @param caveSpider A Bukkit CaveSpider
	 */
	public LizaCraftCaveSpider(CaveSpider caveSpider) {
		super(caveSpider);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftSpider#getBukkitHandle()
	 */
	@Override
	public CaveSpider getBukkitHandle() {
		return (CaveSpider) this.entity;
	}

}
