package Liza;

import java.util.List;

import org.bukkit.entity.SmallFireball;

/**
 *  LizaSmallFireball is the Liza interface representation of
 *  the Bukkit SmallFireball interface.
 *  
 * @author collinbc
 */
public interface LizaSmallFireball extends SmallFireball {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
