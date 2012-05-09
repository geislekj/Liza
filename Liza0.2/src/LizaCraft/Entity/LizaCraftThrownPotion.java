package LizaCraft.Entity;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaThrownPotion;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftThrownPotion is the Liza entity representation of
 *  the Bukkit ThrownPotion class.
 *  
 * @author collinbc
 */
public class LizaCraftThrownPotion extends LizaCraftProjectile implements LizaThrownPotion {
	

	/**
	 * LizaCraftThrownPotion Constructor
	 * 
	 * @param potion This is a Bukkit ThrownPotion entity 
	 */
	public LizaCraftThrownPotion(ThrownPotion potion) {
		super(potion);
	}

	@Override
	public ThrownPotion getBukkitHandle() {
		return (ThrownPotion)this.entity;
	}

	@Override
	public Collection<PotionEffect> getEffects() {
		return this.getBukkitHandle().getEffects();
	}
	
}

