package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaVillager;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftVillager is the Liza entity representation of
 *  the Bukkit Villager class.
 *  
 *  @author collinbc
 */
public class LizaCraftVillager implements LizaVillager {
	private Villager villager;
	
	/**
	 * LizaCraftVillager Constructor
	 * 
	 * @param villager A Bukkit Villager
	 */
	public LizaCraftVillager(Villager villager) {
		this.villager = villager;
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.villager.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.villager.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.villager.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.villager.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.villager.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.villager.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.villager.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.villager.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.villager.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.villager.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.villager.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.villager.getLastTwoTargetBlocks(transparent,
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
		return this.villager.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.villager.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.villager.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.villager.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.villager.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.villager.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.villager.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.villager.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.villager.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.villager.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.villager.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.villager.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.villager.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.villager.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.villager.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.villager.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.villager.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.villager.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.villager.eject();
	}

	@Override
	public int getEntityId() {
		return this.villager.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.villager.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.villager.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.villager.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.villager.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.villager.getMaxFireTicks();
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
		List<Entity> el = this.villager.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.villager.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.villager.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.villager.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.villager.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.villager.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.villager.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.villager.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.villager.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.villager.playEffect(type);
	}

	@Override
	public void remove() {
		this.villager.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.villager.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.villager.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.villager.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.villager.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.villager.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.villager.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.villager.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.villager.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.villager.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.villager.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.villager.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.villager.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.villager.getNearbyEntities(x, y, z);
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
