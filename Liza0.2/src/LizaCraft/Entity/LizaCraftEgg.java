package LizaCraft.Entity;

import org.bukkit.entity.Egg;
import Liza.LizaEgg;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftEgg is the Liza entity representation of the Bukkit Egg class.
 * 
 * @author collinbc
 */
public class LizaCraftEgg extends LizaCraftProjectile implements LizaEgg {

	/**
	 * LizaCraftEgg Constructor.
	 *
	 * @param egg A Bukkit Egg
	 */
	public LizaCraftEgg(Egg egg) {
		super(egg);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftProjectile#getBukkitHandle()
	 */
	@Override
	public Egg getBukkitHandle() {
		return (Egg) this.entity;
	}

}
