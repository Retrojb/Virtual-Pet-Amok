
public class OrganicDogs extends OrganicPets implements DogWalking {
	
	private boolean isInCage;
	private int walkDog = 10;
	public OrganicDogs(String petName, String petType, int petHealth, int petHappiness) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petPlayfulness, petRest);
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
	public void dogWalking() {
		int walking = 5;
		petEnergy -= walking;
		petHappiness += walking;
		petRest -= walking;
		petWaste -= walking;
	}
	@Override
	public String toString() {
		return "" + petName + "\t\t|" + petType + "\t|" + petHealth + "\t\t|" + petHappiness + "\t|" + petEnergy + "\t|" + petFluid
				+ "\t|" + petWaste + "\t\t-";
	}

}
