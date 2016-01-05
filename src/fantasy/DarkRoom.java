package fantasy;

/**
 * DarkRooms have certain properties that Characters can interact with.
 * @author S. Camilleri
 */

class DarkRoom extends RoomInheritance {
	
	/**
	 * Constructs a DarkRoom
	 * @param name: The name of the room.
	 * @param gold: The amount of the gold.
	 * @param radioactive: If radioactivity is present
	 */
	DarkRoom(String name, int gold, boolean radioactive){
		super(name, gold, radioactive);		
	}

}