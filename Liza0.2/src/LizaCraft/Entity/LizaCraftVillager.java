package LizaCraft.Entity;

import org.bukkit.entity.Villager;

import Liza.LizaVillager;

/**
 * LizaCraftVillager is the Liza entity representation of the Bukkit Villager
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftVillager extends LizaCraftNPC implements LizaVillager {

	/**
	 * LizaCraftVillager Constructor
	 * 
	 * @param villager
	 *            A Bukkit Villager
	 */
	public LizaCraftVillager(Villager villager) {
		super(villager);
	}

	@Override
	public Villager getBukkitHandle() {
		return (Villager) this.entity;
	}

}
