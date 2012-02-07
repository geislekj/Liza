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
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaSquid;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftSquid is the Liza entity representation of
 *  the Bukkit Squid class.
 *  
 *  @author collinbc
 */
public class LizaCraftSquid implements LizaSquid {
	private Squid squid;
	
	/**
	 * LizaCraftSquid Constructor
	 * 
	 * @param squid A Bukkit Squid
	 */
	public LizaCraftSquid(Squid squid) {
		this.squid = squid;
	}
	
	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.squid.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.squid.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.squid.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.squid.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.squid.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.squid.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.squid.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.squid.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.squid.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.squid.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.squid.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.squid.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.squid.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.squid.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.squid.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.squid.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.squid.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.squid.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.squid.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.squid.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.squid.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.squid.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.squid.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.squid.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.squid.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.squid.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.squid.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.squid.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.squid.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.squid.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.squid.eject();
	}

	@Override
	public int getEntityId() {
		return this.squid.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.squid.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.squid.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.squid.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.squid.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.squid.getMaxFireTicks();
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
		List<Entity> el = this.squid.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.squid.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.squid.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.squid.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.squid.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.squid.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.squid.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.squid.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.squid.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.squid.playEffect(type);
	}

	@Override
	public void remove() {
		this.squid.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.squid.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.squid.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.squid.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.squid.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.squid.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.squid.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.squid.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.squid.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.squid.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.squid.teleport(destination, cause);
	}

}
