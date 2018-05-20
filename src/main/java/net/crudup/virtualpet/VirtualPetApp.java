package net.crudup.virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet doggo = new VirtualPet(50, 50, 50);

		String choice = "";

		do {

			System.out.println("Caring for Doggo the Doggy");
			System.out.println();
			System.out.println("Here's Doggo's level of hunger " + doggo.getHungerLevel() + ".");
			System.out.println("Here's Doggo's level of thirst " + doggo.getThirstLevel() + ".");
			System.out.println("Here's Doggo's level of needing to go outside " + doggo.getTakeOutside() + ".");
			System.out.println("What does Doggo need? Choose an option below:");
			System.out.println();
			System.out.println("Type 1 to feed Doggo.");
			System.out.println("Type 2 to fill Doggo's water bowl.");
			System.out.println("Type 3 to take Doggo outside.");
			System.out.println("Type 4 if Doggo is sleeping and doesn't need anything.");
			choice = input.nextLine();

			if (choice.equals("1")) {
				doggo.feedDoggo();
				System.out.println("You just fed Doggo. His level of hunger is " + doggo.getHungerLevel() + ".");

			} else if (choice.equals("2")) {
				doggo.waterDoggo();
				System.out.println(
						"You just filled Doggo's water bowl. His level of thirst is " + doggo.getThirstLevel() + ".");

			} else if (choice.equals("3")) {
				doggo.goPotty();
				System.out.println("You just took Doggo outside to go potty. His need to go out has be reduced to "
						+ doggo.getTakeOutside() + ".");
			} else if (choice.equals("4")) {
			} else {
				System.out.println("Doggo is asleep on the couch.");
			}

		} while (!choice.equals("4"));

			input.close();
		}

	}
