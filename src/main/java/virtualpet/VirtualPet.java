package virtualpet;

public class VirtualPet {

	public int initialHunger;
	public int initialThirst;
	public int currentHunger = 15;
	public int currentThirst = 15;
	public int currentBoredom = 20;

	public VirtualPet() {
	}

	public VirtualPet(int currentThirst, int currentHunger, int intialBoredom) {

	}

	public int feed() {
		return currentHunger -= 5;
	}

	public int drink() {
		return currentThirst -= 5;
	}

	public int play() {
		return currentBoredom -= 5;
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