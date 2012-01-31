/**
 * 
 */
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
import org.bukkit.entity.Creature;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaCreature;

/**
 * @author geislekj
 *
 *  LizeCraftCreature is the Liza entity representation of
 *  the Bukkit Creature class.
 */
public class LizaCraftCreature implements LizaCreature{

	private Creature creature;
	
	/**
	 * LizaCraftEntity Constructor
	 * 
	 * @param entity This is a Bukkit entity 
	 */
	public LizaCraftCreature(Creature creature){
		this.creature = creature;
	}

	@Override
	public LivingEntity getTarget() {
		return this.creature.getTarget();
	}

	@Override
	public void setTarget(LivingEntity arg0) {
		this.creature.setTarget(arg0);
	}

	@Override
	public void damage(int arg0) {
		this.creature.damage(arg0);
	}

	@Override
	public void damage(int arg0, Entity arg1) {
		this.creature.damage(arg0, arg1);
	}

	@Override
	public double getEyeHeight() {
		return this.creature.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean arg0) {
		return this.creature.getEyeHeight(arg0); 
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
	public Player getKiller() {
		return this.creature.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.creature.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> arg0, int arg1) {
		return this.creature.getLastTwoTargetBlocks(arg0, arg1); 
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> arg0, int arg1) {
		return this.creature.getLineOfSight(arg0, arg1); 
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
	public Block getTargetBlock(HashSet<Byte> arg0, int arg1) {
		return this.creature.getTargetBlock(arg0, arg1); 
	}

	@Override
	public Vehicle getVehicle() {
		return this.creature.getVehicle();
	}

	@Override
	public boolean isInsideVehicle() {
		return this.creature.isInsideVehicle();
	}

	@Override
	public boolean leaveVehicle() {
		return this.creature.leaveVehicle();
	}

	@Override
	public void setHealth(int arg0) {
		this.creature.setHealth(arg0);
	}

	@Override
	public void setLastDamage(int arg0) {
		this.creature.setLastDamage(arg0);
	}

	@Override
	public void setMaximumAir(int arg0) {
		this.creature.setMaximumAir(arg0);
	}

	@Override
	public void setMaximumNoDamageTicks(int arg0) {
		this.creature.setMaximumNoDamageTicks(arg0);
	}

	@Override
	public void setNoDamageTicks(int arg0) {
		this.creature.setNoDamageTicks(arg0);
	}

	@Override
	public void setRemainingAir(int arg0) {
		this.creature.setRemainingAir(arg0);
	}

	@Override
	public Arrow shootArrow() {
		return this.creature.shootArrow();
	}

	@Override
	public Egg throwEgg() {
		return this.creature.throwEgg();
	}

	@Override
	public Snowball throwSnowball() {
		return this.creature.throwSnowball();
	}

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

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.creature.getNearbyEntities(arg0, arg1, arg2); 
	}

	@Override
	public Entity getPassenger() {
		return this.creature.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.creature.getServer();
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
	public World getWorld() {
		return this.creature.getWorld();
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
	public void playEffect(EntityEffect arg0) {
		this.creature.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.creature.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.creature.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.creature.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.creature.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.creature.setPassenger(arg0); 
	}

	@Override
	public void setTicksLived(int arg0) {
		this.creature.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.creature.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.creature.teleport(arg0); 
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.creature.teleport(arg0);
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.creature.teleport(arg0, arg1); 
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.creature.teleport(arg0, arg1); 
	}	
	
}
