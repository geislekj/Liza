package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Skeleton;

/**
 *  LizaSkeleton is the Liza interface representation of
 *  the Bukkit Skeleton interface.
 *  
 * @author collinbc
 */
public interface LizaSkeleton extends Skeleton {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
