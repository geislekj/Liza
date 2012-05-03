package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.WaterMob;

/**
 *  LizaWaterMob is the Liza interface representation of
 *  the Bukkit WaterMob interface.
 *  
 *  @author collinbc
 */
public interface LizaWaterMob extends WaterMob {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
