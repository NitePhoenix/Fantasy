//Chen, Susan
package fantasy;

public class Ogre extends CharactersInheritance implements CharactersInterface{
//	String name;
//	int health;
	int gold;
	final static int maxGold = 0;
	
	Ogre(String name){
		type = "Ogre";
		this.name = name;
		health = 100;
		gold = 0;
	}
	
	/**
	 * Takes the maximum amount of gold and returns the leftover amount.
	 * @param available The amount of gold available to be taken.
	 * @return The amount of gold leftover.
	 */
	public int takeGold(int available){
		int taken = 0;
		if (available + gold <= maxGold){
			gold += available;
			taken = available;
		}
		else{
			gold = maxGold;
			taken = available - maxGold;
		}
		
		System.out.println(getType() + " " + getName() + " takes " + taken + " gold. Gold = " + gold + " bars");
		
		return available - taken;
	}

}
