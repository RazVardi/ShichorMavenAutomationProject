package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


public class CreateNewFlexibleTripPresetDestTest extends BaseLoginTest {
	
	@Epic("create preset dest")
	@Feature("create trip preset destination")
	@Story("as user, i want to create trip preset destination")
	@Severity(SeverityLevel.CRITICAL)
	@Description("valid tirp by popular city and flexible dates")
	@Test(description="valid tirp by popular city")
	public void createNewFlexibleTripPresetDest() {
		//mp.createNewFlexibleTripPresetDest();
		Assert.assertTrue(mp.createNewFlexibleTripPresetDest() );
	}
}
