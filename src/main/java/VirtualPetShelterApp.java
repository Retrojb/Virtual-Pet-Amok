import java.util.Scanner;

public class VirtualPetShelterApp {
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter virtualPets = new VirtualPetShelter();
//	static VirtualPet  pets = new VirtualPet();
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Uncle Charles Animal Shelter");
		virtualPetShelterOptions();
		String userInput = input.nextLine();
		
//	public static void userChoice1()	
		
		
	}
	
	
	public static void virtualPetShelterOptions() {
		System.out.println("Virtual Pets: \r\n" + 
				"__________________________________________________________________________\r\n" + 
				"Name\t|Type\t|Health\tHappiness\t|Hunger\t|Water\t|Play\t|Rest\t|Waste\t|\r\n" + 
				"	"
				+ "\r\n" +
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
