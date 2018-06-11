
public class OrganicCats extends OrganicPets {

	public OrganicCats(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid,
			int petAction, String OrganicPetType, int petRest, int petWaste) {
		super(petName, petType, petHealth, petHappiness, petWaste, petWaste, petWaste, petWaste);
		this.petName = petName;
		this.petType = petType;
		this.petHealth = 100;
		this.petHappiness = 60;
	}
	
	@Override
	public String toString() {
		return "" + petName + "\t\t|" + petType + "\t|" + petHealth + "\t\t|" + petHappiness + "\t|" + petEnergy + "\t|" + petFluid
				+ "\t|" + petWaste + "\t\t-";
	}
}
