import org.hamcrest.*;
import org.junit.Assert;
import org.junit.Test;
public class OrganicPetTest {
	OrganicPets organic = new OrganicPets(null, null, 0, 0, 0, 0, 0, null);
	@Test
	public void shouldReturnRest() {
		int underTest = organic.restPet();
		Assert.assertEquals(60, underTest);
	}
}
