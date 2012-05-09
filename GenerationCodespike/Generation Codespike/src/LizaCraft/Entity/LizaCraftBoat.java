package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaBoat;
import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizeCraftBoat is the Liza entity representation of
 *  the Bukkit Boat class.
 *  
 *  @author collinbc
 */
public class LizaCraftBoat implements LizaBoat {
	private Boat boat;
	
	/**
	 * LizaCraftBoat Constructor
	 * 
	 * @param boat This is a Bukkit Boat entity
	 */
	public LizaCraftBoat(Boat boat) {
		this.boat = boat;
	}

	@Override
	public double getMaxSpeed() {
		return this.boat.getMaxSpeed();
	}

	@Override
	public double getOccupiedDeceleration() {
		return this.boat.getOccupiedDeceleration();
	}

	@Override
	public double getUnoccupiedDeceleration() {
		return this.boat.getUnoccupiedDeceleration();
	}

	@Override
	public boolean getWorkOnLand() {
		return this.boat.getWorkOnLand();
	}

	@Override
	public void setMaxSpeed(double speed) {
		this.boat.setMaxSpeed(speed);
	}

	@Override
	public void setOccupiedDeceleration(double rate) {
		this.boat.setOccupiedDeceleration(rate);
	}

	@Override
	public void setUnoccupiedDeceleration(double rate) {
		this.boat.setOccupiedDeceleration(rate);
	}

	@Override
	public void setWorkOnLand(boolean workOnLand) {
		this.boat.setWorkOnLand(workOnLand);
	}

	@Override
	public Vector getVelocity() {
		return this.boat.getVelocity();
	}

	@Override
	public void setVelocity(Vector vel) {
		this.boat.setVelocity(vel);
	}

	@Override
	public boolean eject() {
		return this.boat.eject();
	}

	@Override
	public int getEntityId() {
		return this.boat.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.boat.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.boat.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.boat.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.boat.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.boat.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.boat.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.boat.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.boat.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.boat.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.boat.getUniqueId();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.boat.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.boat.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.boat.isEmpty();
	}

	@Override
	public void remove() {
		this.boat.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.boat.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.boat.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.boat.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.boat.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.boat.setTicksLived(ticks);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.boat.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.boat.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.boat.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.boat.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.boat.playEffect(effect);		
	}
	
	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 * @return The result of getNearbyEntities, but as LizaEntities.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		List<Entity> el = this.boat.getNearbyEntities(x, y, z);
		List<LizaEntity> lel;

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		lel = (List) el;
		
		return lel;
	}
}