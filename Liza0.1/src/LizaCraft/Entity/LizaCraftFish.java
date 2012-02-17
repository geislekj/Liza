package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fish;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaFish;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;


/**
 *  LizaCraftFish is the Liza entity representation of
 *  the Bukkit Fish class.
 *  
 * @author geislekj
 */
public class LizaCraftFish implements LizaFish{

	private Fish fish;

	/**
	 * LizaCraftFish Constructor
	 * 
	 * @param fish This is a Bukkit Fish entity 
	 */
	public LizaCraftFish(Fish fish) {
		this.fish = fish;
	}

	@Override
	public boolean doesBounce() {
		return this.fish.doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.fish.getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.fish.setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.fish.setShooter(shooter);
	}

	@Override
	public boolean eject() {
		return this.fish.eject();
	}

	@Override
	public int getEntityId() {
		return this.fish.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.fish.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.fish.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.fish.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.fish.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.fish.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.fish.getNearbyEntities(x, y, z);

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.fish.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.fish.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.fish.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.fish.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.fish.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.fish.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.fish.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.fish.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.fish.playEffect(type);
	}

	@Override
	public void remove() {
		this.fish.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.fish.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.fish.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent cause) {
		this.fish.setLastDamageCause(cause);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.fish.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.fish.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.fish.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.fish.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.fish.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.fish.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.fish.teleport(destination, cause);
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
		List<Entity> el = this.fish.getNearbyEntities(x, y, z);
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