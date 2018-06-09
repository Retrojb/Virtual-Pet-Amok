
public class OrganicPets extends VirtualPet{
	VirtualPet organicPets = new VirtualPet(null, null, 0, 0, 0, 0, 0) {
	};
	private String OrganicPetType;
	private final int PET_REST = 50;
	private final int PET_WASTE = 0;
	private final int PET_PLAYFULNESS = 50;
	private int petWaste = PET_WASTE;
	private int petRest = PET_REST;
	private int petPlayfulness = PET_PLAYFULNESS;
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
	
	public OrganicPets(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid, int petAction, String OrganicPetType, int petRest, int petWaste) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petAction);
		this.OrganicPetType = OrganicPetType;
		this.petWaste = petWaste;
		this.petRest = petRest;
	}
	//test this 
	public String getOrganicPetType() {
		return OrganicPetType;
	}

	public int getPetRest() {
		return petRest;
	}
	public int restPet() {
		petRest += getPetAction();
		return petRest;
	}

	
	public int getPetWaste() {
		return petWaste;
	}
	public int cleanPetWaste() {
		petWaste -= petWaste;
		return petWaste;
	}
	
	public int getPetPlayfulness() {
		return petPlayfulness;
	}
	public int playWithOrganicPet() {
		petPlayfulness += organicPets.getPetAction();
		return petPlayfulness;
	}
	
	public VirtualPet getOrganicPets() {
		return organicPets;
	}
	public void put(String organicPetType2, OrganicPets organicPets2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
