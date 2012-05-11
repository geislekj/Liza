package LizaCraft.Entity;

//Liza Imports
import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

//Java Imports
import java.util.ArrayList;
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
	
	/** The entity. */
	protected Entity entity;
	
	/**
	 * LizaCraftEntity Constructor.
	 *
	 * @param entity This is a Bukkit Entity
	 */
	public LizaCraftEntity(Entity entity){
		this.entity = entity;
	}
	
	/* (non-Javadoc)
	 * @see Liza.LizaEntity#getBukkitHandle()
	 */
	public Entity getBukkitHandle() {
		return this.entity;
	}
	
	/* (non-Javadoc)
	 * @see Liza.LizaEntity#getNearbyLizaEntities(double, double, double)
	 */
	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		List<Entity> el = this.getBukkitHandle().getNearbyEntities(x, y, z);
		List<LizaEntity> lel = new ArrayList<LizaEntity>();
		
		for(Entity e : el)
			lel.add(new LizaCraftEntity(e));
		
		return lel;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#eject()
	 */
	@Override
	public boolean eject() {
		return this.entity.eject();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getEntityId()
	 */
	@Override
	public int getEntityId() {
		return this.entity.getEntityId();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getFallDistance()
	 */
	@Override
	public float getFallDistance() {
		return this.entity.getFallDistance();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getFireTicks()
	 */
	@Override
	public int getFireTicks() {
		return this.entity.getFireTicks();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getLastDamageCause()
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.entity.getLastDamageCause();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getLocation()
	 */
	@Override
	public Location getLocation() {
		return this.entity.getLocation();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getMaxFireTicks()
	 */
	@Override
	public int getMaxFireTicks() {
		return this.entity.getMaxFireTicks();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getNearbyEntities(double, double, double)
	 */
	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		return this.entity.getNearbyEntities(x, y, z);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getPassenger()
	 */
	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.entity.getPassenger());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getServer()
	 */
	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.entity.getServer());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getTicksLived()
	 */
	@Override
	public int getTicksLived() {
		return this.entity.getTicksLived();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getUniqueId()
	 */
	@Override
	public UUID getUniqueId() {
		return this.entity.getUniqueId();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getVelocity()
	 */
	@Override
	public Vector getVelocity() {
		return this.entity.getVelocity();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getWorld()
	 */
	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.entity.getWorld());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#isDead()
	 */
	@Override
	public boolean isDead() {
		return this.entity.isDead();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return this.entity.isEmpty();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#remove()
	 */
	@Override
	public void remove() {
		this.entity.remove();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#setFallDistance(float)
	 */
	@Override
	public void setFallDistance(float distance) {
		this.entity.setFallDistance(distance);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#setFireTicks(int)
	 */
	@Override
	public void setFireTicks(int ticks) {
		this.entity.setFireTicks(ticks);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent)
	 */
	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.entity.setLastDamageCause(event);		
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#setPassenger(org.bukkit.entity.Entity)
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.entity.setPassenger(passenger);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#setTicksLived(int)
	 */
	@Override
	public void setTicksLived(int ticks) {
		this.entity.setTicksLived(ticks);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#setVelocity(org.bukkit.util.Vector)
	 */
	@Override
	public void setVelocity(Vector vel) {
		this.entity.setVelocity(vel);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#teleport(org.bukkit.Location)
	 */
	@Override
	public boolean teleport(Location location) {
		return this.entity.teleport(location);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#teleport(org.bukkit.entity.Entity)
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.entity.teleport(destination);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#teleport(org.bukkit.Location, org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.entity.teleport(location, cause);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#teleport(org.bukkit.entity.Entity, org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.entity.teleport(destination, cause);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#playEffect(org.bukkit.EntityEffect)
	 */
	@Override
	public void playEffect(EntityEffect effect) {
		this.entity.playEffect(effect);		
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getType()
	 */
	@Override
	public EntityType getType() {
		return this.entity.getType();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#getVehicle()
	 */
	@Override
	public LizaEntity getVehicle() {
		return new LizaCraftEntity(this.entity.getVehicle());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#isInsideVehicle()
	 */
	@Override
	public boolean isInsideVehicle() {
		return this.entity.isInsideVehicle();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Entity#leaveVehicle()
	 */
	@Override
	public boolean leaveVehicle() {
		return this.entity.leaveVehicle();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#getMetadata(java.lang.String)
	 */
	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		return this.entity.getMetadata(metadataKey);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#hasMetadata(java.lang.String)
	 */
	@Override
	public boolean hasMetadata(String metadataKey) {
		return this.entity.hasMetadata(metadataKey);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#removeMetadata(java.lang.String, org.bukkit.plugin.Plugin)
	 */
	@Override
	public void removeMetadata(String metadataKey, Plugin ownedPlugin) {
		this.entity.removeMetadata(metadataKey, ownedPlugin);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#setMetadata(java.lang.String, org.bukkit.metadata.MetadataValue)
	 */
	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		this.entity.setMetadata(metadataKey, newMetadataValue);
	}

}
