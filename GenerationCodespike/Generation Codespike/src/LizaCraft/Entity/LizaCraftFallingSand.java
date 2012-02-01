package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.FallingSand;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaFallingSand;


/**
 * @author geislekj
 *
 *  LizeCraftFallingSand is the Liza entity representation of
 *  the Bukkit FallingSand class.
 */
public class LizaCraftFallingSand implements LizaFallingSand{

	private FallingSand fallingSand;

	/**
	 * LizaCraftFallingSand Constructor
	 * 
	 * @param FallingSand This is a Bukkit FallingSand entity 
	 */
	public LizaCraftFallingSand(FallingSand fallingSand) {
		this.fallingSand = fallingSand;
	}

	@Override
	public boolean eject() {
		return this.fallingSand.eject();
	}

	@Override
	public int getEntityId() {
		return this.fallingSand.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.fallingSand.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.fallingSand.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.fallingSand.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.fallingSand.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.fallingSand.getMaxFireTicks();
	}

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.fallingSand.getNearbyEntities(arg0, arg1, arg2); 
	}

	@Override
	public Entity getPassenger() {
		return this.fallingSand.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.fallingSand.getServer();
	}

	@Override
	public int getTicksLived() {
		return this.fallingSand.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.fallingSand.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.fallingSand.getVelocity();
	}

	@Override
	public World getWorld() {
		return this.fallingSand.getWorld();
	}

	@Override
	public boolean isDead() {
		return this.fallingSand.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.fallingSand.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect arg0) {
		this.fallingSand.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.fallingSand.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.fallingSand.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.fallingSand.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.fallingSand.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.fallingSand.setPassenger(arg0); 
	}

	@Override
	public void setTicksLived(int arg0) {
		this.fallingSand.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.fallingSand.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.fallingSand.teleport(arg0); 
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.fallingSand.teleport(arg0);
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.fallingSand.teleport(arg0, arg1);	
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.fallingSand.teleport(arg0, arg1); 
	}

}
