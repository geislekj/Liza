package Liza;

import java.util.List;

import org.bukkit.entity.Entity;

/**
 *  LizaEntity is the Liza interface representation of
 *  the Bukkit entity interface.
 * 
 * @author geislekj
 */
public interface LizaEntity extends Entity{

	/**
	 * Gets the Bukkit Entity handle for this wrapper class.
	 *
	 * @return the Bukkit Entity
	 */
	public Entity getBukkitHandle();

	/**
	 * Gets the nearby Liza entities.
	 *
	 * @param x Size of the box along x axis
	 * @param y Size of the box along y axis
	 * @param z Size of the box along z axis
	 * @return The result of getNearbyEntities, but as LizaEntities.
	 */
	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);
	
}
