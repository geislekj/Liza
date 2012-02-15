package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.StorageMinecart;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.Inventory;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaStorageMinecart;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaStorageMinecart is the Liza entity representation of
 *  the Bukkit StorageMinecart class.
 *  
 *  @author collinbc
 */
public class LizaCraftStorageMinecart implements LizaStorageMinecart {
	private StorageMinecart sMinecart;
	
	/**
	 * LizaCraftStorageMinecart Constructor
	 * 
	 * @param sMinecart This is a Bukkit StorageMinecart entity
	 */
	public LizaCraftStorageMinecart(StorageMinecart sMinecart) {
		this.sMinecart = sMinecart;
	}

	/**
	 * TODO: Change once LizaInventory is implemented.
	 */
	@Override
	public Inventory getInventory() {
		return this.sMinecart.getInventory();
	}

	@Override
	public int getDamage() {
		return this.sMinecart.getDamage();
	}

	@Override
	public Vector getDerailedVelocityMod() {
		return this.sMinecart.getDerailedVelocityMod();
	}

	@Override
	public Vector getFlyingVelocityMod() {
		return this.sMinecart.getFlyingVelocityMod();
	}

	@Override
	public double getMaxSpeed() {
		return this.sMinecart.getMaxSpeed();
	}

	@Override
	public boolean isSlowWhenEmpty() {
		return this.sMinecart.isSlowWhenEmpty();
	}

	@Override
	public void setDamage(int damage) {
		this.sMinecart.setDamage(damage);
	}

	@Override
	public void setDerailedVelocityMod(Vector derailed) {
		this.sMinecart.setDerailedVelocityMod(derailed);
	}

	@Override
	public void setFlyingVelocityMod(Vector flying) {
		this.sMinecart.setFlyingVelocityMod(flying);
	}

	@Override
	public void setMaxSpeed(double speed) {
		this.sMinecart.setMaxSpeed(speed);
	}

	@Override
	public void setSlowWhenEmpty(boolean slow) {
		this.sMinecart.setSlowWhenEmpty(slow);
	}

	@Override
	public Vector getVelocity() {
		return this.sMinecart.getVelocity();
	}

	@Override
	public void setVelocity(Vector vel) {
		this.sMinecart.setVelocity(vel);
	}

	@Override
	public boolean eject() {
		return this.sMinecart.eject();
	}

	@Override
	public int getEntityId() {
		return this.sMinecart.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.sMinecart.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.sMinecart.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.sMinecart.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.sMinecart.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.sMinecart.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.sMinecart.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.sMinecart.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.sMinecart.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.sMinecart.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.sMinecart.getUniqueId();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.sMinecart.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.sMinecart.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.sMinecart.isEmpty();
	}

	@Override
	public void remove() {
		this.sMinecart.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.sMinecart.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.sMinecart.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.sMinecart.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.sMinecart.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.sMinecart.setTicksLived(ticks);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.sMinecart.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.sMinecart.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.sMinecart.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.sMinecart.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.sMinecart.playEffect(effect);		
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
		List<Entity> el = this.sMinecart.getNearbyEntities(x, y, z);
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
