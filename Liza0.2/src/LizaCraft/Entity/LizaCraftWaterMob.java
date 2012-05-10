package LizaCraft.Entity;

import org.bukkit.entity.WaterMob;

import Liza.LizaWaterMob;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftWaterMob is the Liza entity representation of the Bukkit WaterMob
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftWaterMob extends LizaCraftCreature implements
		LizaWaterMob {
	
	/**
	 * LizaCraftWaterMob Constructor.
	 *
	 * @param waterMob A Bukkit WaterMob
	 */
	public LizaCraftWaterMob(WaterMob waterMob) {
		super(waterMob);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftCreature#getBukkitHandle()
	 */
	@Override
	public WaterMob getBukkitHandle() {
		return (WaterMob) this.entity;
	}

}
