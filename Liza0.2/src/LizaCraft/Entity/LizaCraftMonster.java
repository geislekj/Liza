package LizaCraft.Entity;

import org.bukkit.entity.Monster;
import Liza.LizaMonster;

// TODO: Auto-generated Javadoc
/**
 *  LizaCraftMonster is the Liza entity representation of
 *  the Bukkit Monster class.
 *  
 *  @author collinbc
 */
public class LizaCraftMonster extends LizaCraftCreature implements LizaMonster {
	
	/**
	 * LizaCraftMonster Constructor.
	 *
	 * @param monster A Bukkit Monster
	 */
	public LizaCraftMonster(Monster monster) {
		super(monster);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftCreature#getBukkitHandle()
	 */
	@Override
	public Monster getBukkitHandle() {
		return (Monster) this.entity;
	}
}
