package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Spider;

/**
 *  LizaSpider is the Liza interface representation of
 *  the Bukkit Spider interface.
 *  
 * @author collinbc
 */
public interface LizaSpider extends Spider {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
