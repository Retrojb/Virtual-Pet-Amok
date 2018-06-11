
public class RoboticPets extends VirtualPet {
	public RoboticPets(String petName, String petType, int petHealth, int petHappiness) {
		super(petName, petType, petHealth, petHappiness);
		// TODO Auto-generated constructor stub
	}

	protected int oil;
	protected int maintance;
	
	public int getOil() {
		return oil;
	}
	
	public int getMaintance() {
		return maintance;
	}
	
	public void oil() {
		int robotOil = 10;
		oil += robotOil;
		petHappiness += robotOil;
		petHealth += robotOil;
	}
	public void maintance() {
		int robotParts = 10;
		maintance += robotParts;
		petHappiness += robotParts;
		petHealth += robotParts;
	}
	
	public void roboticTick() {
		int tickAmount = 3;
		petHealth -= tickAmount;
		petHappiness -= tickAmount;
		oil -= tickAmount;
		maintance -= tickAmount;
	}

	
}
