
public class OrganicCats extends OrganicPets {

	private boolean isAGrandEmperorOfTheShelter;
	private int isTakingAWellDeservedCatNap;

	public OrganicCats(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid,
			int petAction, String OrganicPetType, int petRest, int petWaste) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petAction, OrganicPetType, petRest, petWaste);
		this.isTakingAWellDeservedCatNap = isTakingAWellDeservedCatNap;
		
	}
	
	public boolean isAGrandemperorOfTheShelter() {
		return isAGrandEmperorOfTheShelter;
	}
	public void toogleIsAGrandEmperor() {
		isAGrandEmperorOfTheShelter =!isAGrandEmperorOfTheShelter;
	}
	public int getIstakingAWellDeservedCatNap() {
		return isTakingAWellDeservedCatNap;
	}
}
