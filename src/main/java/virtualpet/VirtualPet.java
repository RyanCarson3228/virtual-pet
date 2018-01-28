package virtualpet;

public class VirtualPet {

//	public int initialHunger;
//	public int initialThirst;
	public int currentHunger = 40;
	public int currentThirst = 15;
	public int currentBoredom = 20;
	public String name = "Harry the Gila Monster";

	public VirtualPet() {
	}
	
	public VirtualPet(String name) {
		
	}

	public VirtualPet(int currentThirst, int currentHunger, int intialBoredom) {

	}

	public void feed() {
		currentHunger -= 5;
	}

	public void drink() {
		currentThirst -= 5;
	}

	public void play() {
		currentBoredom -= 5;
	}

	public int getHunger() {
		return currentHunger;
	}

	public int getThirst() {
		return currentThirst;
	}

	public int getBoredom() {
		return currentBoredom;
	}

	public void tick() {
		currentHunger += 2;
		currentThirst += 2;
		currentBoredom += 2;
	}
}