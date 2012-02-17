package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Sheep;

/**
 *  LizaSheep is the Liza interface representation of
 *  the Bukkit Sheep interface.
 *  
 * @author collinbc
 */
public interface LizaSheep extends Sheep {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
