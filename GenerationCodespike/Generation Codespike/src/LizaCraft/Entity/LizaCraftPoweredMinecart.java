package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.PoweredMinecart;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaPoweredMinecart;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizeCraftPoweredMinecart is the Liza entity representation of
 *  the Bukkit PoweredMinecart class.
 *  
 *  @author collinbc
 */
public class LizaCraftPoweredMinecart implements LizaPoweredMinecart {
	private PoweredMinecart pMinecart;
	
	/**
	 * LizaCraftPoweredMinecart Constructor
	 * 
	 * @param pMinecart This is a Bukkit PoweredMinecart entity
	 */
	public LizaCraftPoweredMinecart(PoweredMinecart pMinecart) {
		this.pMinecart = pMinecart;
	}
	
	@Override
	public int getDamage() {
		return this.pMinecart.getDamage();
	}

	@Override
	public Vector getDerailedVelocityMod() {
		return this.pMinecart.getDerailedVelocityMod();
	}

	@Override
	public Vector getFlyingVelocityMod() {
		return this.pMinecart.getFlyingVelocityMod();
	}

	@Override
	public double getMaxSpeed() {
		return this.pMinecart.getMaxSpeed();
	}

	@Override
	public boolean isSlowWhenEmpty() {
		return this.pMinecart.isSlowWhenEmpty();
	}

	@Override
	public void setDamage(int damage) {
		this.pMinecart.setDamage(damage);
	}

	@Override
	public void setDerailedVelocityMod(Vector derailed) {
		this.pMinecart.setDerailedVelocityMod(derailed);
	}

	@Override
	public void setFlyingVelocityMod(Vector flying) {
		this.pMinecart.setFlyingVelocityMod(flying);
	}

	@Override
	public void setMaxSpeed(double speed) {
		this.pMinecart.setMaxSpeed(speed);
	}

	@Override
	public void setSlowWhenEmpty(boolean slow) {
		this.pMinecart.setSlowWhenEmpty(slow);
	}

	@Override
	public Vector getVelocity() {
		return this.pMinecart.getVelocity();
	}

	@Override
	public void setVelocity(Vector vel) {
		this.pMinecart.setVelocity(vel);
	}

	@Override
	public boolean eject() {
		return this.pMinecart.eject();
	}

	@Override
	public int getEntityId() {
		return this.pMinecart.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.pMinecart.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.pMinecart.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.pMinecart.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.pMinecart.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.pMinecart.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.pMinecart.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.pMinecart.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.pMinecart.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.pMinecart.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.pMinecart.getUniqueId();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.pMinecart.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.pMinecart.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.pMinecart.isEmpty();
	}

	@Override
	public void remove() {
		this.pMinecart.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.pMinecart.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.pMinecart.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.pMinecart.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.pMinecart.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.pMinecart.setTicksLived(ticks);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.pMinecart.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.pMinecart.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.pMinecart.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.pMinecart.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.pMinecart.playEffect(effect);		
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
		List<Entity> el = this.pMinecart.getNearbyEntities(x, y, z);
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
