package Liza;

import org.bukkit.Server;

// TODO: Auto-generated Javadoc
/**
 *  LizaServer is the Liza interface representation of
 *  the Bukkit Server interface.
 * 
 * @author geislekj
 *
 */
public interface LizaServer extends Server{
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#getWorld(java.lang.String)
	 */
	LizaWorld getWorld(String name);
}
