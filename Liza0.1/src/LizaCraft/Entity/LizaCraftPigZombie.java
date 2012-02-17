package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.PigZombie;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaPigZombie;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftPigZombie is the Liza entity representation of
 *  the Bukkit PigZombie class.
 *  
 *  @author collinbc
 */
public class LizaCraftPigZombie implements LizaPigZombie {
	private PigZombie zombiePigman;
	
	/**
	 * LizaCraftPigZombie Constructor
	 * 
	 * @param zombiePigman A Bukkit PigZombie
	 */
	public LizaCraftPigZombie(PigZombie zombiePigman) {
		this.zombiePigman = zombiePigman;
	}
	
	@Override
	public int getAnger() {
		return this.zombiePigman.getAnger();
	}

	@Override
	public boolean isAngry() {
		return this.zombiePigman.isAngry();
	}

	@Override
	public void setAnger(int level) {
		this.zombiePigman.setAnger(level);
	}

	@Override
	public void setAngry(boolean angry) {
		this.zombiePigman.setAngry(angry);
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.zombiePigman.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.zombiePigman.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.zombiePigman.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.zombiePigman.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.zombiePigman.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.zombiePigman.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.zombiePigman.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.zombiePigman.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.zombiePigman.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.zombiePigman.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.zombiePigman.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.zombiePigman.getLastTwoTargetBlocks(transparent,
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
		return this.zombiePigman.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.zombiePigman.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.zombiePigman.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.zombiePigman.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.zombiePigman.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.zombiePigman.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.zombiePigman.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.zombiePigman.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.zombiePigman.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.zombiePigman.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.zombiePigman.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.zombiePigman.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.zombiePigman.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.zombiePigman.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.zombiePigman.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.zombiePigman.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.zombiePigman.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.zombiePigman.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.zombiePigman.eject();
	}

	@Override
	public int getEntityId() {
		return this.zombiePigman.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.zombiePigman.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.zombiePigman.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.zombiePigman.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.zombiePigman.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.zombiePigman.getMaxFireTicks();
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
		List<Entity> el = this.zombiePigman.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.zombiePigman.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.zombiePigman.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.zombiePigman.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.zombiePigman.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.zombiePigman.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.zombiePigman.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.zombiePigman.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.zombiePigman.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.zombiePigman.playEffect(type);
	}

	@Override
	public void remove() {
		this.zombiePigman.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.zombiePigman.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.zombiePigman.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.zombiePigman.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.zombiePigman.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.zombiePigman.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.zombiePigman.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.zombiePigman.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.zombiePigman.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.zombiePigman.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.zombiePigman.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.zombiePigman.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.zombiePigman.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.zombiePigman.getNearbyEntities(x, y, z);
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
