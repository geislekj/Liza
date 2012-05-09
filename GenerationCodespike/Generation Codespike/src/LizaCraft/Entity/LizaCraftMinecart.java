package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Minecart;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaMinecart;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizeCraftMinecart is the Liza entity representation of
 *  the Bukkit Minecart class.
 *  
 *  @author collinbc
 */
public class LizaCraftMinecart implements LizaMinecart {
	private Minecart minecart;
	
	/**
	 * LizaCraftMinecart Constructor
	 * 
	 * @param minecart This is a Bukkit Minecart entity
	 */
	public LizaCraftMinecart(Minecart minecart) {
		this.minecart = minecart;
	}

	@Override
	public int getDamage() {
		return this.minecart.getDamage();
	}

	@Override
	public Vector getDerailedVelocityMod() {
		return this.minecart.getDerailedVelocityMod();
	}

	@Override
	public Vector getFlyingVelocityMod() {
		return this.minecart.getFlyingVelocityMod();
	}

	@Override
	public double getMaxSpeed() {
		return this.minecart.getMaxSpeed();
	}

	@Override
	public boolean isSlowWhenEmpty() {
		return this.minecart.isSlowWhenEmpty();
	}

	@Override
	public void setDamage(int damage) {
		this.minecart.setDamage(damage);
	}

	@Override
	public void setDerailedVelocityMod(Vector derailed) {
		this.minecart.setDerailedVelocityMod(derailed);
	}

	@Override
	public void setFlyingVelocityMod(Vector flying) {
		this.minecart.setFlyingVelocityMod(flying);
	}

	@Override
	public void setMaxSpeed(double speed) {
		this.minecart.setMaxSpeed(speed);
	}

	@Override
	public void setSlowWhenEmpty(boolean slow) {
		this.minecart.setSlowWhenEmpty(slow);
	}

	@Override
	public Vector getVelocity() {
		return this.minecart.getVelocity();
	}

	@Override
	public void setVelocity(Vector vel) {
		this.minecart.setVelocity(vel);
	}

	@Override
	public boolean eject() {
		return this.minecart.eject();
	}

	@Override
	public int getEntityId() {
		return this.minecart.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.minecart.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.minecart.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.minecart.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.minecart.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.minecart.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.minecart.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.minecart.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.minecart.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.minecart.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.minecart.getUniqueId();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.minecart.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.minecart.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.minecart.isEmpty();
	}

	@Override
	public void remove() {
		this.minecart.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.minecart.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.minecart.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.minecart.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.minecart.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.minecart.setTicksLived(ticks);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.minecart.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.minecart.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.minecart.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.minecart.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.minecart.playEffect(effect);		
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
		List<Entity> el = this.minecart.getNearbyEntities(x, y, z);
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
