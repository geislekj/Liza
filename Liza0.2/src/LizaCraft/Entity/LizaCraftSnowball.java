package LizaCraft.Entity;

import org.bukkit.entity.Snowball;
import Liza.LizaSnowball;

/**
 *  LizaCraftSnowball is the Liza entity representation of
 *  the Bukkit Snowball class.
 *  
 *  @author collinbc
 */
public class LizaCraftSnowball extends LizaCraftProjectile implements LizaSnowball {
	
	/**
	 * LizaCraftSnowball Constructor
	 * 
	 * @param snowball A Bukkit Snowball
	 */
	public LizaCraftSnowball(Snowball snowball) {
		super(snowball);
	}
	
	@Override
	public Snowball getBukkitHandle() {
		return (Snowball) this.entity;
	}
}
