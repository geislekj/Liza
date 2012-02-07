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
import org.bukkit.entity.NPC;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaNPC;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftnpc is the Liza entity representation of
 *  the Bukkit npc class.
 *  
 *  @author collinbc
 */
public class LizaCraftNPC implements LizaNPC {
	private NPC npc;
	
	/**
	 * LizaCraftnpc Constructor
	 * 
	 * @param npc A Bukkit npc
	 */
	public LizaCraftNPC(NPC npc) {
		this.npc = npc;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.npc.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.npc.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.npc.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.npc.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.npc.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.npc.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.npc.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.npc.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.npc.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.npc.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.npc.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.npc.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.npc.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.npc.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.npc.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.npc.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.npc.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.npc.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.npc.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.npc.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.npc.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.npc.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.npc.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.npc.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.npc.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.npc.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.npc.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.npc.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.npc.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.npc.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.npc.eject();
	}

	@Override
	public int getEntityId() {
		return this.npc.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.npc.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.npc.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.npc.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.npc.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.npc.getMaxFireTicks();
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
		List<Entity> el = this.npc.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.npc.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.npc.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.npc.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.npc.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.npc.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.npc.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.npc.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.npc.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.npc.playEffect(type);
	}

	@Override
	public void remove() {
		this.npc.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.npc.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.npc.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.npc.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.npc.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.npc.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.npc.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.npc.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.npc.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.npc.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.npc.teleport(destination, cause);
	}

}
