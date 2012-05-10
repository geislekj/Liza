package LizaCraft.Entity;

import org.bukkit.entity.MushroomCow;
import Liza.LizaMushroomCow;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftMushroomCow is the Liza entity representation of the Bukkit
 * MushroomCow class.
 * 
 * @author collinbc
 */
public class LizaCraftMushroomCow extends LizaCraftCow implements
		LizaMushroomCow {
	
	/**
	 * LizaCraftMushroomCow Constructor.
	 *
	 * @param mooshroom A Bukkit MushroomCow
	 */
	public LizaCraftMushroomCow(MushroomCow mooshroom) {
		super(mooshroom);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftCow#getBukkitHandle()
	 */
	@Override
	public MushroomCow getBukkitHandle() {
		return (MushroomCow) this.entity;
	}

}
