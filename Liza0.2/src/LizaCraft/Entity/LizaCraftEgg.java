package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftEgg is the Liza entity representation of
 *  the Bukkit Egg class.
 *  
 *  @author collinbc
 */
public class LizaCraftEgg extends LizaCraftProjectile implements LizaEgg {
	
	/**
	 * LizaCraftEgg Constructor
	 * 
	 * @param egg A Bukkit Egg
	 */
	public LizaCraftEgg(Egg egg) {
		super(egg);
	}

	@Override
	public Egg getBukkitHandle() {
		return (Egg)this.entity;
	}
	
}
