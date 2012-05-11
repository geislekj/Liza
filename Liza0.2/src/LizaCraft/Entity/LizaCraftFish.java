package LizaCraft.Entity;

import org.bukkit.entity.Fish;
import Liza.LizaFish;

/**
 * LizaCraftFish is the Liza entity representation of the Bukkit Fish class.
 * 
 * @author geislekj
 */
public class LizaCraftFish extends LizaCraftProjectile implements LizaFish {
	
	/**
	 * LizaCraftFish Constructor.
	 *
	 * @param fish This is a Bukkit Fish entity
	 */
	public LizaCraftFish(Fish fish) {
		super(fish);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftProjectile#getBukkitHandle()
	 */
	public Fish getBukkitHandle() {
		return (Fish) this.entity;
	}
}