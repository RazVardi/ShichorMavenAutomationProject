package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTripByDestinationOnlyTest extends BaseLoginTest  {
	
	@Test
	public void createTripByDestinationOnly(){
		Assert.assertTrue(mp.createTripByDestinationOnly());
	}
}
