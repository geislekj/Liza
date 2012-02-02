package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fish;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaFish;


/**
 * @author geislekj
 *
 *  LizeCraftFish is the Liza entity representation of
 *  the Bukkit Fish class.
 */
public class LizaCraftFish implements LizaFish{

	private Fish fish;

	/**
	 * LizaCraftFish Constructor
	 * 
	 * @param fish This is a Bukkit fish entity 
	 */
	public LizaCraftFish(Fish fish) {
		this.fish = fish;
	}

	@Override
	public boolean doesBounce() {
		return this.fish.doesBounce();
	}

	@Override
	public LivingEntity getShooter() {
		return this.fish.getShooter();
	}

	@Override
	public void setBounce(boolean arg0) {
		this.fish.setBounce(arg0);
	}

	@Override
	public void setShooter(LivingEntity arg0) {
		this.fish.setShooter(arg0);
	}

	@Override
	public boolean eject() {
		return this.fish.eject();
	}

	@Override
	public int getEntityId() {
		return this.fish.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.fish.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.fish.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.fish.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.fish.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.fish.getMaxFireTicks();
	}

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.fish.getNearbyEntities(arg0, arg1, arg2); 
	}

	@Override
	public Entity getPassenger() {
		return this.fish.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.fish.getServer();
	}

	@Override
	public int getTicksLived() {
		return this.fish.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.fish.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.fish.getVelocity();
	}

	@Override
	public World getWorld() {
		return this.fish.getWorld();
	}

	@Override
	public boolean isDead() {
		return this.fish.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.fish.isEmpty();		
	}

	@Override
	public void playEffect(EntityEffect arg0) {
		this.fish.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.fish.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.fish.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.fish.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.fish.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.fish.setPassenger(arg0);
	}

	@Override
	public void setTicksLived(int arg0) {
		this.fish.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.fish.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.fish.teleport(arg0); 
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.fish.teleport(arg0); 
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.fish.teleport(arg0, arg1); 
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.fish.teleport(arg0, arg1); 
	}

}
