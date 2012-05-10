package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.LivingEntity;

// TODO: Auto-generated Javadoc
/**
 * LizaLivingEntity is the Liza interface representation of
 * the Bukkit LivingEntity interface.
 *
 * @author collinbc
 */
public interface LizaLivingEntity extends LivingEntity{

	/**
	 * Gets the last two target liza blocks.
	 *
	 * @param transparent the transparent
	 * @param maxDistance the max distance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	/**
	 * Gets the line of sight liza.
	 *
	 * @param transparent the transparent
	 * @param maxDistance the max distance
	 * @return The result of getLineOfSight, but as LizaBlocks.
	 */
	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

}
