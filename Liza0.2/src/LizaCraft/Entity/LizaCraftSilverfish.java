package LizaCraft.Entity;

import org.bukkit.entity.Silverfish;

import Liza.LizaSilverfish;

/**
 * LizaCraftSilverfish is the Liza entity representation of the Bukkit
 * Silverfish class.
 * 
 * @author collinbc
 */
public class LizaCraftSilverfish extends LizaCraftMonster implements
		LizaSilverfish {

	/**
	 * LizaCraftSilverfish Constructor.
	 *
	 * @param silverfish A Bukkit Silverfish
	 */
	public LizaCraftSilverfish(Silverfish silverfish) {
		super(silverfish);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMonster#getBukkitHandle()
	 */
	@Override
	public Silverfish getBukkitHandle() {
		return (Silverfish) this.entity;
	}

}
