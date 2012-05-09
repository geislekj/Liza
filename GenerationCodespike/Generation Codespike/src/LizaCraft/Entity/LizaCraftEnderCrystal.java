package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.EnderCrystal;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEnderCrystal;
import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftEnderCrystal is the Liza entity representation of
 *  the Bukkit EnderCrystal class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderCrystal implements LizaEnderCrystal {
	private EnderCrystal crystal;
	
	/**
	 * LizaCraftEnderCrystal Constructor
	 * 
	 * @param crystal This is a Bukkit EnderCrystal 
	 */
	public LizaCraftEnderCrystal(EnderCrystal crystal) {
		this.crystal = crystal;
	}

	@Override
	public boolean eject() {
		return this.crystal.eject();
	}

	@Override
	public int getEntityId() {
		return this.crystal.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.crystal.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.crystal.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.crystal.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.crystal.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.crystal.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.crystal.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.crystal.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.crystal.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.crystal.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.crystal.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.crystal.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.crystal.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.crystal.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.crystal.isEmpty();
	}

	@Override
	public void remove() {
		this.crystal.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.crystal.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.crystal.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.crystal.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.crystal.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.crystal.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.crystal.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.crystal.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.crystal.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.crystal.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.crystal.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.crystal.playEffect(effect);		
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
		List<Entity> el = this.crystal.getNearbyEntities(x, y, z);
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