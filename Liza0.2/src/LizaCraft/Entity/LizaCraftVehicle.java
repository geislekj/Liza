package LizaCraft.Entity;

import org.bukkit.entity.Vehicle;
import Liza.LizaVehicle;

/**
 *  LizeCraftVehicle is the Liza entity representation of
 *  the Bukkit Vehicle class.
 *  
 * @author geislekj
 */
public class LizaCraftVehicle extends LizaCraftEntity implements LizaVehicle{

	/**
	 * LizaCraftEntity Constructor
	 * 
	 * @param vehicle This is a Bukkit Vehicle entity 
	 */
	public LizaCraftVehicle(Vehicle vehicle) {
		super(vehicle);
	}
	
	@Override
	public Vehicle getBukkitHandle() {
		return (Vehicle)this.entity;
	}


}