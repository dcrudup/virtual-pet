package net.crudup.virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet doggo = new VirtualPet(50, 50, 50);

		String choice = "";

		do {
			
			doggo.tick();
			
			System.out.println("Caring for my puppy, Milo.");
			System.out.println();
			System.out.println("Here's Milo's level of hunger " + doggo.getHungerLevel() + ".");
			System.out.println("Here's Milo's level of thirst " + doggo.getThirstLevel() + ".");
			System.out.println("Here's Milo's level of needing to go outside " + doggo.getTakeOutside() + ".");
			System.out.println();
			System.out.println("What does Milo need? Choose an option below:");
			System.out.println();
			System.out.println("Type 1 to feed Milo.");
			System.out.println("Type 2 to fill Milo's water bowl.");
			System.out.println("Type 3 to take Milo outside.");
			System.out.println("Type 4 if Milo is sleeping and doesn't need anything.");
			choice = input.nextLine();

			if (choice.equals("1")) {
				doggo.feedDoggo();
				System.out.println("You just fed Milo. His level of hunger is " + doggo.getHungerLevel() + ".");
				System.out.println();
			} else if (choice.equals("2")) {
				doggo.waterDoggo();
				System.out.println("You just filled Milo's water bowl. His level of thirst is " + doggo.getThirstLevel() + ".");
				System.out.println();
			} else if (choice.equals("3")) {
				doggo.goPotty();
				System.out.println("You just took Milo outside to go potty. His need to go out has be reduced to "
						+ doggo.getTakeOutside() + ".");
				System.out.println();
			} else if (choice.equals("4")) {
			} else {
				System.out.println("Milo is asleep on the couch.");
			}

		} while (!choice.equals("4"));

			input.close();
		}

	}
