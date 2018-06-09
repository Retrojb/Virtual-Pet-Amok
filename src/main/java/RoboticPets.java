
public class RoboticPets extends VirtualPet {
	VirtualPet robotPets = new VirtualPet() {	
	};
	private String roboticPetType;
	private final int ROBOT_MAINTANCE = 50;
	private final int ROBOT_SANITY = 50;
	private int robotMaintance = ROBOT_MAINTANCE;
	private int robotSanity = ROBOT_SANITY;
	//robotic pets
	// no differences among cats and dogs in this class
	//need oiled (same as watering organic pet) CAN BE DONE TO ALL ROBOTS
	//need maintance (same as cleaning organic) CAN BE DONE TO ALL ROBOTS
	//need charging (same as feeding organic pet) CAN BE DONE TO ALL ROBOTS 
	//robots can become fully automated and run crazy
	// robot brain going crazy (deals with happiness) INDIVIDUALLY DONE
	//tick (lowers charge by 10, lowers oil by 5, lower maintance by 5) EFFECTS ALL ROBOTS
	public RoboticPets(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid, int petAction, String roboticPetType, int robotMaintance, int robotSanity) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petAction);
		this.roboticPetType = roboticPetType;
		this.robotMaintance = robotMaintance;
		this.robotSanity = robotSanity;
	}

	public String getRoboticPetType() {
		return roboticPetType;
	}
	public void setRoboticPetType(String roboticPetType) {
		this.roboticPetType = roboticPetType;
	}
	public int getRobotMaintance() {
		return robotMaintance;
	}
	//robot maintance is the same as playing with organic
	public int maintanceRobots() {
		robotMaintance += robotPets.getPetAction();
		return robotMaintance;
	}
	
	public int getRobotSanity() {
		return robotSanity;
	}
	
	public int robotSanity() {
		robotSanity += robotPets.getPetAction();
		return robotSanity;
	}
	
	public VirtualPet getRobotPets() {
		return robotPets;
	}
}
