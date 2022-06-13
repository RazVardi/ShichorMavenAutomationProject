package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByHoneymoonCategory extends BaseLoginTest{
	
	@Test
	public void createNewFlexibleTripByHoneymoonCategory() {
		Assert.assertEquals(mp.createNewFlexibleRomanticTripByCategory(
				"Honeymoon"),"3");
	}
}
