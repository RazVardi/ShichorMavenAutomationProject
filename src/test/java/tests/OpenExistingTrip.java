package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenExistingTrip extends BaseLoginTest{

	
	
	@Test
	public void openExistingTrip() {
		String city="Frankfurt";
		Assert.assertTrue(mp.openExistingTrip(city));
	}
}
