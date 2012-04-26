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

	List<LizaEntity> getLizaEntities();
	
	List<LizaEntity> getLizaEntitiesWithinRadius(Location center, double radius);
	List<LizaEntity> getLizaEntitiesWithinBox(Location corner1, Location corner2);
}
