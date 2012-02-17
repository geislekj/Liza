package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Enderman;

/**
 *  LizaEnderman is the Liza interface representation of
 *  the Bukkit Enderman interface.
 *  
 * @author collinbc
 */
public interface LizaEnderman extends Enderman {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);


}
