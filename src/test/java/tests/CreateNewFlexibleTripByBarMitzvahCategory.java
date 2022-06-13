package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByBarMitzvahCategory extends BaseLoginTest{
	
	@Test
	public void createNewFlexibleTripByBarMitzvahCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleFamilyTripByCategory("Bar mitzvah"),
				"1");
	}

}
