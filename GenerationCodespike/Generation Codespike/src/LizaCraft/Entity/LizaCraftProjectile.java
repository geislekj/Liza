/**
 * 
 */
package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaProjectile;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizeCraftProjectile is the Liza entity representation of
 *  the Bukkit Projectile class.
 *  
 * @author geislekj
 */
public class LizaCraftProjectile implements LizaProjectile{
	private Projectile projectile;
	
	/**
	 * LizaCraftProjectile Constructor
	 * 
	 * @param projectile This is a Bukkit Projectile
	 */
	public LizaCraftProjectile(Projectile projectile){
		this.projectile = projectile;
	}

	@Override
	public boolean doesBounce() {
		return this.projectile.doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.projectile.getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.projectile.setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.projectile.setShooter(shooter);
	}

	@Override
	public boolean eject() {
		return this.projectile.eject();
	}

	@Override
	public int getEntityId() {
		return this.projectile.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.projectile.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.projectile.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.projectile.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.projectile.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.projectile.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.projectile.getNearbyEntities(x, y, z);

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.projectile.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.projectile.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.projectile.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.projectile.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.projectile.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.projectile.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.projectile.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.projectile.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.projectile.playEffect(type);
	}

	@Override
	public void remove() {
		this.projectile.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.projectile.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.projectile.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent cause) {
		this.projectile.setLastDamageCause(cause);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.projectile.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.projectile.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.projectile.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.projectile.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.projectile.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.projectile.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.projectile.teleport(destination, cause);
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
		List<Entity> el = this.projectile.getNearbyEntities(x, y, z);
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