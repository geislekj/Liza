package LizaCraft.Entity;

import org.bukkit.entity.Boat;
import org.bukkit.entity.Vehicle;

import Liza.LizaBoat;

public class LizaCraftBoat extends LizaCraftVehicle implements LizaBoat {

	public LizaCraftBoat(Vehicle vehicle) {
		super(vehicle);
	}
	
	@Override
	public Boat getBukkitHandle() {
		return (Boat) this.entity;
	}

	@Override
	public double getMaxSpeed() {
		return this.getBukkitHandle().getMaxSpeed();
	}

	@Override
	public double getOccupiedDeceleration() {
		return this.getBukkitHandle().getOccupiedDeceleration();
	}

	@Override
	public double getUnoccupiedDeceleration() {
		return this.getBukkitHandle().getUnoccupiedDeceleration();
	}

	@Override
	public boolean getWorkOnLand() {
		return this.getBukkitHandle().getWorkOnLand();
	}

	@Override
	public void setMaxSpeed(double speed) {
		this.getBukkitHandle().setMaxSpeed(speed);
	}

	@Override
	public void setOccupiedDeceleration(double rate) {
		this.getBukkitHandle().setOccupiedDeceleration(rate);
	}

	@Override
	public void setUnoccupiedDeceleration(double rate) {
		this.getBukkitHandle().setUnoccupiedDeceleration(rate);
	}

	@Override
	public void setWorkOnLand(boolean workOnLand) {
		this.getBukkitHandle().setWorkOnLand(workOnLand);
	}

}
