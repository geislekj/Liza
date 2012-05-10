package LizaCraft.Entity;

import org.bukkit.entity.Squid;

import Liza.LizaSquid;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftSquid is the Liza entity representation of the Bukkit Squid class.
 * 
 * @author collinbc
 */
public class LizaCraftSquid extends LizaCraftWaterMob implements LizaSquid {
	
	/**
	 * LizaCraftSquid Constructor.
	 *
	 * @param squid A Bukkit Squid
	 */
	public LizaCraftSquid(Squid squid) {
		super(squid);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftWaterMob#getBukkitHandle()
	 */
	@Override
	public Squid getBukkitHandle() {
		return (Squid) this.entity;
	}

}
