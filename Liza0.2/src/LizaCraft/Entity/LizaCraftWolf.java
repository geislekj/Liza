package LizaCraft.Entity;

import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Wolf;

import Liza.LizaWolf;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftWolf is the Liza entity representation of the Bukkit CraftWolf
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftWolf extends LizaCraftAnimals implements LizaWolf {
	
	/**
	 * LizaCraftWolf Constructor.
	 *
	 * @param wolf A Bukkit Wolf
	 */
	public LizaCraftWolf(Wolf wolf) {
		super(wolf);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftAnimals#getBukkitHandle()
	 */
	@Override
	public Wolf getBukkitHandle() {
		return (Wolf) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Wolf#isAngry()
	 */
	@Override
	public boolean isAngry() {
		return this.getBukkitHandle().isAngry();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Wolf#isSitting()
	 */
	@Override
	public boolean isSitting() {
		return this.getBukkitHandle().isSitting();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Wolf#setAngry(boolean)
	 */
	@Override
	public void setAngry(boolean angry) {
		this.getBukkitHandle().setAngry(angry);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Wolf#setSitting(boolean)
	 */
	@Override
	public void setSitting(boolean sitting) {
		this.getBukkitHandle().setSitting(sitting);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Tameable#getOwner()
	 */
	@Override
	public AnimalTamer getOwner() {
		return this.getBukkitHandle().getOwner();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Tameable#isTamed()
	 */
	@Override
	public boolean isTamed() {
		return this.getBukkitHandle().isTamed();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Tameable#setOwner(org.bukkit.entity.AnimalTamer)
	 */
	@Override
	public void setOwner(AnimalTamer owner) {
		this.getBukkitHandle().setOwner(owner);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Tameable#setTamed(boolean)
	 */
	@Override
	public void setTamed(boolean tamed) {
		this.getBukkitHandle().setTamed(tamed);
	}

}
