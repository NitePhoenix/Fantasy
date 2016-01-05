package fantasy;

/**
 * Modified by Leo Hon
 */

class HauntedRoom extends RoomInheritance{

	boolean ghosts;
		
	/**
	 * Constructs a HauntedRoom
	 * @param name The name of the room.
	 * @param gold The amount of the gold.
	 * @param radioactive If radioactivity is present
	 * @param ghosts If ghosts are present
	 */
	HauntedRoom(String name, int gold, boolean radioactive, boolean ghosts)
	{
		super(name, gold, radioactive);
		this.ghosts = ghosts;
		
	}
	
	void enter(Elf elf)
	{
		super.enter(elf);
		if (ghosts)
		{
			elf.findGhost();
		}
	}
}