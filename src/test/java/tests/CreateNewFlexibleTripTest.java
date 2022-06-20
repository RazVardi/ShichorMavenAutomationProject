package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CreateNewFlexibleTripTest extends BaseLoginTest {
	
	@Epic("start plan")
	@Feature("create trip")
	@Story("as user, i want to create trip")
	@Severity(SeverityLevel.CRITICAL)
	@Description("valid tirp by random city and flexible dates")
	@Test(description="valid tirp by random city")
	public void createNewFlexibleTrip() {
		Assert.assertTrue(mp.createNewFlexibleTrip());
	}
}
