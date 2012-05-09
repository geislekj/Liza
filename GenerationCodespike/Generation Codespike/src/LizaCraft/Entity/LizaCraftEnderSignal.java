package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.EnderSignal;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEnderSignal;
import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftEnderSignal is the Liza entity representation of
 *  the Bukkit EnderSignal class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderSignal implements LizaEnderSignal {
	private EnderSignal signal;
	
	/**
	 * LizaCraftEnderSignal Constructor
	 * 
	 * @param signal This is a Bukkit EnderSignal 
	 */
	public LizaCraftEnderSignal(EnderSignal signal) {
		this.signal = signal;
	}

	@Override
	public boolean eject() {
		return this.signal.eject();
	}

	@Override
	public int getEntityId() {
		return this.signal.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.signal.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.signal.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.signal.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.signal.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.signal.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.signal.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.signal.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.signal.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.signal.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.signal.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.signal.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.signal.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.signal.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.signal.isEmpty();
	}

	@Override
	public void remove() {
		this.signal.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.signal.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.signal.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.signal.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.signal.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.signal.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.signal.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.signal.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.signal.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.signal.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.signal.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.signal.playEffect(effect);		
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
		List<Entity> el = this.signal.getNearbyEntities(x, y, z);
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