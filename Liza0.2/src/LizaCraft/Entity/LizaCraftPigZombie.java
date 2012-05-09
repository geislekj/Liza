package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.PigZombie;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaPigZombie;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftPigZombie is the Liza entity representation of
 *  the Bukkit PigZombie class.
 *  
 *  @author collinbc
 */
public class LizaCraftPigZombie extends LizaCraftMonster implements LizaPigZombie {
	private PigZombie zombiePigman;
	
	/**
	 * LizaCraftPigZombie Constructor
	 * 
	 * @param zombiePigman A Bukkit PigZombie
	 */
	public LizaCraftPigZombie(PigZombie zombiePigman) {
		super(zombiePigman);
	}
	
	@Override
	public PigZombie getBukkitHandle() {
		return (PigZombie)this.entity;
	}

	@Override
	public int getAnger() {
		return this.getBukkitHandle().getAnger();
	}

	@Override
	public boolean isAngry() {
		return this.getBukkitHandle().isAngry();
	}

	@Override
	public void setAnger(int anger) {
		this.getBukkitHandle().setAnger(anger);
	}

	@Override
	public void setAngry(boolean angry) {
		this.getBukkitHandle().setAngry(angry);
	}
}
