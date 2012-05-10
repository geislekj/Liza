package LizaCraft.Entity;

import org.bukkit.entity.Snowball;
import Liza.LizaSnowball;

// TODO: Auto-generated Javadoc
/**
 *  LizaCraftSnowball is the Liza entity representation of
 *  the Bukkit Snowball class.
 *  
 *  @author collinbc
 */
public class LizaCraftSnowball extends LizaCraftProjectile implements LizaSnowball {
	
	/**
	 * LizaCraftSnowball Constructor.
	 *
	 * @param snowball A Bukkit Snowball
	 */
	public LizaCraftSnowball(Snowball snowball) {
		super(snowball);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftProjectile#getBukkitHandle()
	 */
	@Override
	public Snowball getBukkitHandle() {
		return (Snowball) this.entity;
	}
}
