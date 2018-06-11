
public class RoboticCats extends RoboticPets {
	
	
	
	public RoboticCats(String petName, String petType, int petHealth, int petHappiness) {
		super(petName, petType, petHealth, petHappiness);
		this.petName = petName;
		this.petType = petType;
		this.petHealth = 100;
		this.petHappiness = 60;
	}

	@Override
	public String toString() {
		return "" + petName + "\t\t|" + petType + "\t|" + petHealth + "\t\t|" + petHappiness + "\t|" + oil + "\t|";
				
	}
	
	

}
