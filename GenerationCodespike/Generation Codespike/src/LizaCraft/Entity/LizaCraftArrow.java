package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;

/**
 * @author geislekj
 *
 *  LizeCraftArrow is the Liza entity representation of
 *  the Bukkit arrow class.
 */
public class LizaCraftArrow implements LizaArrow{

	private Arrow arrow;

	/**
	 * LizaCraftarrow Constructor
	 * 
	 * @param arrow This is a Bukkit arrow entity 
	 */
	public LizaCraftArrow(Arrow arrow){
		this.arrow = arrow;
	}

	@Override
	public boolean doesBounce() {
		return this.arrow.doesBounce();
	}

	@Override
	public LivingEntity getShooter() {
		return this.arrow.getShooter();
	}

	@Override
	public void setBounce(boolean arg0) {
		this.arrow.setBounce(arg0);
	}

	@Override
	public void setShooter(LivingEntity arg0) {
		this.arrow.setShooter(arg0);
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
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.arrow.getNearbyEntities(arg0, arg1, arg2); 
	}

	@Override
	public Entity getPassenger() {
		return this.arrow.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.arrow.getServer();
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
	public World getWorld() {
		return this.arrow.getWorld();
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
	public void playEffect(EntityEffect arg0) {
		this.arrow.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.arrow.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.arrow.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.arrow.setFallDistance(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.arrow.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.arrow.setPassenger(arg0); 
	}

	@Override
	public void setTicksLived(int arg0) {
		this.arrow.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.arrow.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.arrow.teleport(arg0); 
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.arrow.teleport(arg0); 
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.arrow.teleport(arg0, arg1); 
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.arrow.teleport(arg0, arg1); 
	}

}
