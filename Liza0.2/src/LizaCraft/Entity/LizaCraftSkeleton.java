package LizaCraft.Entity;

import org.bukkit.entity.Skeleton;
import Liza.LizaSkeleton;

/**
 * LizaCraftSkeleton is the Liza entity representation of the Bukkit Skeleton
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftSkeleton extends LizaCraftMonster implements LizaSkeleton {
	/**
	 * LizaCraftSkeleton Constructor
	 * 
	 * @param skeleton
	 *            A Bukkit Skeleton
	 */
	public LizaCraftSkeleton(Skeleton skeleton) {
		super(skeleton);
	}

	@Override
	public Skeleton getBukkitHandle() {
		return (Skeleton) this.entity;
	}

}
