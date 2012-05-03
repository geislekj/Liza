package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Snowball;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftSnowball is the Liza entity representation of
 *  the Bukkit Snowball class.
 *  
 *  @author collinbc
 */
public class LizaCraftSnowball implements LizaSnowball {
	private Snowball snowball;
	
	/**
	 * LizaCraftSnowball Constructor
	 * 
	 * @param snowball A Bukkit Snowball
	 */
	public LizaCraftSnowball(Snowball snowball) {
		this.snowball = snowball;
	}

	@Override
	public boolean doesBounce() {
		return this.snowball.doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.snowball.getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.snowball.setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.snowball.setShooter(shooter);
	}

	@Override
	public boolean eject() {
		return this.snowball.eject();
	}

	@Override
	public int getEntityId() {
		return this.snowball.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.snowball.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.snowball.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.snowball.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.snowball.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.snowball.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.snowball.getNearbyEntities(x, y, z);

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.snowball.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.snowball.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.snowball.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.snowball.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.snowball.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.snowball.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.snowball.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.snowball.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.snowball.playEffect(type);
	}

	@Override
	public void remove() {
		this.snowball.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.snowball.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.snowball.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent cause) {
		this.snowball.setLastDamageCause(cause);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.snowball.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.snowball.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.snowball.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.snowball.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.snowball.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.snowball.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.snowball.teleport(destination, cause);
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
		List<Entity> el = this.snowball.getNearbyEntities(x, y, z);
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
