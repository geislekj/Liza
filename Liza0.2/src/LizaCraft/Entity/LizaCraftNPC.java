package LizaCraft.Entity;

import org.bukkit.entity.NPC;

import Liza.LizaNPC;

/**
 * LizaCraftnpc is the Liza entity representation of the Bukkit npc class.
 * 
 * @author collinbc
 */
public class LizaCraftNPC extends LizaCraftCreature implements LizaNPC {
	/**
	 * LizaCraftnpc Constructor
	 * 
	 * @param npc
	 *            A Bukkit NPC
	 */
	public LizaCraftNPC(NPC npc) {
		super(npc);
	}

	@Override
	public NPC getBukkitHandle() {
		return (NPC) this.entity;
	}

}
