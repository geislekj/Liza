package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Snowman;

/**
 *  LizaSnowman is the Liza interface representation of
 *  the Bukkit Snowman interface.
 *  
 *  A.K.A. Snow Golem
 *  
 *  @author collinbc
 */
public interface LizaSnowman extends Snowman {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
