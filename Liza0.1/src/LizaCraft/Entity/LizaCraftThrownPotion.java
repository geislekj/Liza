package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaThrownPotion;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftThrownPotion is the Liza entity representation of
 *  the Bukkit ThrownPotion class.
 *  
 * @author collinbc
 */
public class LizaCraftThrownPotion implements LizaThrownPotion {
	
	private ThrownPotion potion;

	/**
	 * LizaCraftThrownPotion Constructor
	 * 
	 * @param potion This is a Bukkit ThrownPotion entity 
	 */
	public LizaCraftThrownPotion(ThrownPotion potion) {
		this.potion = potion;
	}

	@Override
	public boolean doesBounce() {
		return this.potion.doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.potion.getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.potion.setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.potion.setShooter(shooter);
	}

	@Override
	public boolean eject() {
		return this.potion.eject();
	}

	@Override
	public int getEntityId() {
		return this.potion.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.potion.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.potion.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.potion.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.potion.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.potion.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.potion.getNearbyEntities(x, y, z);

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.potion.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.potion.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.potion.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.potion.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.potion.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.potion.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.potion.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.potion.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.potion.playEffect(type);
	}

	@Override
	public void remove() {
		this.potion.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.potion.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.potion.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent cause) {
		this.potion.setLastDamageCause(cause);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.potion.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.potion.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.potion.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.potion.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.potion.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.potion.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.potion.teleport(destination, cause);
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
		List<Entity> el = this.potion.getNearbyEntities(x, y, z);
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

