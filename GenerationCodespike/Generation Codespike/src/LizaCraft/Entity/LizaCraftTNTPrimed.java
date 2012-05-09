package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaTNTPrimed;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftTNTPrimed is the Liza entity representation of
 *  the Bukkit TNTPrimed class.
 *  
 *  @author collinbc
 */
public class LizaCraftTNTPrimed implements LizaTNTPrimed {
	private TNTPrimed tnt;
	
	/**
	 * LizaCraftTNTPrimed Constructor
	 * 
	 * @param entity This is a Bukkit TNTPrimed 
	 */
	public LizaCraftTNTPrimed(TNTPrimed tnt) {
		this.tnt = tnt;
	}

	@Override
	public int getFuseTicks() {
		return this.tnt.getFuseTicks();
	}

	@Override
	public void setFuseTicks(int ticks) {
		this.setFuseTicks(ticks);
	}

	@Override
	public float getYield() {
		return this.tnt.getYield();
	}

	@Override
	public boolean isIncendiary() {
		return this.tnt.isIncendiary();
	}

	@Override
	public void setIsIncendiary(boolean isIncindiary) {
		this.setIsIncendiary(isIncindiary);
	}

	@Override
	public void setYield(float yield) {
		this.tnt.setYield(yield);
	}

	@Override
	public boolean eject() {
		return this.tnt.eject();
	}

	@Override
	public int getEntityId() {
		return this.tnt.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.tnt.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.tnt.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.tnt.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.tnt.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.tnt.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.tnt.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.tnt.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.tnt.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.tnt.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.tnt.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.tnt.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.tnt.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.tnt.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.tnt.isEmpty();
	}

	@Override
	public void remove() {
		this.tnt.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.tnt.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.tnt.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.tnt.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.tnt.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.tnt.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.tnt.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.tnt.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.tnt.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.tnt.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.tnt.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.tnt.playEffect(effect);		
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
		List<Entity> el = this.tnt.getNearbyEntities(x, y, z);
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
