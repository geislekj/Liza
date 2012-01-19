package LizaCraft.Entity;

//Liza Imports
import Liza.LizaEntity;

//Java Imports
import java.util.List;
import java.util.UUID;

//Bukkit Imports
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;


/**
 * @author geislekj
 *
 *  LizeCraftEntity is the Liza entity representation of
 *  the Bukkit entity class.
 */
public class LizaCraftEntity implements LizaEntity{
	private Entity entity;
	
	/**
	 * LizaCraftEntity Constructor
	 * 
	 * @param entity This is a Bukkit entity 
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
		return this.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.getFireTicks();
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
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.getNearbyEntities(arg0, arg1, arg2);
	}

	@Override
	public Entity getPassenger() {
		return this.entity.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.entity.getServer();
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
	public World getWorld() {
		return this.entity.getWorld();
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
	public void setFallDistance(float arg0) {
		this.entity.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.entity.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.entity.setLastDamageCause(arg0);		
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.entity.setPassenger(arg0);
	}

	@Override
	public void setTicksLived(int arg0) {
		this.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.entity.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.entity.teleport(arg0);
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.entity.teleport(arg0);
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.entity.teleport(arg0, arg1); 
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.entity.teleport(arg0, arg1); 
	}

}
