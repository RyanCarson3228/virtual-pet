package virtualpet;

public class VirtualPet {

	public int currentHunger = 38;
	public int currentThirst = 13;
	public int currentBoredom = 18;
	public String name = "Harry the Gila Monster";

	public VirtualPet() {
	}

	public VirtualPet(String name) {

	}

	public VirtualPet(int currentThirst, int currentHunger, int intialBoredom) {

	}

	public void feed() {
		currentHunger -= 7;
	}

	public void drink() {
		currentThirst -= 7;
	}

	public void play() {
		currentBoredom -= 7;
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