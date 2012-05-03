package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.LivingEntity;

/**
 *  LizaLivingEntity is the Liza interface representation of
 *  the Bukkit LivingEntity interface
 *  
 * @author collinbc
 */
public interface LizaLivingEntity extends LivingEntity{

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
