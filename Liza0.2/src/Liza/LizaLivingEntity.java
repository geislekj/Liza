package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.LivingEntity;

/**
 *  LizaLivingEntity is the Liza interface representation of
 *  the Bukkit LivingEntity interface
 *  
 * @author collinbc
 */
public interface LizaLivingEntity extends LivingEntity{

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

}
