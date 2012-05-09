package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fish;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaFish;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;


/**
 *  LizaCraftFish is the Liza entity representation of
 *  the Bukkit Fish class.
 *  
 * @author geislekj
 */
public class LizaCraftFish extends LizaCraftProjectile implements LizaFish{

	private Fish fish;

	/**
	 * LizaCraftFish Constructor
	 * 
	 * @param fish This is a Bukkit Fish entity 
	 */
	public LizaCraftFish(Fish fish) {
		super(fish);
	}
	
	public Fish getBukkitHandle() {
		return (Fish)this.entity;
	}
}