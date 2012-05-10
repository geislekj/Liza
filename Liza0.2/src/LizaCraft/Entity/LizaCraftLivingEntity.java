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

// TODO: Auto-generated Javadoc
/**
 *  LizaCraftLivingEntity is the Liza entity representation of
 *  the Bukkit LivingEntity class.
 *  
 *  @author collinbc
 */
public class LizaCraftLivingEntity extends LizaCraftEntity implements LizaLivingEntity {
	
	/**
	 * LizaCraftLivingEntity Constructor.
	 *
	 * @param livingEntity A Bukkit LivingEntity
	 */
	public LizaCraftLivingEntity(LivingEntity livingEntity) {
		super(livingEntity);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#getBukkitHandle()
	 */
	@Override
	public LivingEntity getBukkitHandle() {
		return (LivingEntity) this.entity;
	}
	
	/* (non-Javadoc)
	 * @see Liza.LizaLivingEntity#getLastTwoTargetLizaBlocks(java.util.HashSet, int)
	 */
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.getBukkitHandle().getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl = new ArrayList<LizaBlock>();
		
		for(Block b : bl)
			lbl.add(new LizaCraftBlock(b));
		
		return lbl;
	}
	
	/* (non-Javadoc)
	 * @see Liza.LizaLivingEntity#getLineOfSightLiza(java.util.HashSet, int)
	 */
	@Override
	public List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.getBukkitHandle().getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl = new ArrayList<LizaBlock>();
		
		for(Block b : bl)
			lbl.add(new LizaCraftBlock(b));
		
		return lbl;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#damage(int)
	 */
	@Override
	public void damage(int amount) {
		this.getBukkitHandle().damage(amount);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#damage(int, org.bukkit.entity.Entity)
	 */
	@Override
	public void damage(int amount, Entity source) {
		this.getBukkitHandle().damage(amount, source);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getEyeHeight()
	 */
	@Override
	public double getEyeHeight() {
		return this.getBukkitHandle().getEyeHeight();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getEyeHeight(boolean)
	 */
	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.getBukkitHandle().getEyeHeight(ignoreSneaking);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getEyeLocation()
	 */
	@Override
	public Location getEyeLocation() {
		return this.getBukkitHandle().getEyeLocation();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getHealth()
	 */
	@Override
	public int getHealth() {
		return this.getBukkitHandle().getHealth();
	}


	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getKiller()
	 */
	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.getBukkitHandle().getKiller());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getLastDamage()
	 */
	@Override
	public int getLastDamage() {
		return this.getBukkitHandle().getLastDamage();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getLastTwoTargetBlocks(java.util.HashSet, int)
	 */
	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		return this.getBukkitHandle().getLastTwoTargetBlocks(transparent,
				maxDistance);
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getLineOfSight(java.util.HashSet, int)
	 */
	@Override
	@Deprecated
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		return this.getBukkitHandle().getLastTwoTargetBlocks(transparent,
				maxDistance);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getMaxHealth()
	 */
	@Override
	public int getMaxHealth() {
		return this.getBukkitHandle().getMaxHealth();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getMaximumAir()
	 */
	@Override
	public int getMaximumAir() {
		return this.getBukkitHandle().getMaximumAir();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getMaximumNoDamageTicks()
	 */
	@Override
	public int getMaximumNoDamageTicks() {
		return this.getBukkitHandle().getMaximumNoDamageTicks();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getNoDamageTicks()
	 */
	@Override
	public int getNoDamageTicks() {
		return this.getBukkitHandle().getNoDamageTicks();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getRemainingAir()
	 */
	@Override
	public int getRemainingAir() {
		return this.getBukkitHandle().getRemainingAir();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getTargetBlock(java.util.HashSet, int)
	 */
	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.getBukkitHandle().getTargetBlock(transparent,
				maxDistance));
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#getVehicle()
	 */
	@Override
	public LizaEntity getVehicle() {
		return new LizaCraftEntity(this.getBukkitHandle().getVehicle());
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#isInsideVehicle()
	 */
	@Override
	public boolean isInsideVehicle() {
		return this.getBukkitHandle().isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean leaveVehicle() {
		return this.getBukkitHandle().leaveVehicle();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#setHealth(int)
	 */
	@Override
	public void setHealth(int health) {
		this.getBukkitHandle().setHealth(health);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#setLastDamage(int)
	 */
	@Override
	public void setLastDamage(int damage) {
		this.getBukkitHandle().setLastDamage(damage);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#setMaximumAir(int)
	 */
	@Override
	public void setMaximumAir(int ticks) {
		this.getBukkitHandle().setMaximumAir(ticks);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#setMaximumNoDamageTicks(int)
	 */
	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.getBukkitHandle().setMaximumNoDamageTicks(ticks);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#setNoDamageTicks(int)
	 */
	@Override
	public void setNoDamageTicks(int ticks) {
		this.getBukkitHandle().setNoDamageTicks(ticks);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#setRemainingAir(int)
	 */
	@Override
	public void setRemainingAir(int ticks) {
		this.getBukkitHandle().setRemainingAir(ticks);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#shootArrow()
	 */
	@Override
	@Deprecated
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.getBukkitHandle().shootArrow());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#throwEgg()
	 */
	@Override
	@Deprecated
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.getBukkitHandle().throwEgg());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#throwSnowball()
	 */
	@Override
	@Deprecated
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.getBukkitHandle().throwSnowball());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#addPotionEffect(org.bukkit.potion.PotionEffect)
	 */
	@Override
	public boolean addPotionEffect(PotionEffect effect) {
		return this.getBukkitHandle().addPotionEffect(effect);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#addPotionEffect(org.bukkit.potion.PotionEffect, boolean)
	 */
	@Override
	public boolean addPotionEffect(PotionEffect effect, boolean force) {
		return this.getBukkitHandle().addPotionEffect(effect, force);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#addPotionEffects(java.util.Collection)
	 */
	@Override
	public boolean addPotionEffects(Collection<PotionEffect> effects) {
		return this.getBukkitHandle().addPotionEffects(effects);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#getActivePotionEffects()
	 */
	@Override
	public Collection<PotionEffect> getActivePotionEffects() {
		return this.getBukkitHandle().getActivePotionEffects();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#hasPotionEffect(org.bukkit.potion.PotionEffectType)
	 */
	@Override
	public boolean hasPotionEffect(PotionEffectType type) {
		return this.getBukkitHandle().hasPotionEffect(type);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#launchProjectile(java.lang.Class)
	 */
	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
		return this.getBukkitHandle().launchProjectile(projectile);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LivingEntity#removePotionEffect(org.bukkit.potion.PotionEffectType)
	 */
	@Override
	public void removePotionEffect(PotionEffectType type) {
		this.getBukkitHandle().removePotionEffect(type);
	}
}
