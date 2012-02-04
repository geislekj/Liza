package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaAnimals;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 * @author collinbc
 *
 *  LizaCraftAnimals is the Liza Entity representation of
 *  the Bukkit CraftAnimals class.
 */
public class LizaCraftAnimals implements LizaAnimals {
	private Animals animal;
	
	public LizaCraftAnimals(Animals animal) {
		this.animal = animal;
	}

	@Override
	public boolean canBreed() {
		return this.animal.canBreed();
	}

	@Override
	public int getAge() {
		return this.animal.getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.animal.getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.animal.isAdult();
	}

	@Override
	public void setAdult() {
		this.animal.setAdult();
	}

	@Override
	public void setAge(int arg0) {
		this.animal.setAge(arg0);
	}

	@Override
	public void setAgeLock(boolean arg0) {
		this.animal.setAgeLock(arg0);
	}

	@Override
	public void setBaby() {
		this.animal.setBaby();
	}

	@Override
	public void setBreed(boolean arg0) {
		this.animal.setBreed(arg0);
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.animal.getTarget());
	}

	@Override
	public void setTarget(LivingEntity arg0) {
		this.animal.setTarget(arg0);
	}

	@Override
	public void damage(int arg0) {
		this.animal.damage(arg0);
	}

	@Override
	public void damage(int arg0, Entity arg1) {
		this.animal.damage(arg0, arg1);
	}

	@Override
	public double getEyeHeight() {
		return this.animal.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean arg0) {
		return this.animal.getEyeHeight(arg0);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.animal.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.animal.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.animal.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.animal.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.animal.getLastTwoTargetBlocks(transparent, maxDistance);
		
		for(Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.animal.getLastTwoTargetBlocks(transparent, maxDistance);
		
		for(Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.animal.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.animal.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.animal.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.animal.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.animal.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> arg0, int arg1) {
		return new LizaCraftBlock(this.animal.getTargetBlock(arg0, arg1));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.animal.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.animal.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.animal.leaveVehicle();
	}

	@Override
	public void setHealth(int arg0) {
		this.animal.setHealth(arg0);
	}

	@Override
	public void setLastDamage(int arg0) {
		this.animal.setLastDamage(arg0);
	}

	@Override
	public void setMaximumAir(int arg0) {
		this.animal.setMaximumAir(arg0);
	}

	@Override
	public void setMaximumNoDamageTicks(int arg0) {
		this.animal.setMaximumNoDamageTicks(arg0);
	}

	@Override
	public void setNoDamageTicks(int arg0) {
		this.animal.setNoDamageTicks(arg0);
	}

	@Override
	public void setRemainingAir(int arg0) {
		this.animal.setRemainingAir(arg0);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.animal.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.animal.throwEgg();
	}
	
	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.animal.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.animal.eject();
	}

	@Override
	public int getEntityId() {
		return this.animal.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.animal.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.animal.getFireTicks();
	}


	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.animal.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.animal.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.animal.getMaxFireTicks();
	}

	/**
	 * @param x Size of the box along x axis
	 * @param y Size of the box along y axis
	 * @param z Size of the box along z axis
	 */
	@Override
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.animal.getNearbyEntities(x, y, z);
		
		for(Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.animal.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.animal.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.animal.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.animal.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.animal.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.animal.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.animal.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.animal.isEmpty();
	}

	
	@Override
	public void playEffect(EntityEffect arg0) {
		this.animal.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.animal.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.animal.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.animal.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.animal.setLastDamageCause(arg0);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity arg0) {
		return this.animal.setPassenger(arg0);
	}

	@Override
	public void setTicksLived(int arg0) {
		this.animal.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.animal.setVelocity(arg0);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location arg0) {
		return this.animal.teleport(arg0);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity arg0) {
		return this.animal.teleport(arg0);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.animal.teleport(arg0, arg1);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.animal.teleport(arg0, arg1);
	}

}
