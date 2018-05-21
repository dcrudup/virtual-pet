package net.crudup.virtualpet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int outside;

	public VirtualPet(int hunger, int thirst, int outside) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.outside = outside;
	}

	//Instance Variable 1
	
	public int getHungerLevel() {

		return hunger;
	}
	
	//Method 1
	
	public void feedDoggo() {
		hunger = hunger - 5;
	}
	
	//Tick Method
	public void tick() {
		
			if (hunger >= 40) {
			} else {
				hunger = hunger + 10;
			}
			
			if (thirst >= 40) {
			}else {
				thirst = thirst + 10;
			}
			if (outside >= 40) {
			}else {
				outside = outside + 10;
			}
	}
	
	//Instance Variable 2

	public int getThirstLevel() {

		return thirst;
	}
	
	//Method 2

	public void waterDoggo() {
		thirst = thirst - 5;

	}

	//Instance Variable 3
	
	public int getTakeOutside() {
		
		return outside;
	}
	
	//Method 3

	public void goPotty() {
		outside = outside - 5;
		
	}
	
	
	
	
	
	
	
	
	

}
