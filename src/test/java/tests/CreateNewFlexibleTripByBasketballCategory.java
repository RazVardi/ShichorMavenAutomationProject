package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByBasketballCategory extends BaseLoginTest {
	
	@Test
	public void createNewFlexibleTripByBasketballCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleSportTripByCategory("Basketball"),
				"1");
	}
}
