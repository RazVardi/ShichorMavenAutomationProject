package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByExtendedFamilyCategory extends BaseLoginTest{
	
	@Test
	public void createNewFlexibleTripByExtendedFamilyCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleFamilyTripByCategory("Extended family"),
				"4");
	}

}
