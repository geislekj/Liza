package LizaCraft.Entity;

import org.bukkit.entity.Minecart;
import org.bukkit.util.Vector;

import Liza.LizaMinecart;

// TODO: Auto-generated Javadoc
/**
 * The Class LizaCraftMinecart.
 */
public class LizaCraftMinecart extends LizaCraftVehicle implements LizaMinecart {

	/**
	 * Instantiates a new liza craft minecart.
	 *
	 * @param minecart the minecart
	 */
	public LizaCraftMinecart(Minecart minecart){
		super(minecart);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftVehicle#getBukkitHandle()
	 */
	@Override
	public Minecart getBukkitHandle(){
		return (Minecart)this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#getDamage()
	 */
	@Override
	public int getDamage() {
		return this.getBukkitHandle().getDamage();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#getDerailedVelocityMod()
	 */
	@Override
	public Vector getDerailedVelocityMod() {
		return this.getBukkitHandle().getDerailedVelocityMod();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#getFlyingVelocityMod()
	 */
	@Override
	public Vector getFlyingVelocityMod() {
		return this.getBukkitHandle().getFlyingVelocityMod();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#getMaxSpeed()
	 */
	@Override
	public double getMaxSpeed() {
		return this.getBukkitHandle().getMaxSpeed();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#isSlowWhenEmpty()
	 */
	@Override
	public boolean isSlowWhenEmpty() {
		return this.getBukkitHandle().isSlowWhenEmpty();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#setDamage(int)
	 */
	@Override
	public void setDamage(int damage) {
		this.getBukkitHandle().setDamage(damage);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#setDerailedVelocityMod(org.bukkit.util.Vector)
	 */
	@Override
	public void setDerailedVelocityMod(Vector velocity) {
		this.getBukkitHandle().setDerailedVelocityMod(velocity);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#setFlyingVelocityMod(org.bukkit.util.Vector)
	 */
	@Override
	public void setFlyingVelocityMod(Vector velocity) {
		this.getBukkitHandle().setFlyingVelocityMod(velocity);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#setMaxSpeed(double)
	 */
	@Override
	public void setMaxSpeed(double speed) {
		this.getBukkitHandle().setMaxSpeed(speed);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Minecart#setSlowWhenEmpty(boolean)
	 */
	@Override
	public void setSlowWhenEmpty(boolean slow) {
		this.getBukkitHandle().setSlowWhenEmpty(slow);
	}
	
}
