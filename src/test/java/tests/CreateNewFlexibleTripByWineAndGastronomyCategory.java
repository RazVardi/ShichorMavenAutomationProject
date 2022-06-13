package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByWineAndGastronomyCategory extends BaseLoginTest {

	@Test
	public void createNewFlexibleTripByWineAndGastronomyCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleThemeTripByCategory(
						"Wine and gastronomy"),"2");
	}
}
