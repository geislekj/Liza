package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Giant;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaGiant;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftGiant is the Liza entity representation of
 *  the Bukkit Giant class.
 *  
 *  @author collinbc
 */
public class LizaCraftGiant implements LizaGiant {
	private Giant giant;
	
	/**
	 * LizaCraftGiant Constructor
	 * 
	 * @param giant A Bukkit Giant
	 */
	public LizaCraftGiant(Giant giant){
		this.giant = giant;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.giant.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.giant.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.giant.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.giant.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.giant.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.giant.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.giant.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.giant.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.giant.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.giant.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.giant.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.giant.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.giant.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.giant.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.giant.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.giant.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.giant.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.giant.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.giant.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.giant.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.giant.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.giant.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.giant.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.giant.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.giant.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.giant.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.giant.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.giant.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.giant.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.giant.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.giant.eject();
	}

	@Override
	public int getEntityId() {
		return this.giant.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.giant.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.giant.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.giant.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.giant.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.giant.getMaxFireTicks();
	}

	/**
	 * TODO: A method may be needed that will return type List<LizaEntity>.
	 * 
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 */
	@Override
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.giant.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.giant.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.giant.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.giant.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.giant.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.giant.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.giant.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.giant.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.giant.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.giant.playEffect(type);
	}

	@Override
	public void remove() {
		this.giant.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.giant.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.giant.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.giant.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.giant.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.giant.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.giant.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.giant.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.giant.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.giant.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.giant.teleport(destination, cause);
	}

}
