package Liza;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.World;

/**
 *  LizaWorld is the Liza interface representation of
 *  the Bukkit world interface.
 * 
 * @author geislekj
 */
public interface LizaWorld extends World{

	/**
	 * Gets the liza entities.
	 *
	 * @return the liza entities
	 */
	List<LizaEntity> getLizaEntities();
	
	/**
	 * Gets the liza entities within radius.
	 *
	 * @param center the center
	 * @param radius the radius
	 * @return the liza entities within radius
	 */
	List<LizaEntity> getLizaEntitiesWithinRadius(Location center, double radius);
	
	/**
	 * Gets the liza entities within box.
	 *
	 * @param corner1 the corner1
	 * @param corner2 the corner2
	 * @return the liza entities within box
	 */
	List<LizaEntity> getLizaEntitiesWithinBox(Location corner1, Location corner2);
}
