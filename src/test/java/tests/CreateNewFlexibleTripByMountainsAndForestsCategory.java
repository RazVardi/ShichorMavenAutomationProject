package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByMountainsAndForestsCategory extends BaseLoginTest{

	@Test
	public void createNewFlexibleTripByMountainsAndForestsCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleNatureTripByCategory(
						"Green (mountains & forests)"),
				"1");
	}
}
