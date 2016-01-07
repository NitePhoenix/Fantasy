//Chen, Susan
package fantasy;

public class Ogre extends CharactersInheritance {
	int health = 100;
	int gold = 0;
	final static int maxGold = 0;
	
	Ogre(String name, String type){
		super("Ogre", name);
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
