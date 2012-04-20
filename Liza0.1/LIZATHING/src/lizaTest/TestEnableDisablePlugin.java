//package lizaTest;
//
//import static org.junit.Assert.*;
//import static org.powermock.api.mockito.PowerMockito.*;
//import static org.mockito.Mockito.*;
//
//import java.io.File;
//import java.lang.reflect.Field;
//
//import org.bukkit.Server;
//import org.bukkit.craftbukkit.CraftServer;
//import org.bukkit.plugin.InvalidDescriptionException;
//import org.bukkit.plugin.InvalidPluginException;
//import org.bukkit.plugin.PluginManager;
//import org.bukkit.plugin.UnknownDependencyException;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//
//import LizaCraft.LizaCraftTestModule;
//
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(CraftServer.class)
//public class TestEnableDisablePlugin {
//
//	private LizaCraftTestModule testModule;
//	private CraftServer mockServer;
//	private PluginManager mockPluginManager;
//	
//	@Before
//	public void startMock() {
//		this.mockServer = PowerMockito.mock(CraftServer.class);
//		
//		this.mockPluginManager = PowerMockito.mock(PluginManager.class);
//				
//		Class<? extends CraftServer> craftServer = ((CraftServer)this.mockServer).getClass();
//		Field pluginManagerField;
//		try {
//			pluginManagerField = craftServer.getDeclaredField("pluginManager");
//			pluginManagerField.setAccessible(true);
//			pluginManagerField.set(this.mockServer, this.mockPluginManager);
//			pluginManagerField.setAccessible(false);
//		} catch (Exception e) {
//			// TODO: do some proper exception handling
//			e.printStackTrace();
//		}
//		
//		this.testModule = new LizaCraftTestModule("Unit Test", mockServer);
//	}
//	
//	@Test
//	public void testLoadPlugin() {
//		File file = new File("sampleFile.jar");
//		
//		this.testModule.loadPlugin(file);
//		
//		verify(this.mockServer).getPluginManager();
//		try {
//			verify(this.mockPluginManager).loadPlugin(file);
//		} catch (UnknownDependencyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvalidPluginException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvalidDescriptionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//}
