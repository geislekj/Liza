package LizaCraft.Entity;

import org.bukkit.entity.Cow;
import Liza.LizaCow;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftCow is the Liza entity representation of the Bukkit CraftCow class.
 * 
 * @author collinbc
 */
public class LizaCraftCow extends LizaCraftAnimals implements LizaCow {
	
	/**
	 * LizaCraftMushroomCow Constructor.
	 *
	 * @param cow the cow
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
