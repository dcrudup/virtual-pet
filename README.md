## Virtual Pet Project

git remote add origin https://github.com/dcrudup/virtual-pet.git
git push -u origin master



Package Naming Conventions in Java

https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html


VirtualPetTest

@Test
	public void feedDoggoWhenHungerLevelIs25() {
		
		VirtualPet underTest = new VirtualPet(25);
		int feedDoggo = underTest.feedDoggo();
		assertEquals(25, feedDoggo);
}
	
	@Test
	public void feedDoggoWhenHungerLevelIs50() {
		
		VirtualPet underTest = new VirtualPet(50);
		int feedDoggo = underTest.feedDoggo();
		assertEquals(50, feedDoggo);
}
	
	@Test
	public void waterDoggoWhenThirstLevelIs25() {
		
		VirtualPet underTest = new VirtualPet(25);
		int waterDoggo = underTest.waterDoggo();
		assertEquals(25, waterDoggo);
	}
	
	
	@Test
	public void waterDoggoWhenThirstLevelIs50() {
		
		VirtualPet underTest = new VirtualPet(50);
		int waterDoggo = underTest.waterDoggo();
		assertEquals(50, waterDoggo);
	}
	
	VirtualPet
	
	private int feedDoggo;

	public VirtualPet(int feedDoggo) {
		this.feedDoggo = feedDoggo;
	

	}

	public VirtualPet() {
		
	}

	public static void main(String[] args) {

	}

	public int feedDoggo() {

		return feedDoggo;
	}

	public int waterDoggo() {
		
		return 50;
	}
	
	
	