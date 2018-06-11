

public abstract class VirtualPet {
	private final int PET_HEALTH = 100;
	private final int PET_HAPPINESS = 75;
	private final int PET_TICK = 5;
	String petName;
	String petType;
	protected int petHealth = PET_HEALTH;
	protected int petHappiness = PET_HAPPINESS;
	int petTick = PET_TICK;

	public VirtualPet(String petName, String petType, int petHealth, int petHappiness) {
		super();
		this.petName = petName;
		this.petType = petType;
		this.petHealth = petHealth;
		this.petHappiness = petHappiness;
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

	public boolean petIsLiving() {
		return petHealth > 0;
	}

	public void tick() {
		int tickTock = 2;
		petHappiness -= tickTock;
		petHealth -= tickTock;

	}

	public String getHappy() {
		if (petHappiness <= 0 || petHealth <= 0) {
			return "I have withered away into nothing";
		}
		if (petHappiness <= 25 || petHealth <= 25) {
			return "Oh the agony, why doth no one care for thy";
		}
		if (petHappiness <= 50 || petHealth <= 50) {
			return "Lifes alright, could be better could be worse";
		}
		if (petHappiness <= 75 || petHealth <= 75) {
			return "What a lovely life in the shelter";
		}
		return "Uncles Charles's shelter isn't to bad";

	}

	@Override
	public String toString() {
		return getPetName() + " " + getPetType() + " " + getPetHealth() + " " + getPetHappiness();
	}

	

}
 