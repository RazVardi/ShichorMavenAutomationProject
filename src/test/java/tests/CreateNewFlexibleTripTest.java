package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripTest extends BaseLoginTest {

	@Test
	public void createNewFlexibleTrip() {
		Assert.assertTrue(mp.createNewFlexibleTrip());
	}
}
