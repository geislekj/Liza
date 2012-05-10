package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Zombie;

// TODO: Auto-generated Javadoc
/**
 *  LizaZombie is the Liza interface representation of
 *  the Bukkit Zombie interface.
 *  
 * @author collinbc
 */
public interface LizaZombie extends Zombie {

	/**
	 * Gets the last two target liza blocks.
	 *
	 * @param transparent the transparent
	 * @param maxDistance the max distance
	 * @return the last two target liza blocks
	 */
	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	/**
	 * Gets the line of sight liza.
	 *
	 * @param transparent the transparent
	 * @param maxDistance the max distance
	 * @return the line of sight liza
	 */
	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	/**
	 * Gets the nearby liza entities.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the nearby liza entities
	 */
	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
