package LizaCraft.Entity;

import org.bukkit.entity.SmallFireball;
import Liza.LizaSmallFireball;

/**
 * LizaCraftSmallFireball is the Liza entity representation of the Bukkit
 * SmallFireball class.
 * 
 * @author collinbc
 */
public class LizaCraftSmallFireball extends LizaCraftFireball implements
		LizaSmallFireball {

	/**
	 * LizaCraftSmallFireball Constructor.
	 *
	 * @param smallFireball This is a Bukkit SmallFireball entity
	 */
	public LizaCraftSmallFireball(SmallFireball smallFireball) {
		super(smallFireball);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftFireball#getBukkitHandle()
	 */
	@Override
	public SmallFireball getBukkitHandle() {
		return (SmallFireball) this.entity;
	}

}
