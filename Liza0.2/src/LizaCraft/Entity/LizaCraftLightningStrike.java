package LizaCraft.Entity;

import org.bukkit.entity.LightningStrike;

import Liza.LizaLightningStrike;

/**
 * The Class LizaCraftLightningStrike.
 */
public class LizaCraftLightningStrike extends LizaCraftWeather implements LizaLightningStrike {

	/**
	 * Instantiates a new liza craft lightning strike.
	 *
	 * @param lightning a lightning
	 */
	public LizaCraftLightningStrike(LightningStrike lightning) {
		super(lightning);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftWeather#getBukkitHandle()
	 */
	@Override
	public LightningStrike getBukkitHandle() {
		return (LightningStrike)this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.LightningStrike#isEffect()
	 */
	@Override
	public boolean isEffect() {
		return this.getBukkitHandle().isEffect();
	}
}
