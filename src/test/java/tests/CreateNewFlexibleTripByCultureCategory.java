package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByCultureCategory extends BaseLoginTest {

	@Test
	public void createNewFlexibleTripByCultureCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleThemeTripByCategory("Culture"),
				"2");
	}
}
