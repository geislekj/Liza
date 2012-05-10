package LizaCraft.Entity;

import org.bukkit.entity.Squid;

import Liza.LizaSquid;

/**
 * LizaCraftSquid is the Liza entity representation of the Bukkit Squid class.
 * 
 * @author collinbc
 */
public class LizaCraftSquid extends LizaCraftWaterMob implements LizaSquid {
	/**
	 * LizaCraftSquid Constructor
	 * 
	 * @param squid
	 *            A Bukkit Squid
	 */
	public LizaCraftSquid(Squid squid) {
		super(squid);
	}

	@Override
	public Squid getBukkitHandle() {
		return (Squid) this.entity;
	}

}
