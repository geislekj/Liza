package lizaTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Fish;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.entity.Villager;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Liza.LizaEntity;
import Liza.LizaWorld;
import LizaCraft.LizaCraftWorld;


public class TestGetLizaEntityRange {

	private LizaWorld lizaWorld;
	private World mockMCWorld;
	
	private static int RADIUS = 15;
	
	private Arrow arrow;
	private Boat boat;
	private Chicken chicken;
	private Egg egg;
	private ExperienceOrb xpOrb;
	private Villager testificate;
	private ThrownPotion potion;
	private Ghast ghast;
	private Fish fish;
	private Fireball fireball;
	private Giant giant;
	private TNTPrimed tnt;
	private Snowball snowball;
	
	private Location refPoint;
	
	private List<Entity> entityList = new ArrayList<Entity>();
	
	private List<Entity> farEntities = new ArrayList<Entity>();
	private List<Entity> nearEntities = new ArrayList<Entity>();
	
	@Before
	public void setUp() {
		this.mockMCWorld = Mockito.mock(World.class);
		
		this.setUpMockEntities();
		
		this.refPoint = new Location(this.mockMCWorld, 0, 0, 0);
		
		this.lizaWorld = new LizaCraftWorld(this.mockMCWorld);
		
		when(this.mockMCWorld.getEntities()).thenReturn(this.entityList);
	}
	
	private void setUpMockEntities() {
		this.arrow = Mockito.mock(Arrow.class);
		this.boat = Mockito.mock(Boat.class);
		this.chicken = Mockito.mock(Chicken.class);
		this.egg = Mockito.mock(Egg.class);
		this.xpOrb = Mockito.mock(ExperienceOrb.class);
		this.testificate = Mockito.mock(Villager.class);
		this.potion = Mockito.mock(ThrownPotion.class);
		this.ghast = Mockito.mock(Ghast.class);
		this.fish = Mockito.mock(Fish.class);
		this.fireball = Mockito.mock(Fireball.class);
		this.giant = Mockito.mock(Giant.class);
		this.tnt = Mockito.mock(TNTPrimed.class);
		this.snowball = Mockito.mock(Snowball.class);
		
		when(this.arrow.getLocation()).thenReturn(new Location(this.mockMCWorld, -30, 0, 0));
		when(this.boat.getLocation()).thenReturn(new Location(this.mockMCWorld, -15, 0, 0));
		
		when(this.chicken.getLocation()).thenReturn(new Location(this.mockMCWorld, 0, 0, 30));
		when(this.egg.getLocation()).thenReturn(new Location(this.mockMCWorld, 0, 0, 15));
		when(this.xpOrb.getLocation()).thenReturn(new Location(this.mockMCWorld, 0, 0, 5));
		
		when(this.testificate.getLocation()).thenReturn(new Location(this.mockMCWorld, 0, 0, -15));
		when(this.potion.getLocation()).thenReturn(new Location(this.mockMCWorld, 0, 0, -30));
		
		when(this.ghast.getLocation()).thenReturn(new Location(this.mockMCWorld, 15, 0, 0));
		when(this.fish.getLocation()).thenReturn(new Location(this.mockMCWorld, 30, 0, 0));
		
		when(this.fireball.getLocation()).thenReturn(new Location(this.mockMCWorld, 0, 0, 0));
		
		when(this.giant.getLocation()).thenReturn(new Location(this.mockMCWorld, 0, 5, 0));
		when(this.tnt.getLocation()).thenReturn(new Location(this.mockMCWorld, 0, 30, 0));
		when(this.snowball.getLocation()).thenReturn(new Location(this.mockMCWorld, 0, -15, 0));
		
		this.entityList.add(this.arrow);
		this.entityList.add(this.boat);
		this.entityList.add(this.chicken);
		this.entityList.add(this.egg);
		this.entityList.add(this.xpOrb);
		this.entityList.add(this.testificate);
		this.entityList.add(this.potion);
		this.entityList.add(this.ghast);
		this.entityList.add(this.fish);
		this.entityList.add(this.fireball);
		this.entityList.add(this.giant);
		this.entityList.add(this.tnt);
		this.entityList.add(this.snowball);
		
		this.farEntities.add(this.arrow);
		this.farEntities.add(this.boat);
		this.farEntities.add(this.chicken);
		this.farEntities.add(this.egg);
		this.farEntities.add(this.testificate);
		this.farEntities.add(this.potion);
		this.farEntities.add(this.ghast);
		this.farEntities.add(this.fish);
		this.farEntities.add(this.tnt);
		this.farEntities.add(this.snowball);
		
		this.nearEntities.add(this.xpOrb);
		this.nearEntities.add(this.fireball);
		this.nearEntities.add(this.giant);
	}
	
	@Test
	public void testGetLizaEntitiesWithinRadiusDoesNotReturnNull() {
		List<LizaEntity> entities = this.lizaWorld.getLizaEntitiesWithinRadius(this.refPoint, RADIUS);
		
		assertNotNull(entities);
	}
	
	@Test
	public void testGetLizaEntitiesWithinRadiusDoesNotReturnEmpty() {
		List<LizaEntity> entities = this.lizaWorld.getLizaEntitiesWithinRadius(this.refPoint, RADIUS);
		
		assertTrue(entities.size() > 0);
	}
	
	@Test
	public void testGetLizaEntitiesWithinRadiusDoesNotReturnEntitiesOutsideOfRadius() {
		List<LizaEntity> entities = this.lizaWorld.getLizaEntitiesWithinRadius(this.refPoint, RADIUS);
		
		for (LizaEntity entity : entities) {
			assertFalse(this.farEntities.contains(entity.getBukkitEntity()));
		}
	}
	
	@Test
	public void testGetLizaEntitiesWithinRadiusReturnsAllEntitiesWithinRadius() {
		List<LizaEntity> entities = this.lizaWorld.getLizaEntitiesWithinRadius(this.refPoint, RADIUS);
		
		for (LizaEntity entity : entities) {
			assertTrue(this.nearEntities.contains(entity.getBukkitEntity()));
		}
		
		assertEquals(this.nearEntities.size(), entities.size());
		
	}
	
	
	@Test
	public void testGetLizaEntitiesWithinBoxDoesNotReturnNull() {
		
	}
	
	@Test
	public void testGetLizaEntitiesWithinBoxDoesNotReturnEmpty() {
		
	}
	
	@Test
	public void testGetLizaEntitiesWithinBoxDoesNotReturnEntitiesOutsideOfBox() {
		
	}
	
	@Test
	public void testGetLizaEntitiesWithinBoxReturnsAllEntitiesWithinBox() {
		
	}
}
