package LizaCraft.Entity;

import org.bukkit.entity.Explosive;

import Liza.LizaExplosive;

/**
 * LizeCraftExplosive is the Liza entity representation of the Bukkit Explosive
 * class.
 * 
 * @author geislekj
 */
public class LizaCraftExplosive extends LizaCraftEntity implements
		LizaExplosive {
	/**
	 * LizaCraftExplosive Constructor
	 * 
	 * @param explosive
	 *            This is a Bukkit Explosive entity
	 */
	public LizaCraftExplosive(Explosive explosive) {
		super(explosive);
	}

	@Override
	public Explosive getBukkitHandle() {
		return (Explosive) this.entity;
	}

	@Override
	public float getYield() {
		return this.getBukkitHandle().getYield();
	}

	@Override
	public boolean isIncendiary() {
		return this.getBukkitHandle().isIncendiary();
	}

	@Override
	public void setIsIncendiary(boolean isIncendiary) {
		this.getBukkitHandle().setIsIncendiary(isIncendiary);
	}

	@Override
	public void setYield(float yield) {
		this.getBukkitHandle().setYield(yield);
	}

}
