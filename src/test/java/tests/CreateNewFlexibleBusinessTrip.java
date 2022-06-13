package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleBusinessTrip extends BaseLoginTest {

	@Test
	public void createNewFlexibleBusinessTrip() {
		Assert.assertEquals(mp.createNewFlexibleBusinessTrip(),"3");
	}
}
