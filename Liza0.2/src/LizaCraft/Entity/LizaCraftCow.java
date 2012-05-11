package LizaCraft.Entity;

import org.bukkit.entity.Cow;
import Liza.LizaCow;

/**
 * LizaCraftCow is the Liza entity representation of the Bukkit CraftCow class.
 * 
 * @author collinbc
 */
public class LizaCraftCow extends LizaCraftAnimals implements LizaCow {
	
	/**
	 * LizaCraftMushroomCow Constructor.
	 *
	 * @param cow A Bukkit Cow
	 */
	public LizaCraftCow(Cow cow) {
		super(cow);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftAnimals#getBukkitHandle()
	 */
	@Override
	public Cow getBukkitHandle() {
		return (Cow) this.entity;
	}

}
