package lizaTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.World;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Villager;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftTestModule;
import LizaCraft.LizaCraftWorld;


public class TestGetLizaEntity {
	
	private LizaCraftTestModule mockTestModule;
	private LizaServer mockServer;
	private LizaWorld lizaWorld;
	private World mockWorld;
	private List<Entity> entityList = new ArrayList<Entity>();
	
	@Before
	public void setUp() {
		this.mockTestModule = Mockito.mock(LizaCraftTestModule.class);
		this.mockServer = Mockito.mock(LizaServer.class);
		this.mockWorld = Mockito.mock(World.class);
		
		this.lizaWorld = new LizaCraftWorld(this.mockWorld);
		
		this.populateArray();
		
		when(this.mockTestModule.getServer()).thenReturn(this.mockServer);
		when(this.mockServer.getWorld("World")).thenReturn(this.lizaWorld);
		when(this.mockWorld.getEntities()).thenReturn(this.entityList);
	}
	
	private void populateArray() {
		Pig pig = null;
		Villager testificate = null;
		Creeper creeper = null;
		
		this.entityList.add(pig);
		this.entityList.add(testificate);
		this.entityList.add(creeper);
	}
	
	@Test
	public void testGetLizaEntitiesDoesNotReturnNull() {
		LizaWorld world = this.mockTestModule.getServer().getWorld("World");
		List<LizaEntity> entities = world.getLizaEntities();
		
		assertNotNull(entities);
	}
	
	@Test
	public void testGetLizaEntitiesDoesNotReturnEmptyList() {
		LizaWorld world = this.mockTestModule.getServer().getWorld("World");
		List<LizaEntity> entities = world.getLizaEntities();
		
		assertTrue(entities.size() > 0);
	}
	
	@Test
	public void testGetLizaEntitiesReturnsCorrectList() {
		LizaWorld world = this.mockTestModule.getServer().getWorld("World");
		List<LizaEntity> entities = world.getLizaEntities();
		
		for (int i=0; i<this.entityList.size(); i++) {
			assertSame(this.entityList.get(i), entities.get(i).getBukkitHandle());
		}
	}
	
}
