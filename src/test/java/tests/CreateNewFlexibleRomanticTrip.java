package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleRomanticTrip extends BaseLoginTest{

	@Test
	public void createNewFlexibleRomanticTrip() {
		Assert.assertEquals(mp.createNewFlexibleRomanticTrip(),
				"4");
	}
}
