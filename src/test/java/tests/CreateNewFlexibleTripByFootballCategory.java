package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByFootballCategory extends BaseLoginTest {
	
	@Test
	public void createNewFlexibleTripByFootballCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleSportTripByCategory("Football"),
				"1");
	}
}
