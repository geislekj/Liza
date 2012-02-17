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

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
