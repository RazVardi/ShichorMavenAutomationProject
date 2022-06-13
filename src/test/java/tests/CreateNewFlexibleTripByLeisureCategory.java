package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByLeisureCategory extends BaseLoginTest{
	
	@Test
	public void createNewFlexibleTripByLeisureCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleFamilyTripByCategory("Leisure"),
				"2");
	}

}
