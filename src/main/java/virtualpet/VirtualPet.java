package virtualpet;

public class VirtualPet {

	public String name = "Harry the Gila Monster";
	public int hunger = 25;
	public int thirst = 25;
	public int boredom = 25;

	public String hasName() {
		return name;
	}

	public int HungerLevel() {
		return hunger;
	}

	public int ThirstLevel() {
		return thirst;
	}

	public int BoredomLevel() {
		return boredom;
	}
	
	public void tick() {
		hunger++;
		thirst++;
		boredom++;
	}

	public void feed() {
		hunger -= 10;
		
	}

	public void drink() {
		thirst -= 10;
		
	}

	public void play() {
		boredom -= 10;
	}

}
