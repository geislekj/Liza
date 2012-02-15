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
public class LizaCraftVehicle implements LizaVehicle{

	private Vehicle vehicle;

	/**
	 * LizaCraftEntity Constructor
	 * 
	 * @param vehicle This is a Bukkit Vehicle entity 
	 */
	public LizaCraftVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public Vector getVelocity() {
		return this.vehicle.getVelocity();
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.vehicle.setVelocity(arg0);
	}

	@Override
	public boolean eject() {
		return this.vehicle.eject();
	}

	@Override
	public int getEntityId() {
		return this.vehicle.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.vehicle.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.vehicle.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.vehicle.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.vehicle.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.vehicle.getMaxFireTicks();
	}

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.vehicle.getNearbyEntities(arg0, arg1, arg2); 
	}

	@Override
	public Entity getPassenger() {
		return this.vehicle.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.vehicle.getServer();
	}

	@Override
	public int getTicksLived() {
		return this.vehicle.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.vehicle.getUniqueId();
	}

	@Override
	public World getWorld() {
		return this.vehicle.getWorld();
	}

	@Override
	public boolean isDead() {
		return this.vehicle.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.vehicle.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect arg0) {
		this.vehicle.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.vehicle.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.vehicle.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.vehicle.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.vehicle.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.vehicle.setPassenger(arg0); 
	}

	@Override
	public void setTicksLived(int arg0) {
		this.vehicle.setTicksLived(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.vehicle.teleport(arg0); 
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.vehicle.teleport(arg0); 
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.vehicle.teleport(arg0, arg1); 
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.vehicle.teleport(arg0, arg1); 
	}

}
