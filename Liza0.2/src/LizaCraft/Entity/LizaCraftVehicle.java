package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

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