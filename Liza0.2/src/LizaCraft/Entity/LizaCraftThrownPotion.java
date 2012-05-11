package LizaCraft.Entity;

import java.util.Collection;

import org.bukkit.entity.ThrownPotion;
import org.bukkit.potion.PotionEffect;

import Liza.LizaThrownPotion;

/**
 * LizaCraftThrownPotion is the Liza entity representation of the Bukkit
 * ThrownPotion class.
 * 
 * @author collinbc
 */
public class LizaCraftThrownPotion extends LizaCraftProjectile implements
		LizaThrownPotion {

	/**
	 * LizaCraftThrownPotion Constructor.
	 *
	 * @param potion This is a Bukkit ThrownPotion entity
	 */
	public LizaCraftThrownPotion(ThrownPotion potion) {
		super(potion);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftProjectile#getBukkitHandle()
	 */
	@Override
	public ThrownPotion getBukkitHandle() {
		return (ThrownPotion) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.ThrownPotion#getEffects()
	 */
	@Override
	public Collection<PotionEffect> getEffects() {
		return this.getBukkitHandle().getEffects();
	}

}
