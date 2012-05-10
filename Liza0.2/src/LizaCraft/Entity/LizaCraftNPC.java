package LizaCraft.Entity;

import org.bukkit.entity.NPC;

import Liza.LizaNPC;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftnpc is the Liza entity representation of the Bukkit npc class.
 * 
 * @author collinbc
 */
public class LizaCraftNPC extends LizaCraftCreature implements LizaNPC {
	
	/**
	 * LizaCraftnpc Constructor.
	 *
	 * @param npc A Bukkit NPC
	 */
	public LizaCraftNPC(NPC npc) {
		super(npc);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftCreature#getBukkitHandle()
	 */
	@Override
	public NPC getBukkitHandle() {
		return (NPC) this.entity;
	}

}
