package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Blaze;

/**
 *  LizaBlaze is the Liza interface representation of
 *  the Bukkit Blaze interface.
 *  
 * @author collinbc
 */
public interface LizaBlaze extends Blaze {

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLineOfSight, but as LizaBlocks.
	 */
	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 * @return The result of getNearbyEntities, but as LizaEntities.
	 */
	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
