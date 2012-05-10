package LizaCraft.Entity;

import org.bukkit.entity.LightningStrike;

import Liza.LizaLightningStrike;

public class LizaCraftLightningStrike extends LizaCraftWeather implements LizaLightningStrike {

	public LizaCraftLightningStrike(LightningStrike lightning) {
		super(lightning);
	}
	
	@Override
	public LightningStrike getBukkitHandle() {
		return (LightningStrike)this.entity;
	}

	@Override
	public boolean isEffect() {
		return this.getBukkitHandle().isEffect();
	}
}
