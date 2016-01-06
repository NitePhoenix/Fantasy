//Chen, Susan
package fantasy;

public class CharactersInheritance {
	protected String type;
	protected String name;
	protected int health;
	
	CharactersInheritance(String type, String name){
	this.type = type;
	this.name = name;
	}
	
	/**
	 * Drinking potion restores health.
	 */
	public void drinkPotion(){		
		if (type == "Elf")
			health = 100;
		else if (type == "Ogre")
			health = health+0;
		else if (type == "Wizard")
			health = health*2;
		System.out.println(getType() + " " + getName() + " drinks potion. Health = " + health + "%");
	}
	
	/**
	 * Reduce the health by x%.
	 */
	public void exposeToRadiation(){
		if (type == "Elf")
			health = (int)(health * 0.9);
		else if (type == "Ogre")
			health = (int)(health * 0.95);
		else if (type == "Wizard")
			health = (int)(health * 0.75);
		System.out.println(getType() + " " + getName() + " is exposed to radiation. Health = " + health + "%");
	}
	
	/**
	 * A description of the character.
	 */
	public String getType(){
		return(type);
	}
	
	/**
	 * The name of the character.
	 * @return
	 */
	public String getName(){
		return (name);
	}

}
