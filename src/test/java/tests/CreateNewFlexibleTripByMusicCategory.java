package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFlexibleTripByMusicCategory extends BaseLoginTest {

	@Test
	public void createNewFlexibleTripByMusicCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleThemeTripByCategory("Music"),
				"1");
	}
}
