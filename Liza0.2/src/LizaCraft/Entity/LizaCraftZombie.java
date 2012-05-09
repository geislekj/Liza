package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
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
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import Liza.LizaZombie;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftZombie is the Liza entity representation of
 *  the Bukkit Zombie class.
 *  
 *  @author collinbc
 */
public class LizaCraftZombie extends LizaCraftMonster implements LizaZombie {
	private Zombie zombie;
	
	/**
	 * LizaCraftZombie Constructor
	 * 
	 * @param zombie A Bukkit Zombie
	 */
	public LizaCraftZombie(Zombie zombie) {
		super(zombie);
	}
	
	@Override
	public Zombie getBukkitHandle() {
		return (Zombie)this.entity;
	}
}
