package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaCreeper;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftCreeper is the Liza entity representation of
 *  the Bukkit Creeper class.
 *  
 *  @author collinbc
 */
public class LizaCraftCreeper extends LizaCraftMonster implements LizaCreeper {
	private Creeper creeper;
	
	/**
	 * LizaCraftCreeper Constructor
	 * 
	 * @param creeper A Bukkit Creeper
	 */
	public LizaCraftCreeper(Creeper creeper) {
		super(creeper);
	}
	
	@Override
	public Creeper getBukkitHandle() {
		return (Creeper)this.entity;
	}

	@Override
	public boolean isPowered() {
		return this.getBukkitHandle().isPowered();
	}

	@Override
	public void setPowered(boolean power) {
		this.getBukkitHandle().setPowered(power);
		
	}
	
}
