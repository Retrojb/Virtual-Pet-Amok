import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class OrganicDogTest {

		OrganicDogs nya = new OrganicDogs("roger", "organic", 100, 70, 50, 50, 10, "dog", 10, 10);
//		
		@Test
		public void toogleOperatitingShouldChangeifDogIsInCage () {
			boolean valueOfOperationBeforeToogle = nya.isInCage();
			
			nya.toogleIsInCage();
			boolean valueOfOperatingAfterToogle = nya.isInCage();
			assertThat(valueOfOperationBeforeToogle, is(equalTo(!valueOfOperatingAfterToogle)));
		}
		
		@Test
		public void shouldReturnIfDogIsWalked() {
		int underTest = nya.dogWalking(nya);
		Assert.assertEquals(80, underTest);
}

}
