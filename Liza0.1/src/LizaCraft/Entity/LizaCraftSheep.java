package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.DyeColor;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftSheep;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
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
import Liza.LizaSheep;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftSheep is the Liza entity representation of
 *  the Bukkit CraftSheep class.
 *  
 * @author collinbc
 */
public class LizaCraftSheep implements LizaSheep {
	private CraftSheep sheep;

	/**
	 * LizaCraftSheep Constructor
	 * 
	 * @param sheep A Bukkit Sheep
	 */
	public LizaCraftSheep(CraftSheep sheep) {
		this.sheep = sheep;
	}

	@Override
	public boolean isSheared() {
		return this.sheep.isSheared();
	}

	@Override
	public void setSheared(boolean flag) {
		this.sheep.setSheared(flag);
	}

	@Override
	public boolean canBreed() {
		return this.sheep.canBreed();
	}

	@Override
	public int getAge() {
		return this.sheep.getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.sheep.getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.sheep.isAdult();
	}

	@Override
	public void setAdult() {
		this.sheep.setAdult();
	}

	@Override
	public void setAge(int age) {
		this.sheep.setAge(age);
	}

	@Override
	public void setAgeLock(boolean lock) {
		this.sheep.setAgeLock(lock);
	}

	@Override
	public void setBaby() {
		this.sheep.setBaby();
	}

	@Override
	public void setBreed(boolean breed) {
		this.sheep.setBreed(breed);
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.sheep.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.sheep.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.sheep.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.sheep.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.sheep.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.sheep.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.sheep.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.sheep.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.sheep.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.sheep.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.sheep.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.sheep.getLastTwoTargetBlocks(transparent,
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
		return this.sheep.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.sheep.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.sheep.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.sheep.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.sheep.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.sheep.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.sheep.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.sheep.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.sheep.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.sheep.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.sheep.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.sheep.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.sheep.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.sheep.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.sheep.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.sheep.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.sheep.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.sheep.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.sheep.eject();
	}

	@Override
	public int getEntityId() {
		return this.sheep.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.sheep.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.sheep.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.sheep.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.sheep.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.sheep.getMaxFireTicks();
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
		List<Entity> el = this.sheep.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.sheep.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.sheep.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.sheep.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.sheep.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.sheep.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.sheep.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.sheep.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.sheep.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.sheep.playEffect(type);
	}

	@Override
	public void remove() {
		this.sheep.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.sheep.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.sheep.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.sheep.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.sheep.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.sheep.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.sheep.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.sheep.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.sheep.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.sheep.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.sheep.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.sheep.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.sheep.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.sheep.getNearbyEntities(x, y, z);
		List<LizaEntity> lel;

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		lel = (List) el;
		
		return lel;
	}

	@Override
	public DyeColor getColor() {
		return this.sheep.getColor();
	}

	@Override
	public void setColor(DyeColor color) {
		this.sheep.setColor(color);
	}

}
