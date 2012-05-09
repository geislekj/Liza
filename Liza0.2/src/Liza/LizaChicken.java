package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Chicken;

/**
 *  LizaChicken is the Liza interface representation of
 *  the Bukkit Chicken interface.
 * 
 * @author collinbc
 */
public interface LizaChicken extends Chicken {
	
	Chicken getBukkitChicken();

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
