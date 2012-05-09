package LizaCraft.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizeCraftArrow is the Liza entity representation of
 *  the Bukkit Arrow class.
 *  
 * @author geislekj
 */
public class LizaCraftArrow implements LizaArrow{

	private Arrow arrow;

	/**
	 * LizaCraftArrow Constructor
	 * 
	 * @param arrow This is a Bukkit Arrow entity 
	 */
	public LizaCraftArrow(Arrow arrow){
		this.arrow = arrow;
	}

	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		List<Entity> el = this.arrow.getNearbyEntities(x, y, z);
		List<LizaEntity> lel = new ArrayList<LizaEntity>();

		for(Entity e : el) {
			lel.add(new LizaCraftEntity(e));
		}
		
		return lel;
	}

	@Override
	public boolean doesBounce() {
		return this.arrow.doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.arrow.getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.arrow.setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.arrow.setShooter(shooter);
	}

	@Override
	public boolean eject() {
		return this.arrow.eject();
	}

	@Override
	public int getEntityId() {
		return this.arrow.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.arrow.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.arrow.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.arrow.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.arrow.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.arrow.getMaxFireTicks();
	}

	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.arrow.getNearbyEntities(x, y, z);

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.arrow.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.arrow.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.arrow.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.arrow.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.arrow.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.arrow.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.arrow.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.arrow.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.arrow.playEffect(type);
	}

	@Override
	public void remove() {
		this.arrow.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.arrow.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.arrow.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent cause) {
		this.arrow.setLastDamageCause(cause);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.arrow.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.arrow.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.arrow.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.arrow.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.arrow.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.arrow.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.arrow.teleport(destination, cause);
	}

	@Override
	public EntityType getType() {
		return this.arrow.getType();
	}

	@Override
	public LizaEntity getVehicle() {
		return new LizaCraftEntity(this.arrow.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.arrow.isInsideVehicle();
	}

	@Override
	public boolean leaveVehicle() {
		return this.arrow.leaveVehicle();
	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		return this.arrow.getMetadata(metadataKey);
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		return this.arrow.hasMetadata(metadataKey);
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin plugin) {
		this.arrow.removeMetadata(metadataKey, plugin);
	}

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue ) {
		this.arrow.setMetadata(metadataKey, newMetadataValue);
	}
}