package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftEgg is the Liza entity representation of
 *  the Bukkit Egg class.
 *  
 *  @author collinbc
 */
public class LizaCraftEgg implements LizaEgg {
	private Egg egg;
	
	/**
	 * LizaCraftEgg Constructor
	 * 
	 * @param egg A Bukkit Egg
	 */
	public LizaCraftEgg(Egg egg) {
		this.egg = egg;
	}

	@Override
	public boolean doesBounce() {
		return this.egg.doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.egg.getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.egg.setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.egg.setShooter(shooter);
	}

	@Override
	public boolean eject() {
		return this.egg.eject();
	}

	@Override
	public int getEntityId() {
		return this.egg.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.egg.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.egg.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.egg.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.egg.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.egg.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.egg.getNearbyEntities(x, y, z);

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.egg.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.egg.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.egg.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.egg.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.egg.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.egg.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.egg.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.egg.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.egg.playEffect(type);
	}

	@Override
	public void remove() {
		this.egg.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.egg.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.egg.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent cause) {
		this.egg.setLastDamageCause(cause);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.egg.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.egg.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.egg.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.egg.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.egg.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.egg.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.egg.teleport(destination, cause);
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
		List<Entity> el = this.egg.getNearbyEntities(x, y, z);
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
