
public class RoboticDog extends RoboticPets implements DogWalking{

	private int walkDog = 10;
	private boolean isInCage;

	public RoboticDog(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid,
			int petAction, String roboticPetType, int robotMaintance, int robotSanity) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petAction, roboticPetType, robotMaintance,
				robotSanity);
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
	public int dogWalking(OrganicDogs organicDogs) {
		
		walkDog += getPetHappiness();
		return walkDog;
	}
}
