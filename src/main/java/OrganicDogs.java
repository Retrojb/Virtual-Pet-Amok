
public class OrganicDogs extends OrganicPets {
	
	OrganicPets pets = new OrganicPets(getPetName(), getPetType(), getPetHealth(), getPetHappiness(), getPetEnergy(), getPetFluid(), getPetAction(), getOrganicPetType());
	
	private boolean isInCage;
	private int walkDog = 10;

	public OrganicDogs(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid,
			int petAction, String OrganicPetType) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petAction, OrganicPetType);
		this.walkDog = walkDog;
	}
	public boolean isInCage() {
		return isInCage;
	}
	
	public void toogleIsInCage() {
		isInCage = !isInCage;
	}
	public int getPetHappiness() {
		return getPetHappiness();
	}
	
	public int walkingTheDog() {
		walkDog += getPetHappiness();
		return getPetHappiness();
		
	}

}
