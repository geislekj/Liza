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
	private Entity entity;
	
	/**
	 * LizaCraftEntity Constructor
	 * 
	 * @param entity This is a Bukkit Entity 
	 */
	public LizaCraftEntity(Entity entity){
		this.entity = entity;
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

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.entity.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.entity.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.entity.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInsideVehicle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leaveVehicle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MetadataValue> getMetadata(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasMetadata(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeMetadata(String arg0, Plugin arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMetadata(String arg0, MetadataValue arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entity getBukkitEntity() {
		// TODO Auto-generated method stub
		return null;
	}

}
