package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByBirthdayCategory extends BaseLoginTest{
	
	@Test
	public void createNewFlexibleTripByBirthdayCategory() {
		Assert.assertEquals(mp.createNewFlexibleRomanticTripByCategory(
				"Birthday"),"4");
	}
}
