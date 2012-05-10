package LizaCraft.Entity;

import org.bukkit.Art;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Painting;

import Liza.LizaPainting;

/**
 * LizeCraftPainting is the Liza entity representation of the Bukkit Painting
 * class.
 * 
 * @author geislekj
 */
public class LizaCraftPainting extends LizaCraftEntity implements LizaPainting {
	/**
	 * LizaCraftPainting Constructor
	 * 
	 * @param painting
	 *            This is a Bukkit Painting entity
	 */
	public LizaCraftPainting(Painting painting) {
		super(painting);
	}

	@Override
	public Painting getBukkitHandle() {
		return (Painting) this.entity;
	}

	@Override
	public Art getArt() {
		return this.getBukkitHandle().getArt();
	}

	@Override
	public boolean setArt(Art art) {
		return this.getBukkitHandle().setArt(art);
	}

	@Override
	public boolean setArt(Art art, boolean force) {
		return this.getBukkitHandle().setArt(art, force);
	}

	@Override
	public boolean setFacingDirection(BlockFace face, boolean force) {
		return this.getBukkitHandle().setFacingDirection(face, force);
	}

	@Override
	public BlockFace getAttachedFace() {
		return this.getBukkitHandle().getAttachedFace();
	}

	@Override
	public BlockFace getFacing() {
		return this.getBukkitHandle().getFacing();
	}

	@Override
	public void setFacingDirection(BlockFace face) {
		this.getBukkitHandle().setFacingDirection(face);
	}

}
