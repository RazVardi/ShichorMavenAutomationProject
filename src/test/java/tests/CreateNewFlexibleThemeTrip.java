package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CreateNewFlexibleThemeTrip extends BaseLoginTest{
	
	@Epic("create profile")
	@Feature("set by category to graph values")
	@Story("as user, i want to set by category to graph values")
	@Severity(SeverityLevel.NORMAL)
	@Description("valid the theme category graph value can set on tell us page")
	@Test(description="valid the theme category graph value")
	public void createNewFlexibleThemeTrip() {
		Assert.assertEquals(
				mp.createNewFlexibleThemeTrip(),
				"4");
	}
}
