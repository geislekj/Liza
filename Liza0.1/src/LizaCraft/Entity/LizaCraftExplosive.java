/**
 * 
 */
package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Explosive;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaExplosive;

/**
 *  LizeCraftExplosive is the Liza entity representation of
 *  the Bukkit Explosive class.
 *  
 * @author geislekj
 */
public class LizaCraftExplosive implements LizaExplosive{

	private Explosive explosive;
	
	/**
	 * LizaCraftExplosive Constructor
	 * 
	 * @param explosive This is a Bukkit Explosive entity 
	 */
	public LizaCraftExplosive(Explosive explosive) {
		this.explosive = explosive;
	}

	@Override
	public float getYield() {
		return this.explosive.getYield();
	}

	@Override
	public boolean isIncendiary() {
		return this.explosive.isIncendiary();
	}

	@Override
	public void setIsIncendiary(boolean arg0) {
		this.explosive.setIsIncendiary(arg0);
	}

	@Override
	public void setYield(float arg0) {
		this.explosive.setYield(arg0);
	}

	@Override
	public boolean eject() {
		return this.explosive.eject();
	}

	@Override
	public int getEntityId() {
		return this.explosive.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.explosive.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.explosive.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.explosive.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.explosive.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.explosive.getMaxFireTicks();
	}

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.explosive.getNearbyEntities(arg0, arg1, arg2); 
	}

	@Override
	public Entity getPassenger() {
		return this.explosive.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.explosive.getServer();
	}

	@Override
	public int getTicksLived() {
		return this.explosive.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.explosive.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.explosive.getVelocity();
	}

	@Override
	public World getWorld() {
		return this.explosive.getWorld();
	}

	@Override
	public boolean isDead() {
		return this.explosive.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.explosive.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect arg0) {
		this.explosive.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.explosive.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.explosive.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.explosive.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.explosive.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.explosive.setPassenger(arg0); 
	}

	@Override
	public void setTicksLived(int arg0) {
		this.explosive.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.explosive.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.explosive.teleport(arg0); 
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.explosive.teleport(arg0); 
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.explosive.teleport(arg0, arg1); 
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.explosive.teleport(arg0, arg1); 
	}

}
