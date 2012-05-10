package LizaCraft.Entity;

import org.bukkit.entity.Egg;
import Liza.LizaEgg;

/**
 * LizaCraftEgg is the Liza entity representation of the Bukkit Egg class.
 * 
 * @author collinbc
 */
public class LizaCraftEgg extends LizaCraftProjectile implements LizaEgg {

	/**
	 * LizaCraftEgg Constructor
	 * 
	 * @param egg
	 *            A Bukkit Egg
	 */
	public LizaCraftEgg(Egg egg) {
		super(egg);
	}

	@Override
	public Egg getBukkitHandle() {
		return (Egg) this.entity;
	}

}
