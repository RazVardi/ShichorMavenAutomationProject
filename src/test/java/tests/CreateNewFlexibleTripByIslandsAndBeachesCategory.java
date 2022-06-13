package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByIslandsAndBeachesCategory extends BaseLoginTest{

	@Test
	public void createNewFlexibleTripByIslandsAndBeachesCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleNatureTripByCategory(
						"Blue (islands & beaches)"),
				"1");
	}
}
