// MODIFY THIS WITH SUSAN'S
package fantasy;

import java.util.ArrayList;

public class RoomInheritance {
	String name;
	int gold;
	boolean radioactive;
	
	ArrayList<CharactersInterface> characters;
	
	//FIND THIS
	RoomInheritance(String name, int gold, boolean radioactive)
	{
		this.name = name;
		this.gold = gold;
		this.radioactive = radioactive;
		
		characters = new ArrayList<Character>();
	}
	
	void enter(CharactersInterface character){
		characters.add(character);
		
		if (radioactive)
			character.exposeToRadiation();
		
		gold = character.takeGold(gold);
	}
	
	/**
	 * Remove character from room.
	 * @param character
	 */
	void exit(CharactersInterface character){
		characters.remove(character);
	}
	
	String getName(){
		return name;
	}
	
	//LEO
	int getNumOfGold()
	{
		return gold;
	}
}
