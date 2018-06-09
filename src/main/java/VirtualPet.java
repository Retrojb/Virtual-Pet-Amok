
public abstract class VirtualPet {
	private final int PET_HEALTH = 100;
	private final int PET_HAPPINESS = 75;
	private final int PET_ENERGY = 50;
	private final int PET_FLUID = 50;
	// energy is the component for robot energy (maintance levels) and organic
	// hunger
	// fluid represents the component of robot oil level and organic thirst
	private final int PET_ACTION = 10;
	private final int PET_TICK = 5;

	private String petName;
	private String petType;
	private int petHealth = PET_HEALTH;
	private int petHappiness = PET_HAPPINESS;
	private int petEnergy = PET_ENERGY;
	private int petFluid = PET_FLUID;
	private int petAction = PET_ACTION;
	private int petTick = PET_TICK;

	public VirtualPet(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid,
			int petAction) {
		super();
		this.petName = petName;
		this.petType = petType;
		this.petHealth = petHealth;
		this.petHappiness = petHappiness;
		this.petEnergy = petEnergy;
		this.petFluid = petFluid;
		this.petAction = petAction;

	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public int getPetHealth() {
		return petHealth;
	}

	public int getPetHappiness() {
		return petHappiness;
	}

	public int getPetEnergy() {
		return petEnergy;
	}

	public int getPetFluid() {
		return petFluid;
	}

	public int getPetAction() {
		return petAction;
	}

	public int getPetTick() {
		return petTick;
	}

	public VirtualPet() {

	}

	public int feedPet(OrganicPets organicPets) {
		petEnergy += petAction;
		return petEnergy;
	}

	public int fluidPet(OrganicPets organicPets) {
		petFluid += petAction;
		return petFluid;
	}
	




	@Override
	public String toString() {
		return getPetName() + " " + getPetType() + " " + getPetHealth() + " " + getPetHappiness();
	}

}
 