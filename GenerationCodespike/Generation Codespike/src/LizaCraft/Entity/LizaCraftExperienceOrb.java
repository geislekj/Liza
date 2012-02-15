package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaExperienceOrb;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftExperienceOrb is the Liza entity representation of
 *  the Bukkit ExperienceOrb class.
 *  
 *  @author collinbc
 */
public class LizaCraftExperienceOrb implements LizaExperienceOrb {
	private ExperienceOrb exp;
	
	/**
	 * LizaCraftExperienceOrb Constructor
	 * 
	 * @param exp This is a Bukkit ExperienceOrb 
	 */
	public LizaCraftExperienceOrb(ExperienceOrb exp) {
		this.exp = exp;
	}

	@Override
	public int getExperience() {
		return this.exp.getExperience();
	}

	@Override
	public void setExperience(int value) {
		this.exp.setExperience(value);
	}

	@Override
	public boolean eject() {
		return this.exp.eject();
	}

	@Override
	public int getEntityId() {
		return this.exp.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.exp.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.exp.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.exp.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.exp.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.exp.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.exp.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.exp.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.exp.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.exp.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.exp.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.exp.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.exp.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.exp.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.exp.isEmpty();
	}

	@Override
	public void remove() {
		this.exp.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.exp.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.exp.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.exp.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.exp.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.exp.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.exp.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.exp.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.exp.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.exp.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.exp.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.exp.playEffect(effect);		
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
		List<Entity> el = this.exp.getNearbyEntities(x, y, z);
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
