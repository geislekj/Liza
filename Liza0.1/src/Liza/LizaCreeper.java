package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Creeper;

/**
 *  LizaCreeper is the Liza interface representation of
 *  the Bukkit Creeper interface.
 *  
 *  That'ssss some nice code you've got there...
 *  
 * @author collinbc
 */
public interface LizaCreeper extends Creeper {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
