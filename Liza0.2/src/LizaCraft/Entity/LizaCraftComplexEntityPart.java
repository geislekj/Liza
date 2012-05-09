package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import Liza.LizaComplexEntityPart;
import Liza.LizaComplexLivingEntity;
import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftComplexEntityPart is the Liza entity representation of
 *  the Bukkit ComplexEntityPart class.
 *  
 *  @author collinbc
 */
public class LizaCraftComplexEntityPart implements LizaComplexEntityPart{
	private ComplexEntityPart part;
	
	/**
	 * LizaCraftComplexEntityPart Constructor
	 * 
	 * @param part A Bukkit ComplexEntityPart
	 */
	public LizaCraftComplexEntityPart(ComplexEntityPart part) {
		this.part = part;
	}

	@Override
	public LizaComplexLivingEntity getParent() {
		return new LizaCraftComplexLivingEntity(this.part.getParent());
	}

	@Override
	public boolean eject() {
		return this.part.eject();
	}

	@Override
	public int getEntityId() {
		return this.part.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.part.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.part.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.part.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.part.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.part.getMaxFireTicks();
	}

	@Override
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.part.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.part.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.part.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.part.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.part.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.part.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.part.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.part.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.part.isEmpty();
	}

	@Override
	public void remove() {
		this.part.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.part.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.part.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.part.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.part.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.part.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.part.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.part.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.part.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.part.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.part.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.part.playEffect(effect);		
	}

	@Override
	public EntityType getType() {
		return this.part.getType();
	}

	@Override
	public Entity getVehicle() {
		return this.part.getVehicle();
	}

	@Override
	public boolean isInsideVehicle() {
		return this.part.isInsideVehicle();
	}

	@Override
	public boolean leaveVehicle() {
		return this.part.leaveVehicle();
	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		return this.part.getMetadata(metadataKey);
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		return this.part.hasMetadata(metadataKey);
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin plugin) {
		this.removeMetadata(metadataKey, plugin);
	}

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		this.part.setMetadata(metadataKey, newMetadataValue);
	}

}
