package LizaCraft.Entity;

import org.bukkit.entity.Giant;

import Liza.LizaGiant;

// TODO: Auto-generated Javadoc
/**
 *  LizaCraftGiant is the Liza entity representation of
 *  the Bukkit Giant class.
 *  
 *  @author collinbc
 */
public class LizaCraftGiant extends LizaCraftMonster implements LizaGiant {
	
	/**
	 * LizaCraftGiant Constructor.
	 *
	 * @param giant A Bukkit Giant
	 */
	public LizaCraftGiant(Giant giant){
		super(giant);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMonster#getBukkitHandle()
	 */
	@Override
	public Giant getBukkitHandle() {
		return (Giant)this.entity;
	}

}
