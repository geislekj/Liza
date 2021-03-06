package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.CaveSpider;

/**
 *  LizaCaveSpider is the Liza interface representation of
 *  the Bukkit CaveSpider interface.
 *  
 * @author collinbc
 */
public interface LizaCaveSpider extends CaveSpider {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
