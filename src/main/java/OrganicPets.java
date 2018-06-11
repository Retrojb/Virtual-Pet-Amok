
public class OrganicPets extends VirtualPet{
	
	
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

	
	public OrganicPets(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid, int petPlayfulness, int petRest) {
		super(petName, petType, petHealth, petHappiness);
		
	}
	public VirtualPet getOrganicPets() {
		return organicPets;
	}

	public String getOrganicPetType() {
		return OrganicPetType;
	}

// bathroom 
	public int getPetWaste() {
		return petWaste;
	}
	public void poopBreak() {
		int poop = 3;
		petWaste += poop;
		petHealth += 20;
	}

	public int getPetRest() {
		return petRest;
	}
	public void restPets() {
		int restAction = 5;
		petRest += restAction;
		petHappiness += 3;
	}

//Give Organic Pets Food
	public int getPetEnergy() {
		return petEnergy;
	}
	public void feedPet() {
		int feedAction = 5;
		petEnergy += feedAction;
		petWaste +=feedAction;
		petHappiness += 3;
		petHealth += 5;
	}

//Give Organic Pets Water
	public int getPetFluid() {
		return petFluid;
	}
	public void waterPet() {
		int waterAction = 5;
		petFluid += waterAction;
		petWaste += waterAction;
		petHealth += 2;
	}
//Play with Organic Pets
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
		petEnergy -= tickAmount;
		petFluid -= tickAmount;
		petRest -= tickAmount;
	}
	
	//Organic Pet requirements
	//need cages cleaned
	//has to be feed (raises hunger by 10 & health by 5 & happiness by 5) CAN BE DONE TO ALL 
	//has to be watered(raise thirst by 10 & health by 5 & happiness by 5) CAN BE DONE TO ALL 
	//has to be walked CAN BE DONE TO ALL 
		//if walked lowers chance of soiling the cage (DOGS) while if no waste happiness raises. 
	//if clean litter box for cats (lowers cat cleanliness and raise happiness)
	//HAVE TO CHOOSE WHICH MESS TO CLEAN UP, BUT WHEN YOU CLEAN THAT MESS IT CLEANS FOR ALL
	// tick for organic waste +5
	//dogs can be walked
	//have to clean waste 
		
}
