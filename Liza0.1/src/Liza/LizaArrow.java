package Liza;

import java.util.List;

import org.bukkit.entity.Arrow;

/**
 *  LizaArrow is the Liza interface representation of
 *  the Bukkit Arrow interface.
 * 
 * @author geislekj
 */
public interface LizaArrow extends Arrow{

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
