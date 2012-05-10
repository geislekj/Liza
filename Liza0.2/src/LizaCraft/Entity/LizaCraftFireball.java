package LizaCraft.Entity;

import org.bukkit.entity.Fireball;
import org.bukkit.util.Vector;

import Liza.LizaFireball;

// TODO: Auto-generated Javadoc
/**
 *  LizaCraftFireball is the Liza entity representation of
 *  the Bukkit Fireball class.
 *  
 * @author collinbc
 */
public class LizaCraftFireball extends LizaCraftProjectile implements LizaFireball {
	
	/**
	 * LizaCraftFireball Constructor.
	 *
	 * @param fireball This is a Bukkit Fireball entity
	 */
	public LizaCraftFireball(Fireball fireball) {
		super(fireball);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftProjectile#getBukkitHandle()
	 */
	@Override
	public Fireball getBukkitHandle() {
		return (Fireball)this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Fireball#getDirection()
	 */
	@Override
	public Vector getDirection() {
		return this.getBukkitHandle().getDirection();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Fireball#setDirection(org.bukkit.util.Vector)
	 */
	@Override
	public void setDirection(Vector direction) {
		this.getBukkitHandle().setDirection(direction);
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

