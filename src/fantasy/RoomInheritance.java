// MODIFY THIS WITH SUSAN'S
package fantasy;

import java.util.ArrayList;

public class RoomInheritance {
	String name;
	int gold;
	boolean radioactive;
	
	ArrayList<Elf> characters;
	
	RoomInheritance(String name, int gold, boolean radioactive){
		this.name = name;
		this.gold = gold;
		this.radioactive = radioactive;
		
		characters = new ArrayList<Elf>();
	}
	
	void enter(Elf character){
		characters.add(character);
		
		if (radioactive)
			character.exposeToRadiation();
		
		gold = character.takeGold(gold);
	}
	
	/**
	 * Remove character from room.
	 * @param character
	 */
	void exit(Elf character){
		characters.remove(character);
	}
	
	String getName(){
		return name;
	}
	
	//LEO
	int getNumOfGold(){
		return gold;
	}
}
