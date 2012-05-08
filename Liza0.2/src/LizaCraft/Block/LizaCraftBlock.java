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
 *  LizeCraftBlock is the Liza block representation of
 *  the Bukkit block class.
 *  
 * @author kimsj; geislekj
 */
public class LizaCraftBlock implements LizaBlock {
	private Block block;

	/**
	 * LizaCraftBlock Constructor
	 * 
	 * @param block This is a Bukkit Block 
	 */
	public LizaCraftBlock(Block block) {
		this.block = block;
	}

	public boolean assertBlockType(Material type) {
		return this.getType().equals(type);
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
	public int getBlockPower(BlockFace arg0) {
		return this.block.getBlockPower(arg0);
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
	public BlockFace getFace(Block arg0) {
		return this.block.getFace(arg0);
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
	public Block getRelative(BlockFace arg0) {
		return this.block.getRelative(arg0); 
	}

	@Override
	public Block getRelative(BlockFace arg0, int arg1) {
		return this.block.getRelative(arg0, arg1); 
	}

	@Override
	public Block getRelative(int arg0, int arg1, int arg2) {
		return this.block.getRelative(arg0, arg1, arg2); 
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
	public boolean isBlockFaceIndirectlyPowered(BlockFace arg0) {
		return this.block.isBlockFaceIndirectlyPowered(arg0);
	}

	@Override
	public boolean isBlockFacePowered(BlockFace arg0) {
		return this.block.isBlockFacePowered(arg0); 
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
	public void setData(byte arg0) {
		this.block.setData(arg0);	
	}

	@Override
	public void setData(byte arg0, boolean arg1) {
		this.block.setData(arg0, arg1);
	}

	@Override
	public void setType(Material arg0) {
		this.block.setType(arg0);
	}

	@Override
	public boolean setTypeId(int arg0) {
		return this.block.setTypeId(arg0); 
	}

	@Override
	public boolean setTypeId(int arg0, boolean arg1) {
		return this.block.setTypeId(arg0, arg1); 
	}

	@Override
	public boolean setTypeIdAndData(int arg0, byte arg1, boolean arg2) {
		return this.block.setTypeIdAndData(arg0, arg1, arg2); 
	}

	@Override
	public boolean breakNaturally() {
		return this.block.breakNaturally();
	}

	@Override
	public boolean breakNaturally(ItemStack arg0) {
		return this.block.breakNaturally(arg0);
	}

	@Override
	public Collection<ItemStack> getDrops() {
		return this.block.getDrops();
	}

	@Override
	public Collection<ItemStack> getDrops(ItemStack arg0) {
		return this.block.getDrops(arg0);
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
	public List<MetadataValue> getMetadata(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasMetadata(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeMetadata(String arg0, Plugin arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMetadata(String arg0, MetadataValue arg1) {
		// TODO Auto-generated method stub
		
	}

}
