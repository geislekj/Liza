package LizaCraft.Entity;

import org.bukkit.entity.Weather;

import Liza.LizaWeather;

/**
 * LizeCraftWeather is the Liza entity representation of the Bukkit weather
 * class.
 * 
 * @author geislekj
 */
public class LizaCraftWeather extends LizaCraftEntity implements LizaWeather {
	
	/**
	 * LizaCraftWeather Constructor.
	 *
	 * @param weather This is a Bukkit weather entity
	 */
	public LizaCraftWeather(Weather weather) {
		super(weather);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#getBukkitHandle()
	 */
	@Override
	public Weather getBukkitHandle() {
		return (Weather) this.entity;
	}

}
