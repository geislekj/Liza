package LizaCraft.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizeCraftArrow is the Liza entity representation of
 *  the Bukkit Arrow class.
 *  
 * @author geislekj
 */
public class LizaCraftArrow extends LizaCraftProjectile implements LizaArrow{

	/**
	 * LizaCraftArrow Constructor
	 * 
	 * @param arrow This is a Bukkit Arrow entity 
	 */
	public LizaCraftArrow(Arrow arrow){
		super(arrow);
	}

	public Arrow getBukkitHandle(){
		return (Arrow)this.entity;
	}
	
}