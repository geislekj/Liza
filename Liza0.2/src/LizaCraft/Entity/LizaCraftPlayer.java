package LizaCraft.Entity;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.Set;

import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Statistic;
import org.bukkit.conversations.Conversation;
import org.bukkit.entity.Player;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;

import Liza.LizaPlayer;

/**
 * LizaCraftPlayer is the Liza HumanEntity representation of the Bukkit Player
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftPlayer extends LizaCraftHumanEntity implements LizaPlayer {
	/**
	 * LizaCraftPlayer Constructor
	 * 
	 * @param player
	 *            A Bukkit Player
	 */
	public LizaCraftPlayer(Player player) {
		super(player);
	}

	@Override
	public Player getBukkitHandle() {
		return (Player) this.entity;
	}

	@Override
	public void awardAchievement(Achievement achievement) {
		this.getBukkitHandle().awardAchievement(achievement);
	}

	@Override
	public boolean canSee(Player player) {
		return this.getBukkitHandle().canSee(player);
	}

	@Override
	public void chat(String msg) {
		this.getBukkitHandle().chat(msg);
	}

	@Override
	public InetSocketAddress getAddress() {
		return this.getBukkitHandle().getAddress();
	}

	@Override
	public boolean getAllowFlight() {
		return this.getBukkitHandle().getAllowFlight();
	}

	@Override
	public Location getBedSpawnLocation() {
		return this.getBukkitHandle().getBedSpawnLocation();
	}

	@Override
	public Location getCompassTarget() {
		return this.getBukkitHandle().getCompassTarget();
	}

	@Override
	public String getDisplayName() {
		return this.getBukkitHandle().getDisplayName();
	}

	@Override
	public float getExhaustion() {
		return this.getBukkitHandle().getExhaustion();
	}

	@Override
	public float getExp() {
		return this.getBukkitHandle().getExp();
	}

	@Override
	public int getFoodLevel() {
		return this.getBukkitHandle().getFoodLevel();
	}

	@Override
	public int getLevel() {
		return this.getBukkitHandle().getLevel();
	}

	@Override
	public String getPlayerListName() {
		return this.getBukkitHandle().getPlayerListName();
	}

	@Override
	public long getPlayerTime() {
		return this.getBukkitHandle().getPlayerTime();
	}

	@Override
	public long getPlayerTimeOffset() {
		return this.getBukkitHandle().getPlayerTimeOffset();
	}

	@Override
	public float getSaturation() {
		return this.getBukkitHandle().getSaturation();
	}

	@Override
	public int getTotalExperience() {
		return this.getBukkitHandle().getTotalExperience();
	}

	@Override
	public void giveExp(int amount) {
		this.getBukkitHandle().giveExp(amount);
	}

	@Override
	public void hidePlayer(Player player) {
		this.getBukkitHandle().hidePlayer(player);
	}

	@Override
	public void incrementStatistic(Statistic statistic) {
		this.getBukkitHandle().incrementStatistic(statistic);
	}

	@Override
	public void incrementStatistic(Statistic statistic, int amount) {
		this.getBukkitHandle().incrementStatistic(statistic, amount);
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material) {
		this.getBukkitHandle().incrementStatistic(statistic, material);
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material,
			int amount) {
		this.getBukkitHandle().incrementStatistic(statistic, material, amount);
	}

	@Override
	public boolean isPlayerTimeRelative() {
		return this.getBukkitHandle().isPlayerTimeRelative();
	}

	@Override
	public boolean isSleepingIgnored() {
		return this.getBukkitHandle().isSleepingIgnored();
	}

	@Override
	public boolean isSneaking() {
		return this.getBukkitHandle().isSneaking();
	}

	@Override
	public boolean isSprinting() {
		return this.getBukkitHandle().isSprinting();
	}

	@Override
	public void kickPlayer(String message) {
		this.getBukkitHandle().kickPlayer(message);
	}

	@Override
	public void loadData() {
		this.getBukkitHandle().loadData();
	}

	@Override
	public boolean performCommand(String command) {
		return this.getBukkitHandle().performCommand(command);
	}

	@Override
	public void playEffect(Location loc, Effect effect, int data) {
		this.getBukkitHandle().playEffect(loc, effect, data);
	}

	@Override
	public <T> void playEffect(Location loc, Effect effect, T data) {
		this.getBukkitHandle().playEffect(loc, effect, data);
	}

	@Override
	public void playNote(Location loc, byte instrument, byte note) {
		this.getBukkitHandle().playNote(loc, instrument, note);
	}

	@Override
	public void playNote(Location loc, Instrument instrument, Note note) {
		this.getBukkitHandle().playNote(loc, instrument, note);
	}

	@Override
	public void resetPlayerTime() {
		this.getBukkitHandle().resetPlayerTime();
	}

	@Override
	public void saveData() {
		this.getBukkitHandle().saveData();
	}

	@Override
	public void sendBlockChange(Location loc, Material material, byte data) {
		this.getBukkitHandle().sendBlockChange(loc, material, data);
	}

	@Override
	public void sendBlockChange(Location loc, int material, byte data) {
		this.getBukkitHandle().sendBlockChange(loc, material, data);
	}

	@Override
	public boolean sendChunkChange(Location loc, int sx, int sy, int sz,
			byte[] data) {
		return this.getBukkitHandle().sendChunkChange(loc, sx, sy, sz, data);
	}

	@Override
	public void sendMap(MapView map) {
		this.getBukkitHandle().sendMap(map);
	}

	@Override
	public void sendRawMessage(String message) {
		this.getBukkitHandle().sendRawMessage(message);
	}

	@Override
	public void setAllowFlight(boolean flight) {
		this.getBukkitHandle().setAllowFlight(flight);
	}

	@Override
	public void setBedSpawnLocation(Location location) {
		this.getBukkitHandle().setBedSpawnLocation(location);
	}

	@Override
	public void setCompassTarget(Location location) {
		this.getBukkitHandle().setCompassTarget(location);
	}

	@Override
	public void setDisplayName(String name) {
		this.getBukkitHandle().setDisplayName(name);
	}

	@Override
	public void setExhaustion(float value) {
		this.getBukkitHandle().setExhaustion(value);
	}

	@Override
	public void setExp(float exp) {
		this.getBukkitHandle().setExp(exp);
	}

	@Override
	public void setFoodLevel(int value) {
		this.getBukkitHandle().setFoodLevel(value);
	}

	@Override
	public void setLevel(int level) {
		this.getBukkitHandle().setLevel(level);
	}

	@Override
	public void setPlayerListName(String name) {
		this.getBukkitHandle().setPlayerListName(name);
	}

	@Override
	public void setPlayerTime(long time, boolean relative) {
		this.getBukkitHandle().setPlayerTime(time, relative);
	}

	@Override
	public void setSaturation(float value) {
		this.getBukkitHandle().setSaturation(value);
	}

	@Override
	public void setSleepingIgnored(boolean isSleeping) {
		this.getBukkitHandle().setSleepingIgnored(isSleeping);
	}

	@Override
	public void setSneaking(boolean sneak) {
		this.getBukkitHandle().setSneaking(sneak);
	}

	@Override
	public void setSprinting(boolean sprinting) {
		this.getBukkitHandle().setSprinting(sprinting);
	}

	@Override
	public void setTotalExperience(int exp) {
		this.getBukkitHandle().setTotalExperience(exp);
	}

	@Override
	public void showPlayer(Player player) {
		this.getBukkitHandle().showPlayer(player);
	}

	@Override
	@Deprecated
	public void updateInventory() {
		this.getBukkitHandle().updateInventory();
	}

	@Override
	public void abandonConversation(Conversation conversation) {
		this.getBukkitHandle().abandonConversation(conversation);
	}

	@Override
	public void acceptConversationInput(String input) {
		this.getBukkitHandle().acceptConversationInput(input);
	}

	@Override
	public boolean beginConversation(Conversation conversation) {
		return this.getBukkitHandle().beginConversation(conversation);
	}

	@Override
	public boolean isConversing() {
		return this.getBukkitHandle().isConversing();
	}

	@Override
	public void sendMessage(String message) {
		this.getBukkitHandle().sendMessage(message);
	}

	@Override
	public void sendMessage(String[] messages) {
		this.getBukkitHandle().sendMessage(messages);
	}

	@Override
	public long getFirstPlayed() {
		return this.getBukkitHandle().getFirstPlayed();
	}

	@Override
	public long getLastPlayed() {
		return this.getBukkitHandle().getLastPlayed();
	}

	@Override
	public Player getPlayer() {
		return this.getBukkitHandle().getPlayer();
	}

	@Override
	public boolean hasPlayedBefore() {
		return this.getBukkitHandle().hasPlayedBefore();
	}

	@Override
	public boolean isBanned() {
		return this.getBukkitHandle().isBanned();
	}

	@Override
	public boolean isOnline() {
		return this.getBukkitHandle().isOnline();
	}

	@Override
	public boolean isWhitelisted() {
		return this.getBukkitHandle().isWhitelisted();
	}

	@Override
	public void setBanned(boolean banned) {
		this.getBukkitHandle().setBanned(banned);
	}

	@Override
	public void setWhitelisted(boolean whiteListed) {
		this.getBukkitHandle().setWhitelisted(whiteListed);
	}

	@Override
	public Map<String, Object> serialize() {
		return this.getBukkitHandle().serialize();
	}

	@Override
	public Set<String> getListeningPluginChannels() {
		return this.getBukkitHandle().getListeningPluginChannels();
	}

	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {
		this.getBukkitHandle().sendPluginMessage(source, channel, message);
	}

}
