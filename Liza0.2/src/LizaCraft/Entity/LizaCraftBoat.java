package LizaCraft.Entity;

import org.bukkit.entity.Boat;
import org.bukkit.entity.Vehicle;

import Liza.LizaBoat;

// TODO: Auto-generated Javadoc
/**
 * The Class LizaCraftBoat.
 */
public class LizaCraftBoat extends LizaCraftVehicle implements LizaBoat {

	/**
	 * Instantiates a new liza craft boat.
	 *
	 * @param vehicle the vehicle
	 */
	public LizaCraftBoat(Vehicle vehicle) {
		super(vehicle);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftVehicle#getBukkitHandle()
	 */
	@Override
	public Boat getBukkitHandle() {
		return (Boat) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Boat#getMaxSpeed()
	 */
	@Override
	public double getMaxSpeed() {
		return this.getBukkitHandle().getMaxSpeed();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Boat#getOccupiedDeceleration()
	 */
	@Override
	public double getOccupiedDeceleration() {
		return this.getBukkitHandle().getOccupiedDeceleration();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Boat#getUnoccupiedDeceleration()
	 */
	@Override
	public double getUnoccupiedDeceleration() {
		return this.getBukkitHandle().getUnoccupiedDeceleration();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Boat#getWorkOnLand()
	 */
	@Override
	public boolean getWorkOnLand() {
		return this.getBukkitHandle().getWorkOnLand();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Boat#setMaxSpeed(double)
	 */
	@Override
	public void setMaxSpeed(double speed) {
		this.getBukkitHandle().setMaxSpeed(speed);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Boat#setOccupiedDeceleration(double)
	 */
	@Override
	public void setOccupiedDeceleration(double rate) {
		this.getBukkitHandle().setOccupiedDeceleration(rate);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Boat#setUnoccupiedDeceleration(double)
	 */
	@Override
	public void setUnoccupiedDeceleration(double rate) {
		this.getBukkitHandle().setUnoccupiedDeceleration(rate);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Boat#setWorkOnLand(boolean)
	 */
	@Override
	public void setWorkOnLand(boolean workOnLand) {
		this.getBukkitHandle().setWorkOnLand(workOnLand);
	}

}
