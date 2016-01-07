package fantasy;

/**
 * This class represents one character of the game.
 * @author S. Camilleri
 *
 */
class Elf extends CharactersInheritance {
	int gold = 0;
	int health = 100;
	final static int maxGold = 8;
	
	Elf(String type, String name){
		super("Elf", name);
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
		
		System.out.println(available + " available");

		return available - taken;
	}
	
	/**
	 * Ghost encounter loses all gold
	 */
	void findGhost()
	{
		gold = 0;
		
		System.out.println(getName() + " encounters ghosts. Gold=" + gold + " bars");
	}
	
}
