package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.SmallFireball;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaSmallFireball;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftSmallFireball is the Liza entity representation of
 *  the Bukkit SmallFireball class.
 *  
 * @author collinbc
 */
public class LizaCraftSmallFireball implements LizaSmallFireball {
	
	private SmallFireball smallFireball;

	/**
	 * LizaCraftSmallFireball Constructor
	 * 
	 * @param smallFireball This is a Bukkit SmallFireball entity 
	 */
	public LizaCraftSmallFireball(SmallFireball smallFireball) {
		this.smallFireball = smallFireball;
	}

	@Override
	public Vector getDirection() {
		return this.smallFireball.getDirection();
	}

	@Override
	public void setDirection(Vector direction) {
		this.smallFireball.setDirection(direction);
	}

	@Override
	public boolean doesBounce() {
		return this.smallFireball.doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.smallFireball.getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.smallFireball.setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.smallFireball.setShooter(shooter);
	}

	@Override
	public boolean eject() {
		return this.smallFireball.eject();
	}

	@Override
	public int getEntityId() {
		return this.smallFireball.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.smallFireball.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.smallFireball.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.smallFireball.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.smallFireball.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.smallFireball.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.smallFireball.getNearbyEntities(x, y, z);

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.smallFireball.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.smallFireball.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.smallFireball.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.smallFireball.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.smallFireball.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.smallFireball.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.smallFireball.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.smallFireball.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.smallFireball.playEffect(type);
	}

	@Override
	public void remove() {
		this.smallFireball.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.smallFireball.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.smallFireball.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent cause) {
		this.smallFireball.setLastDamageCause(cause);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.smallFireball.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.smallFireball.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.smallFireball.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.smallFireball.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.smallFireball.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.smallFireball.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.smallFireball.teleport(destination, cause);
	}

	@Override
	public float getYield() {
		return this.smallFireball.getYield();
	}

	@Override
	public boolean isIncendiary() {
		return this.smallFireball.isIncendiary();
	}

	@Override
	public void setIsIncendiary(boolean isIncendiary) {
		this.smallFireball.setIsIncendiary(isIncendiary);
	}

	@Override
	public void setYield(float yield) {
		this.smallFireball.setYield(yield);
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
		List<Entity> el = this.smallFireball.getNearbyEntities(x, y, z);
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

