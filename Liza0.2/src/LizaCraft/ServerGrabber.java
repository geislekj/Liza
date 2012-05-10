package LizaCraft;

import java.lang.reflect.Field;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.ThreadServerApplication;

import org.bukkit.craftbukkit.CraftServer;

// TODO: Auto-generated Javadoc
/**
 * The Class ServerGrabber.
 */
public class ServerGrabber {

	/** The Constant MINECRAFT_SERVER_THREAD_NAME. */
	private static final String MINECRAFT_SERVER_THREAD_NAME = "Server thread";
	
	/** The Constant MINECRAFT_SERVER_FIELD_NAME. */
	private static final String MINECRAFT_SERVER_FIELD_NAME = "a";

	/**
	 * Search threads.
	 *
	 * @return the craft server
	 */
	protected CraftServer searchThreads() {

		Thread[] threads;
		ThreadServerApplication tsa = null;
		
		while (tsa == null) {
			threads = this.getThreads();
			
			tsa = getThreadServerApplication(threads);
		}
		
		MinecraftServer minecraftServer = getMinecraftServer(tsa);

		return minecraftServer.server;
	}

	/**
	 * Gets the minecraft server.
	 *
	 * @param serverThread the server thread
	 * @return the minecraft server
	 */
	private MinecraftServer getMinecraftServer(ThreadServerApplication serverThread) {
		Class<? extends ThreadServerApplication> serverThreadClass = serverThread.getClass();
		Field minecraftServerField;
		MinecraftServer minecraftServer = null;
		try {
			minecraftServerField = serverThreadClass.getDeclaredField(MINECRAFT_SERVER_FIELD_NAME);
			minecraftServerField.setAccessible(true);
			minecraftServer = (MinecraftServer) minecraftServerField.get(serverThread);
			minecraftServerField.setAccessible(false);
		} catch (Exception e) { // lol
			// TODO: do some proper exception handling
			e.printStackTrace();
		}
		
		return minecraftServer;
	}

	/**
	 * Gets the thread server application.
	 *
	 * @param threads the threads
	 * @return the thread server application
	 */
	private ThreadServerApplication getThreadServerApplication(Thread[] threads) {

		ThreadServerApplication serverThread = null;

		for (Thread t : threads) {
			if (t != null && t.getName() != null
					&& t.getName().equals(MINECRAFT_SERVER_THREAD_NAME)) {
				serverThread = (ThreadServerApplication) t;
				break;
			}
		}
		return serverThread;
	}

	/**
	 * Gets the threads.
	 *
	 * @return the threads
	 */
	private Thread[] getThreads() {

		ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();

		while (rootGroup.getParent() != null) {
			rootGroup = rootGroup.getParent();
		}
		
		Thread threads[] = new Thread[rootGroup.activeCount()];
		
		// activeCount() only provides an estimate for the number of
		// running threads, so this loop ensures that all threads are
		// captured.
		while (rootGroup.enumerate(threads, true) >= threads.length) {
			threads = new Thread[threads.length * 2];
		}
		
		return threads;

	}

}
