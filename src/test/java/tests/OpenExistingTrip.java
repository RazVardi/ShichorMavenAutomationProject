package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class OpenExistingTrip extends BaseLoginTest{

	@Epic("Open City Data")
	@Feature("basic database on cities")
	@Story("as user, i want to find information on cities")
	@Severity(SeverityLevel.NORMAL)
	@Description("Open exist trip")
	@Test(description="Open exist trip on my trips by name")
	public void openExistingTrip() {
		String city="Frankfurt";
		Assert.assertTrue(mp.openExistingTrip(city));
	}
}
