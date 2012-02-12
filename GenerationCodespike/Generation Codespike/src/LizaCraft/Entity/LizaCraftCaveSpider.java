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
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaCaveSpider;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftCaveSpider is the Liza entity representation of
 *  the Bukkit CaveSpider class.
 *  
 *  @author collinbc
 */
public class LizaCraftCaveSpider implements LizaCaveSpider {
	private CaveSpider caveSpider;
	
	/**
	 * LizaCraftCaveSpider Constructor
	 * 
	 * @param caveSpider A Bukkit CaveSpider
	 */
	public LizaCraftCaveSpider(CaveSpider caveSpider) {
		this.caveSpider = caveSpider;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.caveSpider.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.caveSpider.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.caveSpider.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.caveSpider.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.caveSpider.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.caveSpider.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.caveSpider.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.caveSpider.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.caveSpider.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.caveSpider.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.caveSpider.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.caveSpider.getLastTwoTargetBlocks(transparent,
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
		return this.caveSpider.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.caveSpider.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.caveSpider.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.caveSpider.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.caveSpider.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.caveSpider.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.caveSpider.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.caveSpider.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.caveSpider.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.caveSpider.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.caveSpider.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.caveSpider.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.caveSpider.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.caveSpider.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.caveSpider.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.caveSpider.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.caveSpider.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.caveSpider.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.caveSpider.eject();
	}

	@Override
	public int getEntityId() {
		return this.caveSpider.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.caveSpider.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.caveSpider.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.caveSpider.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.caveSpider.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.caveSpider.getMaxFireTicks();
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
		List<Entity> el = this.caveSpider.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.caveSpider.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.caveSpider.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.caveSpider.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.caveSpider.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.caveSpider.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.caveSpider.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.caveSpider.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.caveSpider.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.caveSpider.playEffect(type);
	}

	@Override
	public void remove() {
		this.caveSpider.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.caveSpider.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.caveSpider.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.caveSpider.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.caveSpider.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.caveSpider.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.caveSpider.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.caveSpider.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.caveSpider.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.caveSpider.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.caveSpider.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.caveSpider.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.caveSpider.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.caveSpider.getNearbyEntities(x, y, z);
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
