package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEnderPearl;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftEnderPearl is the Liza entity representation of
 *  the Bukkit EnderPearl class.
 *  
 * @author collinbc
 */
public class LizaCraftEnderPearl implements LizaEnderPearl {

	private EnderPearl pearl;

	/**
	 * LizaCraftEnderPearl Constructor
	 * 
	 * @param pearl This is a Bukkit EnderPearl entity 
	 */
	public LizaCraftEnderPearl(EnderPearl pearl) {
		this.pearl = pearl;
	}

	@Override
	public boolean doesBounce() {
		return this.pearl.doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.pearl.getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.pearl.setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.pearl.setShooter(shooter);
	}

	@Override
	public boolean eject() {
		return this.pearl.eject();
	}

	@Override
	public int getEntityId() {
		return this.pearl.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.pearl.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.pearl.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.pearl.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.pearl.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.pearl.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.pearl.getNearbyEntities(x, y, z);

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.pearl.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.pearl.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.pearl.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.pearl.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.pearl.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.pearl.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.pearl.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.pearl.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.pearl.playEffect(type);
	}

	@Override
	public void remove() {
		this.pearl.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.pearl.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.pearl.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent cause) {
		this.pearl.setLastDamageCause(cause);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.pearl.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.pearl.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.pearl.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.pearl.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.pearl.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.pearl.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.pearl.teleport(destination, cause);
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
		List<Entity> el = this.pearl.getNearbyEntities(x, y, z);
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

