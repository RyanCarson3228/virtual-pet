package virtualpet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldHaveName() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		String name = underTest.hasName();
		// assert
		Assert.assertEquals("Harry the Gila Monster", name);
	}

	@Test
	public void shouldHaveHunger() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		int hungerLevel = underTest.HungerLevel();
		// assert
		Assert.assertEquals(25, hungerLevel);
	}

	@Test
	public void shouldHaveThirst() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		int thirstLevel = underTest.ThirstLevel();
		// assert
		Assert.assertEquals(25, thirstLevel);
	}

	@Test
	public void shouldHaveBoredom() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		int boredomLevel = underTest.BoredomLevel();
		// assert
		Assert.assertEquals(25, boredomLevel);
	}
	
	@Test
	public void shouldHaveTickIncreaseHunger() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		//act
		underTest.tick(1);
		//assert
		int hunger = underTest.HungerLevel();
		Assert.assertEquals(26, hunger);
	}
	@Test
	public void shouldHaveTickIncreaseThirst() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		//act
		underTest.tick(1);
		//assert
		int thirst = underTest.ThirstLevel();
		Assert.assertEquals(26, thirst);
	}
	@Test
	public void shouldHaveTickIncreaseBoredom() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		//act
		underTest.tick(1);
		//assert
		int boredom = underTest.BoredomLevel();
		Assert.assertEquals(26, boredom);
	}
	
	

}
