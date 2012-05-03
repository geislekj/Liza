//package lizaTest;
//
//import static org.junit.Assert.*;
//import static org.powermock.api.easymock.PowerMock.*;
//import static org.mockito.Mockito.*;
//
//import java.io.File;
//import java.lang.reflect.Field;
//
//import org.bukkit.craftbukkit.CraftServer;
//import org.bukkit.plugin.PluginManager;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.powermock.api.easymock.PowerMock;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//
//import LizaCraft.LizaCraftTestModule;
//
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(CraftServer.class)
//public class TestEasyMockEnableDisablePlugin {
//
//	private LizaCraftTestModule testModule;
//	private CraftServer mockServer;
//	private PluginManager mockPluginManager;
//	
//	@Before
//	public void setUp() {
//		this.mockServer = PowerMock.createMock(CraftServer.class);
//		
//		this.testModule = new LizaCraftTestModule("Unit Test", mockServer);
//	}
//	
//	@Test
//	public void testLoadPlugin() {
//		File file = new File("lol.jar");
//		
//		this.mockServer.getPluginManager();
//		
//		replay(this.mockServer);
//		
//		testModule.loadPlugin(file);
//		
//		verify(this.mockServer);
//	}
//}
