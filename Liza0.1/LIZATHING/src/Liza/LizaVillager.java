package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Villager;

/**
 *  LizaVillager is the Liza interface representation of
 *  the Bukkit Villager interface.
 *  
 *  A.K.A. Testificate or Squidward
 *  
 *  @author collinbc
 */
public interface LizaVillager extends Villager {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
