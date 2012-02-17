package Liza;

import java.util.List;

import org.bukkit.entity.Fish;

/**
 *  LizaFish is the Liza interface representation of
 *  the Bukkit Fish interface.
 * 
 * @author geislekj
 */
public interface LizaFish extends Fish{

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
