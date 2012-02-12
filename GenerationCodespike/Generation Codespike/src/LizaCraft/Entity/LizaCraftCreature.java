/**
 * 
 */
package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaCreature;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizeCraftCreature is the Liza entity representation of
 *  the Bukkit Creature class.
 *  
 *  @author geislekj
 */
public class LizaCraftCreature implements LizaCreature{

	private Creature creature;
	
	/**
	 * LizaCraftCreature Constructor
	 * 
	 * @param creature This is a Bukkit Creature 
	 */
	public LizaCraftCreature(Creature creature){
		this.creature = creature;
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.creature.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.creature.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.creature.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.creature.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.creature.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.creature.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.creature.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.creature.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.creature.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.creature.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.creature.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		return bl;
	}
	
	@Override
	@Deprecated
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.creature.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.creature.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.creature.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.creature.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.creature.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.creature.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.creature.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.creature.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.creature.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.creature.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.creature.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.creature.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.creature.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.creature.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.creature.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.creature.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.creature.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.creature.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.creature.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.creature.eject();
	}

	@Override
	public int getEntityId() {
		return this.creature.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.creature.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.creature.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.creature.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.creature.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.creature.getMaxFireTicks();
	}

	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 */
	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.creature.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.creature.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.creature.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.creature.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.creature.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.creature.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.creature.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.creature.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.creature.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.creature.playEffect(type);
	}

	@Override
	public void remove() {
		this.creature.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.creature.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.creature.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.creature.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.creature.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.creature.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.creature.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.creature.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.creature.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.creature.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.creature.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.creature.getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl;

		for(Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		lbl = (List) bl;
		
		return lbl;
	}
	
	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLineOfSight, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.creature.getLastTwoTargetBlocks(transparent,
				maxDistance);
		List<LizaBlock> lbl;

		for(Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		lbl = (List) bl;
		
		return lbl;
	}
	
	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 * @return The result of getNearbyEntities, but as LizaEntities.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		List<Entity> el = this.creature.getNearbyEntities(x, y, z);
		List<LizaEntity> lel;

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		lel = (List) el;
		
		return lel;
	}
}
