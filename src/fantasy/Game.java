package fantasy;

/**
 * This class is responsible for constructing levels and coordinating interaction of characters with Darkrooms.
 * @author S. Camilleri
 */

public class Game {

	/**
	 * Initiates the start of game play.
	 */
	void play(){
		Castle castle = new Castle();
		createLevel1(castle);
		createLevel2(castle);
		createLevel3(castle);
		
		Elf elf = new Elf("Sam");
		Ogre ogre = new Ogre("Pat");
		Wizard wizard = new Wizard("Draco");
		
		for (int i=0; i<castle.getDarkRoomCount(); i++)
		{
			DarkRoom darkroom = castle.getDarkRoom(i);
			castle.enterRoom(elf, darkroom);
			castle.enterRoom(ogre, room);
			castle.enterRoom(wizard, room);
			
			castle.exitRoom(elf, darkroom);
			castle.exitRoom(ogre, room);
			castle.exitRoom(wizard, room);
		}
		
		for (int i=0; i<castle.getHauntedRoomCount(); i++)
		{
			HauntedRoom hauntedroom = castle.getHauntedRoom(i);
			castle.enterRoom(elf, hauntedroom);
			castle.enterRoom(ogre, room);
			castle.enterRoom(wizard, room);
			
			castle.exitRoom(elf, hauntedroom);
			castle.exitRoom(ogre, room);
			castle.exitRoom(wizard, room);
		}
		
		for (int i=0; i<castle.getMagicRoomCount(); i++)
		{
			MagicRoom magicroom = castle.getMagicRoom(i);
			castle.enterRoom(elf, magicroom);
			castle.enterRoom(ogre, room);
			castle.enterRoom(wizard, room);
			
			castle.exitRoom(elf, magicroom);
			castle.exitRoom(ogre, room);
			castle.exitRoom(wizard, room);
		}
	}

	/**
	 * Constructs three level of the game for a character.
	 * @param castle
	 */
	void createLevel1(Castle castle){
		DarkRoom room = new DarkRoom("foyer", 50, true);
		castle.addRoom(room);
		
		room = new DarkRoom("kitchen", 100, false);
		castle.addRoom(room);
		
		room = new DarkRoom("living room", 0, true);
		castle.addRoom(room);
	}
	
	void createLevel2(Castle castle)
    {
		HauntedRoom hauntedroom = new HauntedRoom("dungeon", 150, true, true);
		castle.addRoom(hauntedroom);
		
		hauntedroom = new HauntedRoom("garage", 25, false, false);
		castle.addRoom(hauntedroom);
		
		hauntedroom = new HauntedRoom("storage closet", 500, true, true);
		castle.addRoom(hauntedroom);
    }
	
	void createLevel3(Castle castle)
	{
		MagicRoom magicroom = new MagicRoom("bedroom", 75, true, true);
		castle.addRoom(magicroom);
		
		magicroom = new MagicRoom("bathroom", 25, false, false);
		castle.addRoom(magicroom);
	}
}
