package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByAnnualCategory extends BaseLoginTest{
	
	@Test
	public void createNewFlexibleTripByAnnualCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleFamilyTripByCategory("Annual trip"),
				"2");
	}

}
