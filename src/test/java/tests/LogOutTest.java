package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LogOutTest extends BaseLoginTest {

	@Epic("logout")
	@Feature("basic logout")
	@Story("as user, i can logout from the account")
	@Severity(SeverityLevel.NORMAL)
	@Test(description="Log out user")
	public void logOutTest() {
		Assert.assertTrue(mp.logout().equals("Sign in"));
	}
}
