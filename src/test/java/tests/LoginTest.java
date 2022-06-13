package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MainPage;

public class LoginTest extends BaseTest {
	MainPage mp;
	
	@Test
	public void loginFailedTest() {
		mp = new MainPage(driver);
		mp.clickOnLogin();
		mp.sleep(2000l);
		mp.login("raz.auto@yahoo.com", "123");
		mp.sleep(2000l);
		mp.loginFailedTest();
		Assert.assertTrue(!mp.loginFailedTest().isEmpty());
	}
	
	@Test
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
