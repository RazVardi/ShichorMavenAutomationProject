package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleSportTrip extends BaseLoginTest{

	@Test
	public void createNewFlexibleSportTrip() {
		Assert.assertEquals(mp.createNewFlexibleSportTrip(),
				"1");
	}
	
	
	
}
