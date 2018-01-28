package virtualpet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldBeLessHungryAfterFeeding() {
		// arrange
		int initialHunger = 20;
		VirtualPet underTest = new VirtualPet(initialHunger, 0);
		// act
		underTest.feed();
		// assert
		int currentHunger = underTest.getHunger();
		Assert.assertEquals(10, currentHunger);
	}

	@Test
	public void shouldBeMoreHungryAfterTick() {
		// arrange
		VirtualPet underTest = new VirtualPet(15, 0);
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
		VirtualPet underTest = new VirtualPet(0, initialThirst);
		// act
		underTest.drink();
		// assess
		int currentThirst = underTest.getThirst();
		Assert.assertEquals(10, currentThirst);
	}

	@Test
	public void shouldBeMoreThirstyAfterTick() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 15);
		// act
		underTest.tick();
		// assess
		int currentThirst = underTest.getThirst();
		Assert.assertEquals("Thirst should have increased by 2", 18, currentThirst);
	}
}
