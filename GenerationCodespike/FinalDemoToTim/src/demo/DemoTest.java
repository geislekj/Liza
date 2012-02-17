package demo;

import static org.junit.Assert.*;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Liza.LizaBlock;
import Liza.LizaPlayer;
import Liza.LizaServer;
import LizaCraft.LizaCraftTestModule;
import LizaCraft.Block.LizaCraftBlock;
import LizaCraft.Entity.LizaCraftPlayer;

public class DemoTest {
	
	private static final int MAX_COUNTER = 1000;
	
	private static final double DELTA = 2.0;
	
	private static final double COAL_ORE_EXPECTED = 15.0;
	private static final double IRON_ORE_EXPECTED = 25.0;
	private static final double REDSTONE_ORE_EXPECTED = 30.0;
	private static final double GOLD_ORE_EXPECTED = 50.0;
	private static final double LAPIS_ORE_EXPECTED = 70.0;
	private static final double DIAMOND_ORE_EXPECTED = 75.0;
	private static final double DEFAULT_EXPECTED = 10.0;
	
	private static LizaCraftTestModule testModule;
	private static LizaServer server;
	private static DemoTestListener listener;
	private static LizaPlayer player;
	private static LizaBlock theBlock;
	
	protected static int xpCounter;

	/**
	 * Set up the server once
	 */
	@BeforeClass
	public static void setUpOnce() {
		listener = new DemoTestListener();
		
		testModule = new LizaCraftTestModule("My Test");
		testModule.startModule();
		server = testModule.getServer(); // TODO Make this not vital 
		
		testModule.enableEvents();
		
		testModule.getEventListener().registerEvent(PlayerJoinEvent.class);
		testModule.getEventListener().registerEvent(PlayerQuitEvent.class, listener);
		testModule.getEventListener().registerEvent(PlayerExpChangeEvent.class, listener);
		
		PlayerJoinEvent event = (PlayerJoinEvent)testModule.waitForEvent(PlayerJoinEvent.class);
		player = new LizaCraftPlayer(event.getPlayer());
		

		theBlock = new LizaCraftBlock(player.getWorld().getBlockAt(player.getLocation()).getRelative(BlockFace.NORTH));
	}
	
	/**
	 * Tear down the server
	 */
	@AfterClass
	public static void tearDownOnce() {
		testModule.endModule();
	}
	
	
	@Before
	public void setUp() {
		// Set up test environment
		player.setLevel(0);
		player.setExp(0);
		pause(1000);
		xpCounter = 0;
	}
	
	private void pause(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void blockBreak(LizaBlock toBeBroken) {
		BlockBreakEvent event = new BlockBreakEvent(toBeBroken, player);
		testModule.spoofEvent(event);
		
		pause(50);
	}
	
	
	@Test
	public void testCoalOre() {
		
		theBlock.setType(Material.COAL_ORE);
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(15000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, COAL_ORE_EXPECTED, DELTA);
	}
	
	@Test
	public void testIronOre() {
		
		theBlock.setType(Material.IRON_ORE);
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(15000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, IRON_ORE_EXPECTED, DELTA);
	}
	
	@Test
	public void testRedstoneOre() {
		
		theBlock.setType(Material.REDSTONE_ORE);
		
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(15000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, REDSTONE_ORE_EXPECTED, DELTA);
	}
	
	@Test
	public void testGoldOre() {
		theBlock.setType(Material.GOLD_ORE);
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(15000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, GOLD_ORE_EXPECTED, DELTA);
	}
	
	@Test
	public void testLapisOre() {
		theBlock.setType(Material.LAPIS_ORE);
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(25000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, LAPIS_ORE_EXPECTED, DELTA);
	}
	
	@Test
	public void testDiamondOre() {
		theBlock.setType(Material.DIAMOND_ORE);
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(30000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, DIAMOND_ORE_EXPECTED, DELTA);
	}
	
	@Test
	public void testDirtBlock() {
		theBlock.setType(Material.DIRT);
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(15000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, DEFAULT_EXPECTED, DELTA);
	}
	
	@Test
	public void testStoneBlock() {
		theBlock.setType(Material.STONE);
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(15000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, DEFAULT_EXPECTED, DELTA);
	}
	
	@Test
	public void testWoodBlock() {
		theBlock.setType(Material.WOOD);
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(15000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, DEFAULT_EXPECTED, DELTA);
	}
	
	@Test
	public void testDoor() {
		theBlock.setType(Material.WOOD_DOOR);
		
		for (int i=0; i < MAX_COUNTER; i++) {
			blockBreak(theBlock);
		}
		
		pause(15000);
		
		float actual = ((float)xpCounter/MAX_COUNTER)*100;
		
		assertEquals(actual, DEFAULT_EXPECTED, DELTA);
	}
}
