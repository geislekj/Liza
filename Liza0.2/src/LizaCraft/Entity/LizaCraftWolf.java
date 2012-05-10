package LizaCraft.Entity;

import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Wolf;

import Liza.LizaWolf;

/**
 * LizaCraftWolf is the Liza entity representation of the Bukkit CraftWolf
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftWolf extends LizaCraftAnimals implements LizaWolf {
	/**
	 * LizaCraftWolf Constructor
	 * 
	 * @param wolf
	 *            A Bukkit Wolf
	 */
	public LizaCraftWolf(Wolf wolf) {
		super(wolf);
	}

	@Override
	public Wolf getBukkitHandle() {
		return (Wolf) this.entity;
	}

	@Override
	public boolean isAngry() {
		return this.getBukkitHandle().isAngry();
	}

	@Override
	public boolean isSitting() {
		return this.getBukkitHandle().isSitting();
	}

	@Override
	public void setAngry(boolean angry) {
		this.getBukkitHandle().setAngry(angry);
	}

	@Override
	public void setSitting(boolean sitting) {
		this.getBukkitHandle().setSitting(sitting);
	}

	@Override
	public AnimalTamer getOwner() {
		return this.getBukkitHandle().getOwner();
	}

	@Override
	public boolean isTamed() {
		return this.getBukkitHandle().isTamed();
	}

	@Override
	public void setOwner(AnimalTamer owner) {
		this.getBukkitHandle().setOwner(owner);
	}

	@Override
	public void setTamed(boolean tamed) {
		this.getBukkitHandle().setTamed(tamed);
	}

}
