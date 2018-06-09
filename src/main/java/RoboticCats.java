
public class RoboticCats extends RoboticPets {
	private boolean isThatARobotCatFurBall;
	// this has no actual action I just did it to have a cat variance
	public RoboticCats(String petName, String petType, int petHealth, int petHappiness, int petEnergy, int petFluid,
			int petAction, String roboticPetType, int robotMaintance, int robotSanity, boolean isThatARobotCatFurBall) {
		super(petName, petType, petHealth, petHappiness, petEnergy, petFluid, petAction, roboticPetType, robotMaintance,
				robotSanity);
		this.isThatARobotCatFurBall = isThatARobotCatFurBall;
	}

	public boolean isThatARobotCatFurBall() {
		return isThatARobotCatFurBall;
	}

	public void setThatARobotCatFurBall(boolean isThatARobotCatFurBall) {
		this.isThatARobotCatFurBall = isThatARobotCatFurBall;
	}
	public void toogleIsThatAFurBall() {
		isThatARobotCatFurBall = !isThatARobotCatFurBall;
	}
	
	

}
