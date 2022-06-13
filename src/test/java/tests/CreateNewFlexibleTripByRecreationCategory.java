package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByRecreationCategory extends BaseLoginTest {

	@Test
	public void createNewFlexibleTripByRecreationCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleThemeTripByCategory("Recreation"),
				"1");
	}
}
