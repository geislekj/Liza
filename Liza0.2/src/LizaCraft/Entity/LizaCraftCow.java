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
	 * LizaCraftMushroomCow Constructor
	 * 
	 * @param mooshroom
	 *            A Bukkit MushroomCow
	 */
	public LizaCraftCow(Cow cow) {
		super(cow);
	}

	@Override
	public Cow getBukkitHandle() {
		return (Cow) this.entity;
	}

}
