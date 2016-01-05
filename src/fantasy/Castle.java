package fantasy;

import java.util.ArrayList;

class Castle {
	ArrayList<DarkRoom> rooms;
	
	Castle(){
		rooms = new ArrayList<DarkRoom>();
	}
	
	/**
	 * Adds a DarkRoom to the Castle level
	 * @param room
	 */
	void addRoom(DarkRoom room){
		rooms.add(room);
	}
	
	/**
	 * Occurs when a character enters a DarkRoom
	 * @param elf the Elf, ogre the Ogre, wizard the Wizard
	 * @param room The DarkRoom
	 */
	void enterRoom(CharactersInterface characters, DarkRoom room){
		System.out.println(characters.getType() + " " + characters.getName() +  " enters the " + room.getName() );
		room.enter(characters);

	}
	
	/**
	 * Occurs when an Characters leaves a DarkRoom.
	 * @param elf the Elf, ogre the Ogre, wizard the Wizard
	 * @param room The DarkRoom
	 */
	void exitRoom(CharactersInterface characters, DarkRoom room){
		room.exit(characters);
		
		System.out.println(characters.getType() + " " + characters.getName() + " leaves the " + room.getName() );
	}
	
	/**
	 * Returns the number of DarkRooms.
	 * @return the number of DarkRooms.
	 */
	int getRoomCount(){
		return rooms.size();
	}

	/**
	 * Returns a DarkRoom according to index.
	 * @param index
	 * @return
	 */
	DarkRoom getRoom(int index){
		return rooms.get(index);
	}

}
