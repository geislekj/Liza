package LizaCraft.Events;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import Liza.LizaServer;

/**
 * The Class EventEnabler.
 */
public class EventEnabler {

	/** The Constant PLUGIN_MANAGER_LIST_NAME. */
	private static final String PLUGIN_MANAGER_LIST_NAME = "plugins";
	
	/** The Constant PLUGIN_MANAGER_FILE_ASSOCIATION_MAP. */
	private static final String PLUGIN_MANAGER_FILE_ASSOCIATION_MAP = "fileAssociations";

	/** The Constant PLUGIN_ENABLED_FIELD_NAME. */
	private static final String PLUGIN_ENABLED_FIELD_NAME = "isEnabled";
	
	/** The Constant PLUGIN_SERVER_FIELD_NAME. */
	private static final String PLUGIN_SERVER_FIELD_NAME = "server";
	
	/** The Constant PLUGIN_LOADER_FIELD_NAME. */
	private static final String PLUGIN_LOADER_FIELD_NAME = "loader";
	
	/** The Constant PLUGIN_DESCRIPTION_FIELD_NAME. */
	private static final String PLUGIN_DESCRIPTION_FIELD_NAME = "description";
	
	/** The Constant PLUGIN_LOOKUP_FIELD_NAME. */
	private static final String PLUGIN_LOOKUP_FIELD_NAME = "lookupNames";

	/** The Constant PLUGIN_EXTENSION. */
	private static final String PLUGIN_EXTENSION = ".jar";

	
	/**
	 * Enable events.
	 *
	 * @param server the server
	 * @param eventListener the event listener
	 */
	public void enableEvents(LizaServer server, LizaPlugin eventListener) {

		Class<? extends PluginManager> pluginManager = ((SimplePluginManager) server
				.getPluginManager()).getClass();
		
		PluginLoader pluginLoader = getPluginLoader(server, pluginManager);

		PluginDescriptionFile desc = new PluginDescriptionFile(
				LizaPlugin.PLUGIN_NAME, null, null);

		initializePlugin(server, eventListener, pluginLoader, desc);

		addPlugin(server, eventListener, pluginManager);

		eventListener.onEnable();
	}

	/**
	 * Adds the plugin.
	 *
	 * @param server the server
	 * @param eventListener the event listener
	 * @param pluginManager the plugin manager
	 */
	@SuppressWarnings("unchecked")
	private void addPlugin(LizaServer server, LizaPlugin eventListener,
			Class<? extends PluginManager> pluginManager) {
		Field pluginList, lookupMap;
		List<Plugin> plugins;
		try {
			pluginList = pluginManager
					.getDeclaredField(PLUGIN_MANAGER_LIST_NAME);
			pluginList.setAccessible(true);
			plugins = (List<Plugin>) pluginList.get(server.getPluginManager());
			plugins.add(eventListener);
			pluginList.set(server.getPluginManager(), plugins);
			pluginList.setAccessible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Map<String, Plugin> lookupNames;
		try {
			lookupMap = pluginManager
					.getDeclaredField(PLUGIN_LOOKUP_FIELD_NAME);
			lookupMap.setAccessible(true);
			lookupNames = (HashMap<String, Plugin>) lookupMap.get(server
					.getPluginManager());
			lookupNames.put(LizaPlugin.PLUGIN_NAME, eventListener);
			lookupMap.set(server.getPluginManager(), lookupNames);
			lookupMap.setAccessible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize plugin.
	 *
	 * @param server the server
	 * @param eventListener the event listener
	 * @param pluginLoader the plugin loader
	 * @param desc the desc
	 */
	private void initializePlugin(LizaServer server, LizaPlugin eventListener,
			PluginLoader pluginLoader, PluginDescriptionFile desc) {

		Field isEnabled, loaderField, serverField, descriptionField;
		Class<? extends JavaPlugin> plugin = eventListener.getClass();
		try {
			isEnabled = plugin.getSuperclass().getDeclaredField(
					PLUGIN_ENABLED_FIELD_NAME);
			isEnabled.setAccessible(true);
			isEnabled.set(eventListener, true);
			isEnabled.setAccessible(false);

			loaderField = plugin.getSuperclass().getDeclaredField(
					PLUGIN_LOADER_FIELD_NAME);
			loaderField.setAccessible(true);
			loaderField.set(eventListener, pluginLoader);
			loaderField.setAccessible(false);

			serverField = plugin.getSuperclass().getDeclaredField(
					PLUGIN_SERVER_FIELD_NAME);
			serverField.setAccessible(true);
			serverField.set(eventListener, server);
			serverField.setAccessible(false);

			descriptionField = plugin.getSuperclass().getDeclaredField(
					PLUGIN_DESCRIPTION_FIELD_NAME);
			descriptionField.setAccessible(true);
			descriptionField.set(eventListener, desc);
			descriptionField.setAccessible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the plugin loader.
	 *
	 * @param server the server
	 * @param pluginManager the plugin manager
	 * @return the plugin loader
	 */
	@SuppressWarnings("unchecked")
	private PluginLoader getPluginLoader(LizaServer server,
			Class<? extends PluginManager> pluginManager) {
		Field pluginManagerMap;
		PluginLoader pluginLoader = null;
		try {
			pluginManagerMap = pluginManager
					.getDeclaredField(PLUGIN_MANAGER_FILE_ASSOCIATION_MAP);
			pluginManagerMap.setAccessible(true);
			Map<Pattern, PluginLoader> fileAssociations = ((HashMap<Pattern, PluginLoader>) pluginManagerMap
					.get(server.getPluginManager()));

			for (Pattern p : fileAssociations.keySet()) {
				Matcher match = p.matcher(PLUGIN_EXTENSION);
				if (match.find()) {
					pluginLoader = fileAssociations.get(p);
				}
			}
			pluginManagerMap.setAccessible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pluginLoader;
	}

}
