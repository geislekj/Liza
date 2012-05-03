package Liza;

import java.util.List;

import org.bukkit.entity.Projectile;


/**
 *  LizaProjectile is the Liza interface representation of
 *  the Bukkit Projectile interface.
 * 
 * @author geislekj
 */
public interface LizaProjectile extends Projectile{

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
