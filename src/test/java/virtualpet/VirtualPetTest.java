package virtualpet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldBeLessHungryAfterFeeding() {
		// arrange
		int initialHunger = 20;
		VirtualPet underTest = new VirtualPet(initialHunger, 0, 0);
		// act
		underTest.feed();
		// assert
		int currentHunger = underTest.getHunger();
		Assert.assertEquals(10, currentHunger);
	}

	@Test
	public void shouldBeMoreHungryAfterTick() {
		// arrange
		VirtualPet underTest = new VirtualPet(15, 0, 0);
		// act
		underTest.tick();
		// assess
		int currentHunger = underTest.getHunger();
		Assert.assertEquals(17, currentHunger);
	}

	@Test
	public void shouldBeLessThirstyAfterDrinking() {
		// arrange
		int initialThirst = 20;
		VirtualPet underTest = new VirtualPet(0, initialThirst, 0);
		// act
		underTest.drink();
		// assess
		int currentThirst = underTest.getThirst();
		Assert.assertEquals(10, currentThirst);
	}

	@Test
	public void shouldBeMoreThirstyAfterTick() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 15, 0);
		// act
		underTest.tick();
		// assess
		int currentThirst = underTest.getThirst();
		Assert.assertEquals(17, currentThirst);
	}

	@Test
	public void shouldBeLessBoredAfterPlay() {
		// arrange
		int intialBoredom = 20;
		VirtualPet underTest = new VirtualPet(0, 0, intialBoredom);
		// act
		underTest.play();
		// assess
		int currentBoredom = underTest.getBoredom();
		Assert.assertEquals(15, currentBoredom);
	}

	@Test
	public void shouldBeMoreBoredAfterTick() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 20);
		// act
		underTest.tick();
		// assess
		int currentBoredom = underTest.getBoredom();
		Assert.assertEquals(22, currentBoredom);
	}

}
