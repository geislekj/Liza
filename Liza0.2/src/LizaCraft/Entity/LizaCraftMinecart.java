package LizaCraft.Entity;

import org.bukkit.entity.Minecart;
import org.bukkit.util.Vector;

import Liza.LizaMinecart;

public class LizaCraftMinecart extends LizaCraftVehicle implements LizaMinecart {

	public LizaCraftMinecart(Minecart minecart){
		super(minecart);
	}
	
	@Override
	public Minecart getBukkitHandle(){
		return (Minecart)this.entity;
	}

	@Override
	public int getDamage() {
		return this.getBukkitHandle().getDamage();
	}

	@Override
	public Vector getDerailedVelocityMod() {
		return this.getBukkitHandle().getDerailedVelocityMod();
	}

	@Override
	public Vector getFlyingVelocityMod() {
		return this.getBukkitHandle().getFlyingVelocityMod();
	}

	@Override
	public double getMaxSpeed() {
		return this.getBukkitHandle().getMaxSpeed();
	}

	@Override
	public boolean isSlowWhenEmpty() {
		return this.getBukkitHandle().isSlowWhenEmpty();
	}

	@Override
	public void setDamage(int damage) {
		this.getBukkitHandle().setDamage(damage);
	}

	@Override
	public void setDerailedVelocityMod(Vector velocity) {
		this.getBukkitHandle().setDerailedVelocityMod(velocity);
	}

	@Override
	public void setFlyingVelocityMod(Vector velocity) {
		this.getBukkitHandle().setFlyingVelocityMod(velocity);
	}

	@Override
	public void setMaxSpeed(double speed) {
		this.getBukkitHandle().setMaxSpeed(speed);
	}

	@Override
	public void setSlowWhenEmpty(boolean slow) {
		this.getBukkitHandle().setSlowWhenEmpty(slow);
	}
	
}
