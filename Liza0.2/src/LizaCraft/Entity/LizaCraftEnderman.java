package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.material.MaterialData;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEnderman;
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
 *  LizaCraftEnderman is the Liza entity representation of
 *  the Bukkit Enderman class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderman extends LizaCraftMonster implements LizaEnderman {
	/**
	 * LizaCraftSpider Constructor
	 * 
	 * @param spider A Bukkit Spider
	 */
	public LizaCraftEnderman(Enderman enderman) {
		super(enderman);
	}
	
	@Override
	public Enderman getBukkitHandle() {
		return (Enderman)this.entity;
	}

	@Override
	public MaterialData getCarriedMaterial() {
		return this.getBukkitHandle().getCarriedMaterial();
	}

	@Override
	public void setCarriedMaterial(MaterialData material) {
		this.getBukkitHandle().setCarriedMaterial(material);
	}
	
}
