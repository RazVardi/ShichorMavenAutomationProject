package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByTennisCategory extends BaseLoginTest {
	
	@Test
	public void createNewFlexibleTripByTennisCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleSportTripByCategory("Tennis"),
				"1");
	}

	
}
