/**
 * 
 */
package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaProjectile;

/**
 * @author geislekj
 *
 *  LizeCraftProjectile is the Liza entity representation of
 *  the Bukkit Projectile class.
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
	public LivingEntity getShooter() {
		return this.projectile.getShooter();
	}

	@Override
	public void setBounce(boolean arg0) {
		this.projectile.setBounce(arg0);
	}

	@Override
	public void setShooter(LivingEntity arg0) {
		this.projectile.setShooter(arg0);
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
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.projectile.getNearbyEntities(arg0, arg1, arg2); 
	}

	@Override
	public Entity getPassenger() {
		return this.projectile.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.projectile.getServer();
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
	public World getWorld() {
		return this.projectile.getWorld();
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
	public void playEffect(EntityEffect arg0) {
		this.projectile.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.projectile.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.projectile.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.projectile.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.projectile.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.projectile.setPassenger(arg0);
	}

	@Override
	public void setTicksLived(int arg0) {
		this.projectile.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.projectile.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.projectile.teleport(arg0); 
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.projectile.teleport(arg0); 
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.projectile.teleport(arg0, arg1); 
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.projectile.teleport(arg0, arg1); 
	}
	
	
}
