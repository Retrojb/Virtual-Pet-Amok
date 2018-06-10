
public abstract class RoboticPets extends VirtualPet {
	public RoboticPets(String petName, String petType, int petHealth, int petHappiness) {
		super(petName, petType, petHealth, petHappiness);
		// TODO Auto-generated constructor stub
	}

	protected int oil;

	public int getOil() {
		return oil;
	}
	
	public void oil() {
		int robotOil = 10;
		oil += robotOil;
	}

	
}
