package LizaCraft;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;

import Liza.LizaServer;
import LizaCraft.Events.EventEnabler;
import LizaCraft.Events.LizaPlugin;

// TODO: Auto-generated Javadoc
/**
 * The Class LizaCraftTestModule.
 */
public class LizaCraftTestModule {

	private ServerGrabber serverGrabber = new ServerGrabber();
	private EventEnabler eventEnabler = new EventEnabler();

	private LizaServerThread serverThread;
	private LizaServer server;

	private LizaPlugin eventListener;

	private String name;

	private boolean waiting = false;
	private Event waitingOn;

	private Map<File, Plugin> plugins = new HashMap<File, Plugin>();

	/**
	 * Instantiates a new LizaCraftTestModule.
	 * 
	 * @param name
	 *            The name of the module
	 */
	public LizaCraftTestModule(String name) {
		this.name = name;

		this.eventListener = new LizaPlugin();
	}

	/**
	 * Instantiates a new LizaCraftTestModule with an injected server. For use
	 * with testing.
	 * 
	 * @param name
	 *            The name of the module
	 * @param server
	 *            The Bukkit server
	 */
	public LizaCraftTestModule(String name, Server server) {
		this(name);
		this.server = new LizaCraftServer(server);
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Disable listening to events on the server.
	 */
	public void disableEvents() {
		this.server.getPluginManager().disablePlugin(this.eventListener);
	}

	/**
	 * Enable listening to events on the server.
	 */
	public void enableEvents() {
		eventEnabler.enableEvents(this.server, this.eventListener);
	}

	/**
	 * Retrieves the LizaServer object.
	 * 
	 * @return the server object
	 */
	public LizaServer getServer() {
		return this.server;
	}

	/**
	 * Wait until an event occurs on the server.
	 * 
	 * Note: The event type must first be registered with the event listener.
	 * 
	 * @param event
	 *            The event type to wait on
	 * @return The event object
	 */
	public Event waitForEvent(Class<? extends Event> event) {
		this.waiting = true;
		this.eventListener.waitForEvent(event, this);
		while (this.waiting) {
		}
		return this.waitingOn;
	}

	/**
	 * Release the test module from waiting on a certain event.
	 * 
	 * @param event
	 *            the event type
	 */
	public void release(Event event) {
		this.waitingOn = event;
		this.waiting = false;
	}

	/**
	 * Gets the event listener.
	 * 
	 * @return the event listener
	 */
	public LizaPlugin getEventListener() {
		return this.eventListener;
	}

	/**
	 * Starts the thread that runs the server.
	 */
	public void startModule() {
		this.serverThread = new LizaServerThread(this.name);
		this.serverThread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		this.server = new LizaCraftServer(this.serverGrabber.searchThreads());
	}

	/**
	 * End module.
	 */
	public void endModule() {
		this.server.shutdown();
		this.serverThread.interrupt();
	}

	/**
	 * Spoof event.
	 * 
	 * @param e
	 *            the e
	 */
	public void spoofEvent(Event e) {
		this.server.getPluginManager().callEvent(e);
	}

	/**
	 * Load plugin.
	 * 
	 * @param file
	 *            the file
	 * @return the plugin
	 */
	public Plugin loadPlugin(File file) {
		Plugin ret = null;

		try {
			ret = this.server.getPluginManager().loadPlugin(file);
			this.server.getPluginManager().enablePlugin(ret);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (ret != null) {
			this.plugins.put(file, ret);
		}

		return ret;
	}

	/**
	 * Enable plugin.
	 * 
	 * @param file
	 *            the file
	 */
	public void enablePlugin(File file) {
		this.enablePlugin(this.plugins.get(file));
	}

	/**
	 * Enable plugin.
	 * 
	 * @param plugin
	 *            the plugin
	 */
	public void enablePlugin(Plugin plugin) {
		if (plugin != null) {
			this.server.getPluginManager().enablePlugin(plugin);
		}
	}

	/**
	 * Disable plugin.
	 * 
	 * @param file
	 *            the file
	 */
	public void disablePlugin(final File file) {
		Plugin plugin = this.plugins.get(file);

		if (plugin != null) {
			this.server.getPluginManager().disablePlugin(plugin);
		}
	}
}
