import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
public class OrganicCatTest {
	OrganicCats lana = new OrganicCats("lana", "organic", 100, 50, 50, 50, 10, "cat", 10, 10) ;
	@Test
	public void toogleOperatitingShouldChangeIfCatIsGrandEmporer () {
		boolean valueOfOperationBeforeToogle = lana.isAGrandemperorOfTheShelter();
		
		lana.toogleIsAGrandEmperor();
		boolean valueOfOperatingAfterToogle = lana.isAGrandemperorOfTheShelter();
		assertThat(valueOfOperationBeforeToogle, is(equalTo(!valueOfOperatingAfterToogle)));
	}
	
}
