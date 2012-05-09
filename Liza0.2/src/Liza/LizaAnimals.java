package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Animals;

/**
 *  LizaAnimals is the Liza interface representation of
 *  the Bukkit Animals interface.
 *  
 * @author collinbc
 */
public interface LizaAnimals extends Animals {

	Animals getBukkitAnimals();
	
	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
