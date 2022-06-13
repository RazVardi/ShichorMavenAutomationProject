package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleNatureTrip extends BaseLoginTest{

	@Test
	public void createNewFlexibleNatureTrip() {
		Assert.assertEquals(mp.createNewFlexibleNatureTrip(),"2");
	}
}
