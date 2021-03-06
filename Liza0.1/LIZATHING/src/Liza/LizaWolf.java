package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Wolf;

/**
 *  LizaWolf is the Liza interface representation of
 *  the Bukkit Wolf interface.
 *  
 *  A.K.A. Dog
 *  
 * @author collinbc
 */
public interface LizaWolf extends Wolf {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
