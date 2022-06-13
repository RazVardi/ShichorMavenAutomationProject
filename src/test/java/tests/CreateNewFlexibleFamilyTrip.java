package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleFamilyTrip extends BaseLoginTest{
	
	@Test
	public void createNewFlexibleFamilyTrip() {	
		Assert.assertEquals(mp.createNewFlexibleFamilyTrip(),"4");
	}

}
