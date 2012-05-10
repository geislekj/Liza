package LizaCraft.Entity;

import org.bukkit.entity.Explosive;

import Liza.LizaExplosive;

// TODO: Auto-generated Javadoc
/**
 * LizeCraftExplosive is the Liza entity representation of the Bukkit Explosive
 * class.
 * 
 * @author geislekj
 */
public class LizaCraftExplosive extends LizaCraftEntity implements
		LizaExplosive {
	
	/**
	 * LizaCraftExplosive Constructor.
	 *
	 * @param explosive This is a Bukkit Explosive entity
	 */
	public LizaCraftExplosive(Explosive explosive) {
		super(explosive);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#getBukkitHandle()
	 */
	@Override
	public Explosive getBukkitHandle() {
		return (Explosive) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Explosive#getYield()
	 */
	@Override
	public float getYield() {
		return this.getBukkitHandle().getYield();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Explosive#isIncendiary()
	 */
	@Override
	public boolean isIncendiary() {
		return this.getBukkitHandle().isIncendiary();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Explosive#setIsIncendiary(boolean)
	 */
	@Override
	public void setIsIncendiary(boolean isIncendiary) {
		this.getBukkitHandle().setIsIncendiary(isIncendiary);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Explosive#setYield(float)
	 */
	@Override
	public void setYield(float yield) {
		this.getBukkitHandle().setYield(yield);
	}

}
