package LizaCraft.Entity;

import org.bukkit.entity.Fireball;
import org.bukkit.util.Vector;

import Liza.LizaFireball;

/**
 *  LizaCraftFireball is the Liza entity representation of
 *  the Bukkit Fireball class.
 *  
 * @author collinbc
 */
public class LizaCraftFireball extends LizaCraftProjectile implements LizaFireball {
	/**
	 * LizaCraftFireball Constructor
	 * 
	 * @param fireball This is a Bukkit Fireball entity 
	 */
	public LizaCraftFireball(Fireball fireball) {
		super(fireball);
	}
	
	@Override
	public Fireball getBukkitHandle() {
		return (Fireball)this.entity;
	}

	@Override
	public Vector getDirection() {
		return this.getBukkitHandle().getDirection();
	}

	@Override
	public void setDirection(Vector direction) {
		this.getBukkitHandle().setDirection(direction);
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

