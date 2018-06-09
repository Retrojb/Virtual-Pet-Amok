import java.util.Scanner;

public class VirtualPetShelterApp {
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter virtualPets = new VirtualPetShelter();
	
	
	public static void main(String[] args) {
		
		virtualPets.addOrganicPet(new OrganicPets("Nya", "Organic", 100, 90, 60, 60, 10, "dog", 50, 30));
		virtualPets.addOrganicPet(new OrganicPets("Thundercat", "Organic", 100, 60, 80, 60, 10, "dog", 40, 10));
		virtualPets.addOrganicPet(new OrganicPets("LeBron", "Organic", 100, 40, 50, 60, 10, "cat", 50, 30));
		virtualPets.addOrganicPet(new OrganicPets("Lana", "Organic", 100, 90, 60, 60, 10, "cat", 50, 30));
		virtualPets.addOrganicPet(new OrganicPets("Esme", "Organic", 100, 90, 60, 60, 10, "dog", 50, 30));
		
		virtualPets.addRoboticPet(new RoboticPets("Corl", "Robotic", 100, 40, 20, 60, 10, "dog", 50, 40));
		virtualPets.addRoboticPet(new RoboticPets("Mimi", "Robotic", 100, 80, 50, 50, 10, "dog", 20, 70));
		virtualPets.addRoboticPet(new RoboticPets("Phantom", "Robotic", 100, 40, 20, 60, 10, "cat", 50, 40));
		virtualPets.addRoboticPet(new RoboticPets("Bear", "Robotic", 100, 40, 20, 60, 10, "dog", 50, 40));
		virtualPets.addRoboticPet(new RoboticPets("Artimis", "Robotic", 100, 40, 30, 40, 10, "dog", 50, 40));
		
		
		System.out.println("Welcome to uncle Charles's Animal Shelter\nthe finest animal shelter in the Neatherlands.");
		virtualPetShelterOptions();
		String userInput = input.nextLine();
		
		switch (userInput) {
		case "1":
			
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
			// this is where I am leaving off from
			// i need to fix this before continue on to anything else.
			//reference hospital project
			//also creat a readme for all of the notes
			// work on case
		case "6":
			System.out.println("What type of animal would you like to add?");
			System.out.println("1: Organic\n2: Robotic");
			String typeOfPetToAdd = input.nextLine();
			System.out.println("What is the animals name?");
			String nameOfNewPet = input.nextLine();
			System.out.println("What kind of animal is it?");
			String newPetType = input.nextLine();
			typeOfPetToAdd(typeOfPetToAdd, nameOfNewPet, newPetType);
			break;
		case "7":
			break;
		case "8":
			break;
		case "9":
			break;
		case "0":
			System.out.println(virtualPets.listOfOrganicPetsAndType());
			System.out.println(virtualPets.listOfRoboticPetsAndType());
			break;
		}
		
		
		
		
		
		
		
	}
	
	private static void typeOfPetToAdd (String typeOfPetToAdd, String nameOfNewPet, String newPetType) {
		
		switch(typeOfPetToAdd) {
		case "1":
			System.out.println("So this is an Organic Animal");
			System.out.println("What type of animal?");
			VirtualPet newPet = new VirtualPet(newPetType, nameOfNewPet, newPetType) {
			};
			virtualPets.organicPets.put(nameOfNewPet, (OrganicPets) newPet);
			break;
		case "2":
			System.out.println("What type of pet is it?");
			break;
		case "3":
			break;
		case "4":
			break;
		}
	}
	
	public static void virtualPetShelterOptions() {
		System.out.println("\r\n" +
				"		Press 0: List all Animals\r\n"+
				"		Press 1: Feed Animals\r\n" + 
				"		Press 2: Water Animals\r\n" + 
				"		Press 3: Play with Animal\r\n" + 
				"		Press 4: Make an Animal go to bed\r\n" + 
				"		Press 5: Add an Animal to the Shelter\r\n" + 
				"		Press 6: Adopt out and Animal from the Shelter\r\n" + 
				"		Press 7: Clean up Animals\r\n" + 
				"		Press 8: Walk Animals\r\n" + 
				"		Press 9: Leave Uncle Charles's Animal Shelter");
	}
}
