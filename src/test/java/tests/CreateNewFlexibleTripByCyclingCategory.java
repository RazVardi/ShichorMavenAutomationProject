package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByCyclingCategory extends BaseLoginTest {
	
	@Test
	public void createNewFlexibleTripByCyclingCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleSportTripByCategory("Cycling"),
				"1");
	}
}
