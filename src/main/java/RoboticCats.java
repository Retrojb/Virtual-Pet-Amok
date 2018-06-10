
public class RoboticCats extends RoboticPets {
	
	
	
	public RoboticCats(String petName, String petType, int petHealth, int petHappiness) {
		super(petName, petType, petHealth, petHappiness);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "" + petName + "\t\t|" + petType + "\t|" + petHealth + "\t\t|" + petHappiness + "\t|" + oil + "\t|";
				
	}
	
	

}
