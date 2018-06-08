import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	VirtualPet pet = new VirtualPet();

	@Test
	public void testVirtualPetExististButIsNull() {
		VirtualPet testPet = null;
		Assert.assertNull(testPet);
	}
	@Test
	public void shouldReturnPetFeed() {
		int underTest = pet.feedPet();
		Assert.assertEquals(60, underTest);
	}
	@Test
	public void shouldReturnPetFluidRecieved() {
		int underTest = pet.fluidPet();
		Assert.assertEquals(60, underTest);
	}
}
