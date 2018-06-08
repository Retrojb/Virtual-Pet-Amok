
public class RoboticPets extends VirtualPet {
	
	
	//robotic pets
	// no differences among cats and dogs in this class
	//need oiled (same as watering organic pet) CAN BE DONE TO ALL ROBOTS
	//need maintance (same as cleaning organic) CAN BE DONE TO ALL ROBOTS
	//need charging (same as feeding organic pet) CAN BE DONE TO ALL ROBOTS 
	//robots can become fully automated and run crazy
	// robot brain going crazy (deals with happiness) INDIVIDUALLY DONE
	//tick (lowers charge by 10, lowers oil by 5, lower maintance by 5) EFFECTS ALL ROBOTS
	private String roboticPetType;
	public RoboticPets(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid, int petAction, String roboticPetType) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petAction);
		this.roboticPetType = roboticPetType;
	}

	public String getRoboticPetType() {
		return roboticPetType;
	}
	public void setRoboticPetType(String roboticPetType) {
		this.roboticPetType = roboticPetType;
	}
}
