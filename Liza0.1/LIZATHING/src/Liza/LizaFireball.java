package Liza;

import java.util.List;

import org.bukkit.entity.Fireball;

/**
 *  LizaFireball is the Liza interface representation of
 *  the Bukkit Fireball interface.
 *  
 * @author collinbc
 */
public interface LizaFireball extends Fireball {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
