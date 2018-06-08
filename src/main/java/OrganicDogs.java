
public class OrganicDogs extends OrganicPets implements DogWalking {
	
	
	private boolean isInCage;
	private int walkDog = 10;

	public OrganicDogs(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid,
			int petAction, String OrganicPetType, int walkDog) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petAction, OrganicPetType);
		this.walkDog = walkDog;
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

//test this shit
	@Override
	public void dogWalking(OrganicDogs organicDogs) {
		
		walkDog += getPetHappiness();
		return;
	}

}
