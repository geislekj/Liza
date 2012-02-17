package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Pig;

/**
 *  LizaPig is the Liza interface representation of
 *  the Bukkit Pig interface.
 *  
 * @author collinbc
 */
public interface LizaPig extends Pig {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
