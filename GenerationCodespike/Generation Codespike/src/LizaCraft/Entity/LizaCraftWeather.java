package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Weather;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaWeather;

/**
 * @author geislekj
 *
 *  LizeCraftWeather is the Liza entity representation of
 *  the Bukkit weather class.
 */
public class LizaCraftWeather implements LizaWeather{

	private Weather weather;

	/**
	 * LizaCraftWeather Constructor
	 * 
	 * @param weather This is a Bukkit weather entity 
	 */
	public LizaCraftWeather(Weather weather) {
		this.weather = weather;
	}

	@Override
	public boolean eject() {
		return this.weather.eject();
	}

	@Override
	public int getEntityId() {
		return this.weather.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.weather.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.weather.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.weather.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.weather.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.weather.getMaxFireTicks();
	}

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.weather.getNearbyEntities(arg0, arg1, arg2); 
	}

	@Override
	public Entity getPassenger() {
		return this.weather.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.weather.getServer();
	}

	@Override
	public int getTicksLived() {
		return this.weather.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.weather.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.weather.getVelocity();
	}

	@Override
	public World getWorld() {
		return this.weather.getWorld();
	}

	@Override
	public boolean isDead() {
		return this.weather.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.weather.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect arg0) {
		this.weather.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.weather.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.weather.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.weather.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.weather.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.weather.setPassenger(arg0); 
	}

	@Override
	public void setTicksLived(int arg0) {
		this.weather.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.weather.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.weather.teleport(arg0);	
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.weather.teleport(arg0); 
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.weather.teleport(arg0, arg1);	
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.weather.teleport(arg0, arg1); 
	}

}
