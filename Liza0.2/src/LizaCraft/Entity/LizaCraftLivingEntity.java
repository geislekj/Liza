package LizaCraft.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaPlayer;
import Liza.LizaSnowball;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftLivingEntity is the Liza entity representation of
 *  the Bukkit LivingEntity class.
 *  
 *  @author collinbc
 */
public class LizaCraftLivingEntity extends LizaCraftEntity implements LizaLivingEntity {
	
	/**
	 * LizaCraftLivingEntity Constructor
	 * 
	 * @param livingEntity A Bukkit LivingEntity
	 */
	public LizaCraftLivingEntity(LivingEntity livingEntity) {
		super(livingEntity);
	}
	
	@Override
	public LivingEntity getBukkitHandle() {
		return (LivingEntity) this.entity;
	}
	
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.getBukkitHandle().getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl = new ArrayList<LizaBlock>();
		
		for(Block b : bl)
			lbl.add(new LizaCraftBlock(b));
		
		return lbl;
	}
	
	@Override
	public List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.getBukkitHandle().getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl = new ArrayList<LizaBlock>();
		
		for(Block b : bl)
			lbl.add(new LizaCraftBlock(b));
		
		return lbl;
	}
	
	@Override
	public void damage(int amount) {
		this.getBukkitHandle().damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.getBukkitHandle().damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.getBukkitHandle().getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.getBukkitHandle().getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.getBukkitHandle().getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.getBukkitHandle().getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.getBukkitHandle().getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.getBukkitHandle().getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		return this.getBukkitHandle().getLastTwoTargetBlocks(transparent,
				maxDistance);
	}
	
	@Override
	@Deprecated
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		return this.getBukkitHandle().getLastTwoTargetBlocks(transparent,
				maxDistance);
	}

	@Override
	public int getMaxHealth() {
		return this.getBukkitHandle().getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.getBukkitHandle().getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.getBukkitHandle().getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.getBukkitHandle().getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.getBukkitHandle().getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.getBukkitHandle().getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaEntity getVehicle() {
		return new LizaCraftEntity(this.getBukkitHandle().getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.getBukkitHandle().isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.getBukkitHandle().leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.getBukkitHandle().setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.getBukkitHandle().setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.getBukkitHandle().setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.getBukkitHandle().setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.getBukkitHandle().setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.getBukkitHandle().setRemainingAir(ticks);
	}

	@Override
	@Deprecated
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.getBukkitHandle().shootArrow());
	}

	@Override
	@Deprecated
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.getBukkitHandle().throwEgg());
	}

	@Override
	@Deprecated
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.getBukkitHandle().throwSnowball());
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect) {
		return this.getBukkitHandle().addPotionEffect(effect);
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect, boolean force) {
		return this.getBukkitHandle().addPotionEffect(effect, force);
	}

	@Override
	public boolean addPotionEffects(Collection<PotionEffect> effects) {
		return this.getBukkitHandle().addPotionEffects(effects);
	}

	@Override
	public Collection<PotionEffect> getActivePotionEffects() {
		return this.getBukkitHandle().getActivePotionEffects();
	}

	@Override
	public boolean hasPotionEffect(PotionEffectType type) {
		return this.getBukkitHandle().hasPotionEffect(type);
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
		return this.getBukkitHandle().launchProjectile(projectile);
	}

	@Override
	public void removePotionEffect(PotionEffectType type) {
		this.getBukkitHandle().removePotionEffect(type);
	}
}
