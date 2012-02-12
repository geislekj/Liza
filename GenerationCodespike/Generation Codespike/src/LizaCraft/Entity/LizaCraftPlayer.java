package LizaCraft.Entity;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.EntityEffect;
import org.bukkit.GameMode;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Statistic;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.map.MapView;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;
/**
 *  LizaCraftPlayer is the Liza HumanEntity representation of
 *  the Bukkit Player class.
 *  
 * @author collinbc
 */
public class LizaCraftPlayer implements LizaPlayer {
	private Player player;
	
	/**
	 * LizaCraftPlayer Constructor
	 * 
	 * @param player A Bukkit Player
	 */
	public LizaCraftPlayer(Player player) {
		this.player = player;
	}

	@Override
	public void awardAchievement(Achievement arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void chat(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public InetSocketAddress getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getAllowFlight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Location getBedSpawnLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getCompassTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getExhaustion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getExp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getExperience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFoodLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getPlayerListName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getPlayerTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getPlayerTimeOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getSaturation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalExperience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void giveExp(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void incrementStatistic(Statistic arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void incrementStatistic(Statistic arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void incrementStatistic(Statistic arg0, Material arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void incrementStatistic(Statistic arg0, Material arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayerTimeRelative() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSleepingIgnored() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSneaking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSprinting() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void kickPlayer(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadData() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performCommand(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void playEffect(Location arg0, Effect arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playNote(Location arg0, byte arg1, byte arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playNote(Location arg0, Instrument arg1, Note arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resetPlayerTime() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendBlockChange(Location arg0, Material arg1, byte arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendBlockChange(Location arg0, int arg1, byte arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean sendChunkChange(Location arg0, int arg1, int arg2, int arg3,
			byte[] arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sendMap(MapView arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendRawMessage(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAllowFlight(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBedSpawnLocation(Location arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCompassTarget(Location arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDisplayName(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setExhaustion(float arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setExp(float arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setExperience(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFoodLevel(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLevel(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPlayerListName(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPlayerTime(long arg0, boolean arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSaturation(float arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSleepingIgnored(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSneaking(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSprinting(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTotalExperience(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateInventory() {
		// TODO Auto-generated method stub

	}

	@Override
	public GameMode getGameMode() {
		return this.player.getGameMode();
	}

	/**
	 * TODO: Change once LizaCraftPlayerInventory is implemented.
	 */
	@Override
	public PlayerInventory getInventory() {
		return this.player.getInventory();
	}

	@Override
	public ItemStack getItemInHand() {
		return this.player.getItemInHand();
	}

	@Override
	public String getName() {
		return this.player.getName();
	}

	@Override
	public int getSleepTicks() {
		return this.player.getSleepTicks();
	}

	@Override
	public boolean isSleeping() {
		return this.player.isSleeping();
	}

	@Override
	public void setGameMode(GameMode mode) {
		this.player.setGameMode(mode);
	}

	@Override
	public void setItemInHand(ItemStack item) {
		this.player.setItemInHand(item);
	}

	@Override
	public void damage(int amount) {
		this.player.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.player.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.player.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.player.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.player.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.player.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.player.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.player.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.player.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}
	
	@Override
	@Deprecated
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.player.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.player.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.player.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.player.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.player.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.player.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.player.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.player.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.player.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.player.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.player.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.player.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.player.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.player.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.player.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.player.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.player.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.player.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.player.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.player.eject();
	}

	@Override
	public int getEntityId() {
		return this.player.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.player.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.player.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.player.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.player.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.player.getMaxFireTicks();
	}

	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 */
	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.player.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.player.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.player.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.player.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.player.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.player.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.player.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.player.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.player.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.player.playEffect(type);
	}

	@Override
	public void remove() {
		this.player.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.player.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.player.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.player.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.player.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.player.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.player.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.player.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.player.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.player.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.player.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.player.getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl;

		for(Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		lbl = (List) bl;
		
		return lbl;
	}
	
	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLineOfSight, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.player.getLastTwoTargetBlocks(transparent,
				maxDistance);
		List<LizaBlock> lbl;

		for(Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		lbl = (List) bl;
		
		return lbl;
	}
	
	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 * @return The result of getNearbyEntities, but as LizaEntities.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		List<Entity> el = this.player.getNearbyEntities(x, y, z);
		List<LizaEntity> lel;

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		lel = (List) el;
		
		return lel;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin) {
		return this.player.addAttachment(plugin);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		return this.player.addAttachment(plugin, ticks);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value) {
		return this.player.addAttachment(plugin, name, value);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value, int ticks) {
		return this.player.addAttachment(plugin, name, value, ticks);
	}

	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		return this.player.getEffectivePermissions();
	}

	@Override
	public boolean hasPermission(String name) {
		return this.player.hasPermission(name);
	}

	@Override
	public boolean hasPermission(Permission perm) {
		return this.player.hasPermission(perm);
	}

	@Override
	public boolean isPermissionSet(String name) {
		return this.player.isPermissionSet(name);
	}

	@Override
	public boolean isPermissionSet(Permission perm) {
		return this.player.isPermissionSet(perm);
	}

	@Override
	public void recalculatePermissions() {
		this.player.recalculatePermissions();
	}

	@Override
	public void removeAttachment(PermissionAttachment attachment) {
		this.player.removeAttachment(attachment);
	}

	@Override
	public boolean isOp() {
		return this.player.isOp();
	}

	@Override
	public void setOp(boolean value) {
		this.player.setOp(value);
	}

	@Override
	public void sendMessage(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public long getFirstPlayed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getLastPlayed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPlayedBefore() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBanned() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOnline() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWhitelisted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setBanned(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setWhitelisted(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> serialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getListeningPluginChannels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
		// TODO Auto-generated method stub

	}

}
