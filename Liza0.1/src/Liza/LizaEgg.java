package Liza;

import java.util.List;

import org.bukkit.entity.Egg;

/**
 *  LizaEgg is the Liza interface representation of
 *  the Bukkit Egg interface.
 *  
 *  The incredible, edible (and throwable) egg.
 *  
 * @author collinbc
 */
public interface LizaEgg extends Egg {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
