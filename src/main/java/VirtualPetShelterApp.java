import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;

public class VirtualPetShelterApp {

	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter virtualPets = new VirtualPetShelter();

	public static void main(String[] args) {
		VirtualPet esme = new OrganicDogs("Esme", "dog", 100, 100);
		VirtualPet carl = new RoboticDog("Carl", "dog", 100, 70, 10, 40, 50, "dog", 30, 20);
		VirtualPet lebron = new RoboticCats("lebron", "cat", 100, 50);
		VirtualPet Nya = new OrganicDogs("Nya", "dog", 100, 100);
		VirtualPet lana = new OrganicCats("Lana", "cat", 100, 100, 60, 60, 10, "cat", 50, 60);
		virtualPets.addPetToShelter(carl);
		virtualPets.addPetToShelter(esme);
		virtualPets.addPetToShelter(lebron);
		virtualPets.addPetToShelter(Nya);
		virtualPets.addPetToShelter(lana);
		System.out.println("Welcome to Uncle Charles Animal Shelter");
		virtualPetShelterOptions(virtualPets);

		// petsIntoShelter(virtualPets);
	}

	public static void gameLoop(VirtualPetShelter pets, String userInput) {

		switch (userInput) {
		case "0":
			System.out.println(virtualPets.fetchAllVirtualPets());
			System.out.println(virtualPets.status());
			break;
		case "1":
			virtualPets.feedOrganicPets();
			System.out.println("You have feed all of the pets!");
			virtualPets.fetchAllVirtualPets().forEach(pet -> {
				System.out.println(pet.getPetName() + " hunger is " + pet.petHealth);
			});
			virtualPets.gameTick();
			System.out.println(virtualPets.status());
			break;

		case "2":
			virtualPets.waterOrganicPets();
			System.out.println("You have watered all of the pets!");
			virtualPets.fetchAllVirtualPets().forEach(pet -> {
				System.out.println(pet.getPetName() + " thirst is ");
			});
			virtualPets.gameTick();
			System.out.println(virtualPets.status());
			System.out.println(" ");
			break;

		case "3":
			virtualPets.playWithPets();
			System.out.println("You have played with all of the pets");
			virtualPets.gameTick();
			System.out.println(virtualPets.status());
			System.out.println(" ");
			break;

		case "4":
			virtualPets.restWithPets();
			System.out.println("Which animal do you want to rest with");
			virtualPets.gameTick();
			System.out.println(virtualPets.status());
			break;

		case "5":
			System.out.println("Which pet would you like to adopt?");
			System.out.println(virtualPets.fetchAllVirtualPets());
			String animalLeaving = input.nextLine();
			virtualPets.removePetFromShelter(animalLeaving);
			virtualPets.removePetFromShelter(animalLeaving);
			System.out.println("We will miss you " + animalLeaving);
			System.out.println(virtualPets.status());
			virtualPets.gameTick();
			break;

		case "6":
			System.out.println("What is the new pets name?");
			String takeInPetName = input.nextLine();
			System.out.println("What type of pet is it? Organic or Robotic? Dog or Cat?");
			String takeInPetType = input.nextLine();
			if (takeInPetType.equalsIgnoreCase("organic dog")) {
				VirtualPet newPet = new OrganicDogs(takeInPetName, takeInPetType, 0, 0);
				virtualPets.addPetToShelter(newPet);
				System.out.println("Welcome to the shelter " + newPet);
			} else if (takeInPetType.equalsIgnoreCase("robotic dog")) {
				VirtualPet newPet = new RoboticDog(takeInPetName, takeInPetType, 0, 0, 0, 0, 0, takeInPetType, 0, 0);
				virtualPets.addPetToShelter(newPet);
				System.out.println("Welcome to the shelter " + newPet);
			} else if (takeInPetType.equalsIgnoreCase("organic cat")) {
				VirtualPet newPet = new OrganicCats(takeInPetName, takeInPetType, 0, 0, 0, 0, 0, takeInPetType, 0, 0);
				virtualPets.addPetToShelter(newPet);
				System.out.println("Welcome to the shelter " + newPet);
			} else if (takeInPetType.equalsIgnoreCase("robotic cat")) {
				VirtualPet newPet = new RoboticCats(takeInPetName, takeInPetType, 0, 0);
				virtualPets.addPetToShelter(newPet);
				System.out.println("Welcome to the shelter " + newPet);
			} else
				System.out.println("you must have done something wrong");
			virtualPets.gameTick();
			virtualPets.status();
			break;

		case "7":
			virtualPets.cleanWaste();
			System.out.println("Want to clean the pet cages? y/n ");
			String cleanPetMess = input.nextLine();
			if (cleanPetMess.equalsIgnoreCase("y")) {
				System.out.println("Which mess? dog or cat");
				String cageToClean = input.nextLine();
				if (cageToClean.equalsIgnoreCase("dog")) {

				}
				if (cageToClean.equalsIgnoreCase("cat")) {

				}
			}
			virtualPets.gameTick();
			System.out.println(virtualPets.status());
			break;

		case "8":
			System.out.println("Time to walk the dogs!!!");
			virtualPets.walkDogs();
			virtualPets.gameTick();
			System.out.println(virtualPets.status());
			break;

		case "9":
			System.out.println("You have quit");
			System.exit(0);

		}
	}

	public static void virtualPetShelterOptions(VirtualPetShelter shelter) {

		for (int count = 0; count < 1000; count++) {
			System.out.println(virtualPets.status());
			System.out.println("Press 0: List all Animals\r\n" + "Press 1: Feed Animals\r\n"
					+ "Press 2: Water Animals \r\n" + "Press 3: Play with Animal\r\n"
					+ "Press 4: Make an Animal go to bed \r\n" + "Press 5: Adopt out and Animal from the Shelter\r\n"
					+ "Press 6: Add an Animal to the Shelter\r\n" + "Press 7: Clean up Animals \r\n"
					+ "Press 8: Walk Animals \r\n" + "Press 9: Leave Uncle Charles's Animal Shelter");
			String userInput = input.nextLine();
			gameLoop(virtualPets, userInput);
		}
	}
}

