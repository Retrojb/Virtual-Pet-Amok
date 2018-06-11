
public class RoboticDog extends RoboticPets{

	private int walkDog = 10;
	private boolean isInCage;

	public RoboticDog(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid,
			int petAction, String roboticPetType, int robotMaintance, int robotSanity) {
		super(petName, petType, petHealth, petHappiness);
		this.petName = petName;
		this.petType = petType;
		this.petHealth = 100;
		this.petHappiness = 80;
	}
	public boolean isInCage() {
		return isInCage;
	}
	public void toogleIsInCage() {
		isInCage = !isInCage;
	}
	public int getWalkDog() {
		return walkDog;
	}
	@Override
	public String toString() {
		return "" + petName + "\t\t|" + petType + "\t|" + petHealth + "\t\t|" + petHappiness + "\t|" + oil + "\t|";
				
	}

}
