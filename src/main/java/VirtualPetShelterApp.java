import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class VirtualPetShelterApp {
	
	private static final String petName = null;
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter virtualPets = new VirtualPetShelter();

		
	public static void main(String[] args) {
		VirtualPet esme = new OrganicDogs("Esme", "dog", 100, 100);
		VirtualPet carl = new RoboticPets("Carl", "dog", 100, 70);
//		pets.addPetToShelter(esme);
//		pets.addPetToShelter(carl);
		System.out.println("Welcome to Uncle Charles Animal Shelter");
		virtualPetShelterOptions(virtualPets);
		
		petsIntoShelter(virtualPets);
	}	
	public static void gameLoop(VirtualPetShelter pets, String userInput)	{
		
	  // FEEDING
			if (userInput.equals("1")) {
				virtualPets.feedOrganicPets();
				System.out.println("You have feed all of the pets!");
				virtualPets.fetchAllVirtualPets().forEach(pet -> {
					System.out.println(pet.getPetName() + " hunger is " + pet.petHealth);
				});
				System.out.println(" ");
			}
				//WATERING
			  if (userInput.equals("2")) {
				virtualPets.waterOrganicPets();
				System.out.println("You have watered all of the pets!");
				virtualPets.fetchAllVirtualPets().forEach(pet -> {
					System.out.println(pet.getPetName() + " thirst is " );
				});
				System.out.println(" ");
			}
		
			if (userInput.equals("3")) {
				virtualPets.playWithPets();
				System.out.println("Which Pet do you want to play with?");
				String petChoice = input.nextLine();
				if (petChoice.equals(virtualPets.fetchAllVirtualPets())) {
					System.out.println("You have played with " + virtualPets.fetchAllVirtualPets() + "play level is at ");
				}
			}
				
			//REST WITH ANIMALS
			if (userInput.equals("4")) {
				
				System.out.println("Which animal do you want to rest with");
				System.out.println("Please enter the pets name");
				String petChoice2 = input.nextLine();
				virtualPets.shelter.get(userInput);
				if (petChoice2.equals(virtualPets.fetchAllVirtualPets())) {
					System.out.println("you played with " + petChoice2);
				}
			}
				//ADOPT OUT A PET
			 if (userInput.equals("5")) {
				 System.out.println(virtualPets.getPetNames(petName));
				 System.out.println("Which animal would you like to take home?");
				virtualPets.removePetFromShelter(petName);
				userInput.equals("");
				virtualPets.removePetFromShelter(petName);
				System.out.println(virtualPets.fetchAllVirtualPets());
			}
				/**			//TAKE IN A PET
			} else if (actionChoice.equals("6")) {
				System.out.println("Please enter the animal you want us to watch");
				String newPet = input2.nextLine();
				pets.takeInAPet(pets.fetchVirtualPet(newPet));
				System.out.println("We'd be glad to take care of " + newPet);

				pets.takeInAPet(pets.fetchVirtualPet(newPet));
				pets.getVirtualPets().forEach(pet -> {
					System.out.println(pet.getPetName());
				});
			}
			} else if (actionChoice.equals("7")) {
				System.out.println("You have ended the game!");
				System.exit(0);
			}
			else {
				System.out.println("one of your animals has died");
			}

		
		}
	 * 
	 */
		
	}
		
	
	public static void petsIntoShelter(VirtualPetShelter pets){
		VirtualPet esme = new OrganicDogs("Esme", "dog", 100, 100);
		VirtualPet carl = new RoboticPets("Carl", "dog", 100, 70);
		pets.addPetToShelter(esme);
		pets.addPetToShelter(carl);
	}
	
	
	@SuppressWarnings("unchecked")
	public static void virtualPetShelterOptions(VirtualPetShelter shelter) {
		
		for (int count = 0; count < 2; count++) {
		System.out.println("Name\t|Type\t|Health\tHappiness\t|Hunger\t|Water\t|Play\t|Rest\t|Waste\t|");
		for (VirtualPet pets: virtualPets.shelter.values()) {
			System.out.println(((Map<String, VirtualPet>) pets).values());
		}
		
		System.out.println("Press 0: List all Animals\r\n" + 
				"Press 1: Feed Animals\r\n" + 
				"Press 2: Water Animals \r\n" + 
				"Press 3: Play with Animal\r\n" + 
				"Press 4: Make an Animal go to bed \r\n" + 
				"Press 5: Add an Animal to the Shelter\r\n" + 
				"Press 6: Adopt out and Animal from the Shelter\r\n" + 
				"Press 7: Clean up Animals \r\n" + 
				"Press 8: Walk Animals \r\n" + 
				"Press 9: Leave Uncle Charles's Animal Shelter"); 
		String userInput = input.nextLine();
		gameLoop(virtualPets, userInput);
	}
}
}

