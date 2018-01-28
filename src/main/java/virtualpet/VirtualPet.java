package virtualpet;

public class VirtualPet {

	int initialHunger;
	int initialThirst;
	int currentHunger = 15;
	int currentThirst = 15;

	public VirtualPet() {
	}

	public VirtualPet(int initialHunger) {
	}

	public VirtualPet(int currentThirst, int currentHunger) {

	}

	public int feed() {
		return currentHunger -= 5;
	}

	public int drink() {
		return currentThirst -= 5;
	}

	public int getHunger() {
		return currentHunger;
	}

	public int getThirst() {
		return currentThirst;
	}

	public void tick() {
		currentHunger += 2;
		currentThirst += 2;
	}

}