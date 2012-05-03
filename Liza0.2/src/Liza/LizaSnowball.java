package Liza;

import java.util.List;

import org.bukkit.entity.Snowball;

/**
 *  LizaSnowball is the Liza interface representation of
 *  the Bukkit Snowball interface.
 *  
 * @author collinbc
 */
public interface LizaSnowball extends Snowball {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
