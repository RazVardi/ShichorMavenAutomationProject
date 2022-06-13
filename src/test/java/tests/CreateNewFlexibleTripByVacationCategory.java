package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByVacationCategory extends BaseLoginTest{
	
	@Test
	public void createNewFlexibleTripByVacationCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleRomanticTripByCategory("Vacation"),
				"4");
	}
}
