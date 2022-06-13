package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByRunningCategory extends BaseLoginTest {
	
	@Test
	public void createNewFlexibleTripByRunningCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleSportTripByCategory("running"),
				"1");
	}
}
