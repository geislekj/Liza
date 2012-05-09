package LizaCraft.Block;

//Bukkit Imports
import java.util.Collection;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

//Liza Imports
import Liza.LizaBlock;

/**
 * LizeCraftBlock is the Liza block representation of the Bukkit block class.
 * 
 * @author kimsj; geislekj
 */
public class LizaCraftBlock implements LizaBlock {
	private Block block;

	/**
	 * LizaCraftBlock Constructor
	 * 
	 * @param block
	 *            This is a Bukkit Block
	 */
	public LizaCraftBlock(Block block) {
		this.block = block;
	}

	@Override
	public Block getBukkitBlock() {
		return this.block;
	}

	@Override
	public Biome getBiome() {
		return this.block.getBiome();
	}

	@Override
	public int getBlockPower() {
		return this.block.getBlockPower();
	}

	@Override
	public int getBlockPower(BlockFace face) {
		return this.block.getBlockPower(face);
	}

	@Override
	public Chunk getChunk() {
		return this.block.getChunk();
	}

	@Override
	public byte getData() {
		return this.block.getData();
	}

	@Override
	public BlockFace getFace(Block block) {
		return this.block.getFace(block);
	}

	@Override
	public double getHumidity() {
		return this.block.getHumidity();
	}

	@Override
	public byte getLightLevel() {
		return this.block.getLightLevel();
	}

	@Override
	public Location getLocation() {
		return this.block.getLocation();
	}

	@Override
	public PistonMoveReaction getPistonMoveReaction() {
		return this.block.getPistonMoveReaction();
	}

	@Override
	public Block getRelative(BlockFace face) {
		return this.block.getRelative(face);
	}

	@Override
	public Block getRelative(BlockFace face, int distance) {
		return this.block.getRelative(face, distance);
	}

	@Override
	public Block getRelative(int modX, int modY, int modZ) {
		return this.block.getRelative(modX, modY, modZ);
	}

	@Override
	public BlockState getState() {
		return this.block.getState();
	}

	@Override
	public double getTemperature() {
		return this.block.getTemperature();
	}

	@Override
	public Material getType() {
		return this.block.getType();
	}

	@Override
	public int getTypeId() {
		return this.block.getTypeId();
	}

	@Override
	public World getWorld() {
		return this.block.getWorld();
	}

	@Override
	public int getX() {
		return this.block.getX();
	}

	@Override
	public int getY() {
		return this.block.getY();
	}

	@Override
	public int getZ() {
		return this.block.getZ();
	}

	@Override
	public boolean isBlockFaceIndirectlyPowered(BlockFace face) {
		return this.block.isBlockFaceIndirectlyPowered(face);
	}

	@Override
	public boolean isBlockFacePowered(BlockFace face) {
		return this.block.isBlockFacePowered(face);
	}

	@Override
	public boolean isBlockIndirectlyPowered() {
		return this.block.isBlockIndirectlyPowered();
	}

	@Override
	public boolean isBlockPowered() {
		return this.block.isBlockPowered();
	}

	@Override
	public boolean isEmpty() {
		return this.block.isEmpty();
	}

	@Override
	public boolean isLiquid() {
		return this.block.isLiquid();
	}

	@Override
	public void setData(byte data) {
		this.block.setData(data);
	}

	@Override
	public void setData(byte data, boolean applyPhysics) {
		this.block.setData(data, applyPhysics);
	}

	@Override
	public void setType(Material type) {
		this.block.setType(type);
	}

	@Override
	public boolean setTypeId(int type) {
		return this.block.setTypeId(type);
	}

	@Override
	public boolean setTypeId(int type, boolean applyPhysics) {
		return this.block.setTypeId(type, applyPhysics);
	}

	@Override
	public boolean setTypeIdAndData(int type, byte data, boolean applyPhysics) {
		return this.block.setTypeIdAndData(type, data, applyPhysics);
	}

	@Override
	public boolean breakNaturally() {
		return this.block.breakNaturally();
	}

	@Override
	public boolean breakNaturally(ItemStack tool) {
		return this.block.breakNaturally(tool);
	}

	@Override
	public Collection<ItemStack> getDrops() {
		return this.block.getDrops();
	}

	@Override
	public Collection<ItemStack> getDrops(ItemStack tool) {
		return this.block.getDrops(tool);
	}

	@Override
	public byte getLightFromBlocks() {
		return this.block.getLightFromBlocks();
	}

	@Override
	public byte getLightFromSky() {
		return this.block.getLightFromSky();
	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		return this.block.getMetadata(metadataKey);
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		return this.block.hasMetadata(metadataKey);
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		this.block.removeMetadata(metadataKey, owningPlugin);
	}

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		this.block.setMetadata(metadataKey, newMetadataValue);
	}

}
