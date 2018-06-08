
public abstract class OrganicPets extends VirtualPet implements CleaningOrganicPets{
	
	private String OrganicPetType;
	private int OrganicPetWaste;
	
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
	public OrganicPets(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid, int petAction, String OrganicPetType) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petAction);
		this.OrganicPetType = OrganicPetType;
	}

	public String getOrganicPetType() {
		return OrganicPetType;
	}
	public void setOrganicPetType(String organicPetType) {
		OrganicPetType = organicPetType;
	}
	
	//test this 
	
	
}
