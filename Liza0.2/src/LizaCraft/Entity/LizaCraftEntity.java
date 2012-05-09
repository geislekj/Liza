package LizaCraft.Entity;

//Liza Imports
import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

//Java Imports
import java.util.List;
import java.util.UUID;

//Bukkit Imports
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;


/**
 *  LizeCraftEntity is the Liza entity representation of
 *  the Bukkit Entity class.
 *  
 *  @author geislekj
 */
public class LizaCraftEntity implements LizaEntity{
	protected Entity entity;
	
	/**
	 * LizaCraftEntity Constructor
	 * 
	 * @param entity This is a Bukkit Entity 
	 */
	public LizaCraftEntity(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public Entity getBukkitHandle() {
		return this.entity;
	}
	
	@Override
	public boolean eject() {
		return this.entity.eject();
	}

	@Override
	public int getEntityId() {
		return this.entity.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.entity.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.entity.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.entity.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.entity.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.entity.getMaxFireTicks();
	}

	@Override
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		// TODO;
		List<Entity> el = this.entity.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.entity.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.entity.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.entity.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.entity.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.entity.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.entity.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.entity.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.entity.isEmpty();
	}

	@Override
	public void remove() {
		this.entity.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.entity.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.entity.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.entity.setLastDamageCause(event);		
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.entity.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.entity.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.entity.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.entity.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.entity.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.entity.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.entity.teleport(destination, cause);
	}

	@Override
	public void playEffect(EntityEffect effect) {
		this.entity.playEffect(effect);		
	}

	@Override
	public EntityType getType() {
		return this.entity.getType();
	}

	@Override
	public LizaEntity getVehicle() {
		return new LizaCraftEntity(this.entity.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.entity.isInsideVehicle();
	}

	@Override
	public boolean leaveVehicle() {
		return this.entity.leaveVehicle();
	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		return this.entity.getMetadata(metadataKey);
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		return this.entity.hasMetadata(metadataKey);
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin ownedPlugin) {
		this.entity.removeMetadata(metadataKey, ownedPlugin);
	}

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		this.entity.setMetadata(metadataKey, newMetadataValue);
	}

}
