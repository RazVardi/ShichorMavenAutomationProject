package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByAnniversaryCategory extends BaseLoginTest{
	
	@Test
	public void createNewFlexibleTripByAnniversaryCategory() {
		Assert.assertEquals(mp.createNewFlexibleRomanticTripByCategory(
				"Anniversary"),"2");
	}
}
