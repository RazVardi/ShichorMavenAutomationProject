package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleThemeTrip extends BaseLoginTest{

	@Test
	public void createNewFlexibleThemeTrip() {
		Assert.assertEquals(
				mp.createNewFlexibleThemeTrip(),
				"4");
	}
}
