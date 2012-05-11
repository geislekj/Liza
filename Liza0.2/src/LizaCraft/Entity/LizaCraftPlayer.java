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
	 * LizaCraftPlayer Constructor.
	 *
	 * @param player A Bukkit Player
	 */
	public LizaCraftPlayer(Player player) {
		super(player);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftHumanEntity#getBukkitHandle()
	 */
	@Override
	public Player getBukkitHandle() {
		return (Player) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#awardAchievement(org.bukkit.Achievement)
	 */
	@Override
	public void awardAchievement(Achievement achievement) {
		this.getBukkitHandle().awardAchievement(achievement);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#canSee(org.bukkit.entity.Player)
	 */
	@Override
	public boolean canSee(Player player) {
		return this.getBukkitHandle().canSee(player);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#chat(java.lang.String)
	 */
	@Override
	public void chat(String msg) {
		this.getBukkitHandle().chat(msg);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getAddress()
	 */
	@Override
	public InetSocketAddress getAddress() {
		return this.getBukkitHandle().getAddress();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getAllowFlight()
	 */
	@Override
	public boolean getAllowFlight() {
		return this.getBukkitHandle().getAllowFlight();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getBedSpawnLocation()
	 */
	@Override
	public Location getBedSpawnLocation() {
		return this.getBukkitHandle().getBedSpawnLocation();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getCompassTarget()
	 */
	@Override
	public Location getCompassTarget() {
		return this.getBukkitHandle().getCompassTarget();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getDisplayName()
	 */
	@Override
	public String getDisplayName() {
		return this.getBukkitHandle().getDisplayName();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getExhaustion()
	 */
	@Override
	public float getExhaustion() {
		return this.getBukkitHandle().getExhaustion();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getExp()
	 */
	@Override
	public float getExp() {
		return this.getBukkitHandle().getExp();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getFoodLevel()
	 */
	@Override
	public int getFoodLevel() {
		return this.getBukkitHandle().getFoodLevel();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getLevel()
	 */
	@Override
	public int getLevel() {
		return this.getBukkitHandle().getLevel();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getPlayerListName()
	 */
	@Override
	public String getPlayerListName() {
		return this.getBukkitHandle().getPlayerListName();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getPlayerTime()
	 */
	@Override
	public long getPlayerTime() {
		return this.getBukkitHandle().getPlayerTime();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getPlayerTimeOffset()
	 */
	@Override
	public long getPlayerTimeOffset() {
		return this.getBukkitHandle().getPlayerTimeOffset();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getSaturation()
	 */
	@Override
	public float getSaturation() {
		return this.getBukkitHandle().getSaturation();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#getTotalExperience()
	 */
	@Override
	public int getTotalExperience() {
		return this.getBukkitHandle().getTotalExperience();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#giveExp(int)
	 */
	@Override
	public void giveExp(int amount) {
		this.getBukkitHandle().giveExp(amount);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#hidePlayer(org.bukkit.entity.Player)
	 */
	@Override
	public void hidePlayer(Player player) {
		this.getBukkitHandle().hidePlayer(player);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#incrementStatistic(org.bukkit.Statistic)
	 */
	@Override
	public void incrementStatistic(Statistic statistic) {
		this.getBukkitHandle().incrementStatistic(statistic);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#incrementStatistic(org.bukkit.Statistic, int)
	 */
	@Override
	public void incrementStatistic(Statistic statistic, int amount) {
		this.getBukkitHandle().incrementStatistic(statistic, amount);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#incrementStatistic(org.bukkit.Statistic, org.bukkit.Material)
	 */
	@Override
	public void incrementStatistic(Statistic statistic, Material material) {
		this.getBukkitHandle().incrementStatistic(statistic, material);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#incrementStatistic(org.bukkit.Statistic, org.bukkit.Material, int)
	 */
	@Override
	public void incrementStatistic(Statistic statistic, Material material,
			int amount) {
		this.getBukkitHandle().incrementStatistic(statistic, material, amount);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#isPlayerTimeRelative()
	 */
	@Override
	public boolean isPlayerTimeRelative() {
		return this.getBukkitHandle().isPlayerTimeRelative();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#isSleepingIgnored()
	 */
	@Override
	public boolean isSleepingIgnored() {
		return this.getBukkitHandle().isSleepingIgnored();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#isSneaking()
	 */
	@Override
	public boolean isSneaking() {
		return this.getBukkitHandle().isSneaking();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#isSprinting()
	 */
	@Override
	public boolean isSprinting() {
		return this.getBukkitHandle().isSprinting();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#kickPlayer(java.lang.String)
	 */
	@Override
	public void kickPlayer(String message) {
		this.getBukkitHandle().kickPlayer(message);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#loadData()
	 */
	@Override
	public void loadData() {
		this.getBukkitHandle().loadData();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#performCommand(java.lang.String)
	 */
	@Override
	public boolean performCommand(String command) {
		return this.getBukkitHandle().performCommand(command);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#playEffect(org.bukkit.Location, org.bukkit.Effect, int)
	 */
	@Override
	public void playEffect(Location loc, Effect effect, int data) {
		this.getBukkitHandle().playEffect(loc, effect, data);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#playEffect(org.bukkit.Location, org.bukkit.Effect, java.lang.Object)
	 */
	@Override
	public <T> void playEffect(Location loc, Effect effect, T data) {
		this.getBukkitHandle().playEffect(loc, effect, data);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#playNote(org.bukkit.Location, byte, byte)
	 */
	@Override
	public void playNote(Location loc, byte instrument, byte note) {
		this.getBukkitHandle().playNote(loc, instrument, note);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#playNote(org.bukkit.Location, org.bukkit.Instrument, org.bukkit.Note)
	 */
	@Override
	public void playNote(Location loc, Instrument instrument, Note note) {
		this.getBukkitHandle().playNote(loc, instrument, note);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#resetPlayerTime()
	 */
	@Override
	public void resetPlayerTime() {
		this.getBukkitHandle().resetPlayerTime();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#saveData()
	 */
	@Override
	public void saveData() {
		this.getBukkitHandle().saveData();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#sendBlockChange(org.bukkit.Location, org.bukkit.Material, byte)
	 */
	@Override
	public void sendBlockChange(Location loc, Material material, byte data) {
		this.getBukkitHandle().sendBlockChange(loc, material, data);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#sendBlockChange(org.bukkit.Location, int, byte)
	 */
	@Override
	public void sendBlockChange(Location loc, int material, byte data) {
		this.getBukkitHandle().sendBlockChange(loc, material, data);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#sendChunkChange(org.bukkit.Location, int, int, int, byte[])
	 */
	@Override
	public boolean sendChunkChange(Location loc, int sx, int sy, int sz,
			byte[] data) {
		return this.getBukkitHandle().sendChunkChange(loc, sx, sy, sz, data);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#sendMap(org.bukkit.map.MapView)
	 */
	@Override
	public void sendMap(MapView map) {
		this.getBukkitHandle().sendMap(map);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#sendRawMessage(java.lang.String)
	 */
	@Override
	public void sendRawMessage(String message) {
		this.getBukkitHandle().sendRawMessage(message);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setAllowFlight(boolean)
	 */
	@Override
	public void setAllowFlight(boolean flight) {
		this.getBukkitHandle().setAllowFlight(flight);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setBedSpawnLocation(org.bukkit.Location)
	 */
	@Override
	public void setBedSpawnLocation(Location location) {
		this.getBukkitHandle().setBedSpawnLocation(location);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setCompassTarget(org.bukkit.Location)
	 */
	@Override
	public void setCompassTarget(Location location) {
		this.getBukkitHandle().setCompassTarget(location);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setDisplayName(java.lang.String)
	 */
	@Override
	public void setDisplayName(String name) {
		this.getBukkitHandle().setDisplayName(name);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setExhaustion(float)
	 */
	@Override
	public void setExhaustion(float value) {
		this.getBukkitHandle().setExhaustion(value);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setExp(float)
	 */
	@Override
	public void setExp(float exp) {
		this.getBukkitHandle().setExp(exp);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setFoodLevel(int)
	 */
	@Override
	public void setFoodLevel(int value) {
		this.getBukkitHandle().setFoodLevel(value);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setLevel(int)
	 */
	@Override
	public void setLevel(int level) {
		this.getBukkitHandle().setLevel(level);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setPlayerListName(java.lang.String)
	 */
	@Override
	public void setPlayerListName(String name) {
		this.getBukkitHandle().setPlayerListName(name);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setPlayerTime(long, boolean)
	 */
	@Override
	public void setPlayerTime(long time, boolean relative) {
		this.getBukkitHandle().setPlayerTime(time, relative);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setSaturation(float)
	 */
	@Override
	public void setSaturation(float value) {
		this.getBukkitHandle().setSaturation(value);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setSleepingIgnored(boolean)
	 */
	@Override
	public void setSleepingIgnored(boolean isSleeping) {
		this.getBukkitHandle().setSleepingIgnored(isSleeping);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setSneaking(boolean)
	 */
	@Override
	public void setSneaking(boolean sneak) {
		this.getBukkitHandle().setSneaking(sneak);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setSprinting(boolean)
	 */
	@Override
	public void setSprinting(boolean sprinting) {
		this.getBukkitHandle().setSprinting(sprinting);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#setTotalExperience(int)
	 */
	@Override
	public void setTotalExperience(int exp) {
		this.getBukkitHandle().setTotalExperience(exp);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#showPlayer(org.bukkit.entity.Player)
	 */
	@Override
	public void showPlayer(Player player) {
		this.getBukkitHandle().showPlayer(player);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Player#updateInventory()
	 */
	@Override
	@Deprecated
	public void updateInventory() {
		this.getBukkitHandle().updateInventory();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.conversations.Conversable#abandonConversation(org.bukkit.conversations.Conversation)
	 */
	@Override
	public void abandonConversation(Conversation conversation) {
		this.getBukkitHandle().abandonConversation(conversation);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.conversations.Conversable#acceptConversationInput(java.lang.String)
	 */
	@Override
	public void acceptConversationInput(String input) {
		this.getBukkitHandle().acceptConversationInput(input);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.conversations.Conversable#beginConversation(org.bukkit.conversations.Conversation)
	 */
	@Override
	public boolean beginConversation(Conversation conversation) {
		return this.getBukkitHandle().beginConversation(conversation);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.conversations.Conversable#isConversing()
	 */
	@Override
	public boolean isConversing() {
		return this.getBukkitHandle().isConversing();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.command.CommandSender#sendMessage(java.lang.String)
	 */
	@Override
	public void sendMessage(String message) {
		this.getBukkitHandle().sendMessage(message);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.command.CommandSender#sendMessage(java.lang.String[])
	 */
	@Override
	public void sendMessage(String[] messages) {
		this.getBukkitHandle().sendMessage(messages);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.OfflinePlayer#getFirstPlayed()
	 */
	@Override
	public long getFirstPlayed() {
		return this.getBukkitHandle().getFirstPlayed();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.OfflinePlayer#getLastPlayed()
	 */
	@Override
	public long getLastPlayed() {
		return this.getBukkitHandle().getLastPlayed();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.OfflinePlayer#getPlayer()
	 */
	@Override
	public Player getPlayer() {
		return this.getBukkitHandle().getPlayer();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.OfflinePlayer#hasPlayedBefore()
	 */
	@Override
	public boolean hasPlayedBefore() {
		return this.getBukkitHandle().hasPlayedBefore();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.OfflinePlayer#isBanned()
	 */
	@Override
	public boolean isBanned() {
		return this.getBukkitHandle().isBanned();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.OfflinePlayer#isOnline()
	 */
	@Override
	public boolean isOnline() {
		return this.getBukkitHandle().isOnline();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.OfflinePlayer#isWhitelisted()
	 */
	@Override
	public boolean isWhitelisted() {
		return this.getBukkitHandle().isWhitelisted();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.OfflinePlayer#setBanned(boolean)
	 */
	@Override
	public void setBanned(boolean banned) {
		this.getBukkitHandle().setBanned(banned);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.OfflinePlayer#setWhitelisted(boolean)
	 */
	@Override
	public void setWhitelisted(boolean whiteListed) {
		this.getBukkitHandle().setWhitelisted(whiteListed);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.configuration.serialization.ConfigurationSerializable#serialize()
	 */
	@Override
	public Map<String, Object> serialize() {
		return this.getBukkitHandle().serialize();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.plugin.messaging.PluginMessageRecipient#getListeningPluginChannels()
	 */
	@Override
	public Set<String> getListeningPluginChannels() {
		return this.getBukkitHandle().getListeningPluginChannels();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.plugin.messaging.PluginMessageRecipient#sendPluginMessage(org.bukkit.plugin.Plugin, java.lang.String, byte[])
	 */
	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {
		this.getBukkitHandle().sendPluginMessage(source, channel, message);
	}

}
