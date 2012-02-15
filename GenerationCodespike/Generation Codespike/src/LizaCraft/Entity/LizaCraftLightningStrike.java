package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LightningStrike;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaLightningStrike;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizeCraftLightningStrike is the Liza entity representation of
 *  the Bukkit LightningStrike class.
 *  
 *  @author collinbc
 */
public class LizaCraftLightningStrike implements LizaLightningStrike {
	private LightningStrike strike;
	
	/**
	 * LizaCraftLightningStrike Constructor
	 * 
	 * @param strike This is a Bukkit LightningStrike 
	 */
	public LizaCraftLightningStrike(LightningStrike strike) {
		this.strike = strike;
	}

	@Override
	public boolean isEffect() {
		return this.strike.isEffect();
	}

	@Override
	public boolean eject() {
		return this.strike.eject();
	}

	@Override
	public int getEntityId() {
		return this.strike.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.strike.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.strike.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.strike.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.strike.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.strike.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.strike.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.strike.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.strike.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.strike.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.strike.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.strike.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.strike.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.strike.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.strike.isEmpty();
	}

	@Override
	public void remove() {
		this.strike.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.strike.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.strike.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.strike.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.strike.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.strike.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.strike.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.strike.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.strike.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.strike.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.strike.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.strike.playEffect(effect);		
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
		List<Entity> el = this.strike.getNearbyEntities(x, y, z);
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