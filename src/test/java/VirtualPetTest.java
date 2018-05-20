import static org.junit.Assert.assertEquals;

import org.junit.Test;

import net.crudup.virtualpet.VirtualPet;

public class VirtualPetTest {

	@Test
	public void shouldHaveADefaultHungerLevelOf25() {

		VirtualPet underTest = new VirtualPet(25, 0, 0);
		int check = underTest.getHungerLevel();
		assertEquals(25, check);

	}

	@Test
	public void shouldHaveADefaultHungerLevelOf50() {

		VirtualPet underTest = new VirtualPet(50, 0, 0);
		int check = underTest.getHungerLevel();
		assertEquals(50, check);

	}

	@Test
	public void hungerLevelsShouldDecreaseBy5() {

		VirtualPet underTest = new VirtualPet(50, 0, 0);
		underTest.feedDoggo();
		int check = underTest.getHungerLevel();
		assertEquals(45, check);

	}

	@Test
	public void shouldHaveADefaultThirstLevelOf25() {

		VirtualPet underTest = new VirtualPet(0, 25, 0);
		int check = underTest.getThirstLevel();
		assertEquals(25, check);

	}

	@Test
	public void thirstLevelsShouldDecreaseBy5() {

		VirtualPet underTest = new VirtualPet(0, 50, 0);
		underTest.waterDoggo();
		int check = underTest.getThirstLevel();
		assertEquals(45, check);

	}

	@Test
	public void needsToGoOutsideAtLevel25() {

		VirtualPet underTest = new VirtualPet(0, 0, 25);
		int check = underTest.getTakeOutside();
		assertEquals(25, check);
	}

	@Test
	public void theNeedToGoOutsideShouldDecreaseBy5() {

		VirtualPet underTest = new VirtualPet(0, 0, 25);
		underTest.goPotty();
		int check = underTest.getTakeOutside();
		assertEquals(20, check);

	}

}