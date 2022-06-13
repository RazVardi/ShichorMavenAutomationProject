package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateNewFlexibleTripPresetDestTest extends BaseLoginTest {

	@Test
	public void createNewFlexibleTripPresetDest() {
		//mp.createNewFlexibleTripPresetDest();
		Assert.assertTrue(mp.createNewFlexibleTripPresetDest() );
	}
}
