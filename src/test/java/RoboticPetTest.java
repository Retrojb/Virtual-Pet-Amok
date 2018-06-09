import org.hamcrest.*;
import org.junit.Assert;
import org.junit.Test;
public class RoboticPetTest {
	RoboticPets robots = new RoboticPets(null, null, 0, 0, 0, 0, 0, null, 50, 50);


@Test
public void shouldReturnMaintance() {
	int underTest = robots.maintanceRobots();
	Assert.assertEquals(60, underTest);
}
@Test
public void shouldReturnRobotSanity() {
	int underTest = robots.robotSanity();
	Assert.assertEquals(60, underTest);
}
//@Test
//public void shouldReturnRobots() {
//	VirtualPet underTest = robots.getRobotPets();
//	Assert.assertEquals(0, underTest);
//}



}