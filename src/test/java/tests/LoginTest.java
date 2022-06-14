package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageObjects.MainPage;

public class LoginTest extends BaseTest {
	MainPage mp;
	
	@Epic("login")
	@Feature("basic authencation")
	@Story("as user, i can't login with wrong credentials")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Login with wrong email and password - expected to failed")
	@Test(description="Login with wrong credentials")
	public void loginFailedTest() {
		mp = new MainPage(driver);
		mp.clickOnLogin();
		mp.sleep(2000l);
		mp.login("raz.auto@yahoo.com", "123");
		mp.sleep(2000l);
		mp.loginFailedTest();
		Assert.assertTrue(!mp.loginFailedTest().isEmpty());
	}
	
	@Epic("login")
	@Feature("basic authencation")
	@Story("as user, i can login with right credentials")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Login with right email and password - expected to failed")
	@Test(description="Login with right credentials")
	public void loginSucceedTest() {
		mp = new MainPage(driver);
		mp.clickOnXicon();
		mp.sleep(2000l);
		mp.clickOnLogin();
		mp.sleep(2000l);
		mp.login("raz.auto@yahoo.com", "otuA14916");
		mp.sleep(2000l);
		Assert.assertTrue(!mp.loginSucceedTest().isEmpty());
	}
}
