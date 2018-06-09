import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class OrganicDogTest {

		OrganicDogs roger = new OrganicDogs("roger", "organic", 100, 70, 50, 50, 10, "dog", 10, 10);
//		
		@Test
		public void toogleOperatitingShouldChangeifDogIsInCage () {
			boolean valueOfOperationBeforeToogle = roger.isInCage();
			
			roger.toogleIsInCage();
			boolean valueOfOperatingAfterToogle = roger.isInCage();
			assertThat(valueOfOperationBeforeToogle, is(equalTo(!valueOfOperatingAfterToogle)));
		}
		
		@Test
		public void shouldReturnIfDogIsWalked() {
		int underTest = roger.dogWalking(roger);
		Assert.assertEquals(80, underTest);
}

}
