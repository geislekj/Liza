package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaFireball;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftFireball is the Liza entity representation of
 *  the Bukkit Fireball class.
 *  
 * @author collinbc
 */
public class LizaCraftFireball implements LizaFireball {
	
	private Fireball fireball;

	/**
	 * LizaCraftFireball Constructor
	 * 
	 * @param fireball This is a Bukkit Fireball entity 
	 */
	public LizaCraftFireball(Fireball fireball) {
		this.fireball = fireball;
	}
	
	@Override
	public Vector getDirection() {
		return this.fireball.getDirection();
	}

	@Override
	public void setDirection(Vector direction) {
		this.fireball.setDirection(direction);
	}

	@Override
	public boolean doesBounce() {
		return this.fireball.doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.fireball.getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.fireball.setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.fireball.setShooter(shooter);
	}

	@Override
	public boolean eject() {
		return this.fireball.eject();
	}

	@Override
	public int getEntityId() {
		return this.fireball.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.fireball.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.fireball.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.fireball.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.fireball.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.fireball.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.fireball.getNearbyEntities(x, y, z);

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.fireball.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.fireball.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.fireball.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.fireball.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.fireball.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.fireball.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.fireball.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.fireball.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.fireball.playEffect(type);
	}

	@Override
	public void remove() {
		this.fireball.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.fireball.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.fireball.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent cause) {
		this.fireball.setLastDamageCause(cause);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.fireball.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.fireball.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.fireball.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.fireball.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.fireball.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.fireball.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.fireball.teleport(destination, cause);
	}

	@Override
	public float getYield() {
		return this.fireball.getYield();
	}

	@Override
	public boolean isIncendiary() {
		return this.fireball.isIncendiary();
	}

	@Override
	public void setIsIncendiary(boolean isIncendiary) {
		this.fireball.setIsIncendiary(isIncendiary);
	}

	@Override
	public void setYield(float yield) {
		this.fireball.setYield(yield);
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
		List<Entity> el = this.fireball.getNearbyEntities(x, y, z);
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

