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

public class OpenLinksTest extends BaseLoginTest {
	
	//MainPage mp;
	@Epic("destination routing")
	@Feature("open destination links")
	@Story("as user, i want to rout to destination page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Open destinations on internal link")
	@Test(description="Open Destinations")
	public void tc1_openDestinationsTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.openDestinations());
	}
	
	@Epic("my trips routing")
	@Feature("open my trips links")
	@Story("as user, i want to rout to my trips page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Open mytrip on internal link")
	@Test(description="Open mytrip")
	public void tc2_openmMyTripsTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.openMyTrips());
	}
	
	@Epic("covid assist routing")
	@Feature("open covid assist links")
	@Story("as user, i want to rout to covid assist page")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Open covid assist on internal link")
	@Test(description="Open covid assist")	
	public void tc3_openCovidAssistTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.openCovidAssist());
	}
	
	@Epic("hotels routing")
	@Feature("open hotels links")
	@Story("as user, i want to rout to hotels page")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Open covid assist on external link")
	@Test(description="Open hotels")	
	public void tc4_openServiceHotelTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.clickOnHotelNew());
	}
	
	@Epic("flights routing")
	@Feature("open flights links")
	@Story("as user, i want to rout to flights page")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Open flights on external link")
	@Test(description="Open flights")
	public void tc5_openServiceFlightsTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.clickOnFlightsNew());
	}
	
	@Epic("experiences routing")
	@Feature("open experiences links")
	@Story("as user, i want to rout to experiences page")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Open experiences on external link")
	@Test(description="Open experiences")
	public void tc6_openServiceExperiencesTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.clickOnExperiencesNew());
	}
	
	@Epic("insurance routing")
	@Feature("open insurance links")
	@Story("as user, i want to rout to insurance page")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Open insurance on external link")
	@Test(description="Open insurance")
	public void tc7_openServiceInsuranceTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.clickOnInsuranceNew());
	}
	
	@Epic("car rental routing")
	@Feature("open car rental links")
	@Story("as user, i want to rout to car rental page")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Open car rental on external link")
	@Test(description="Open car rental")
	public void tc8_openServiceCarRentalTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.clickOnCarRentalNew());
	}
}
