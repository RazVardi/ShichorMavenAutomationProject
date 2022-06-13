package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByThemeParksCategory extends BaseLoginTest {

	@Test
	public void createNewFlexibleTripByThemeParksCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleThemeTripByCategory("Theme parks"),
				"1");
	}
}
