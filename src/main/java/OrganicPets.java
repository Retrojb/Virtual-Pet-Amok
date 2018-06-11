
public class OrganicPets extends VirtualPet {

	VirtualPet organicPets = new VirtualPet(petName, petType, petHealth, petHappiness) {
	};

	String OrganicPetType;
	protected static final int PET_REST = 50;
	protected static final int PET_WASTE = 0;
	protected static final int PET_PLAYFULNESS = 50;
	protected static final int PET_ENERGY = 50;
	protected static final int PET_FLUID = 50;
	static int petWaste = PET_WASTE;
	static int petRest = PET_REST;
	static int petPlayfulness = PET_PLAYFULNESS;
	static int petEnergy = PET_ENERGY;
	static int petFluid = PET_FLUID;

	public OrganicPets(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid,
			int petPlayfulness, int petRest) {
		super(petName, petType, petHealth, petHappiness);

	}

	public VirtualPet getOrganicPets() {
		return organicPets;
	}

	public String getOrganicPetType() {
		return OrganicPetType;
	}

	public int getPetWaste() {
		return petWaste;
	}

	public void poopBreak() {
		int poop = 3;
		petWaste += poop;
		petHealth += 20;
	}

	public void cleanCage() {
		petWaste -= petWaste;
	}

	public int getPetRest() {
		return petRest;
	}

	public void restPets() {
		int restAction = 5;
		petRest += restAction;
		petHappiness += 3;
	}

	public int getPetEnergy() {
		return petEnergy;
	}

	public void feedPet() {
		int feedAction = 5;
		petEnergy += feedAction;
		petWaste += feedAction;
		petHappiness += 3;
		petHealth += 5;
	}

	public int getPetFluid() {
		return petFluid;
	}

	public void waterPet() {
		int waterAction = 5;
		petFluid += waterAction;
		petWaste += waterAction;
		petHealth += 2;
	}

	public int getPetPlayfulness() {
		return petPlayfulness;
	}

	public void playWithPet() {
		int playAction = 5;
		petPlayfulness += playAction;
		petEnergy -= playAction;
		petWaste += 2;
	}

	public void organicPetTick() {
		int tickAmount = 3;
		petHealth -= tickAmount;
		petHappiness -= tickAmount;
		petEnergy -= 5;
		petFluid -= tickAmount;
		petRest -= tickAmount;
	}

	@Override
	public String toString() {
		return "" + petName + "\t\t|" + petType + "\t|" + petHealth + "\t\t|" + petHappiness + "\t|" + petEnergy + "\t|"
				+ petFluid + "\t|" + petWaste + "\t\t-";
	}
}