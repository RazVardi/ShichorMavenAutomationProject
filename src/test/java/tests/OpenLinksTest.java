package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MainPage;

public class OpenLinksTest extends BaseLoginTest {
	//MainPage mp;
	
	@Test
	public void tc1_openDestinationsTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.openDestinations());
	}
	
	@Test
	public void tc2_openmMyTripsTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.openMyTrips());
	}
	
	@Test	
	public void tc3_openCovidAssistTest() {
		mp=new MainPage(driver);
		Assert.assertTrue(mp.openCovidAssist());
	}
	
	
	
	@Test
	public void tc4_openServiceHotelTest() {
		mp=new MainPage(driver);
		mp.clickOnHotel();
	}
	
	@Test
	public void tc5_openServiceFlightsTest() {
		mp=new MainPage(driver);
		mp.clickOnFlights();
	}
	
	@Test
	public void tc6_openServiceExperiencesTest() {
		mp=new MainPage(driver);
		mp.clickOnExperiences();
	}
	
	
	@Test
	public void tc7_openServiceInsuranceTest() {
		mp=new MainPage(driver);
		mp.clickOnInsurance();
	}
	
	@Test
	public void tc8_openServiceCarRentalTest() {
		mp=new MainPage(driver);
		mp.clickOnCarRental();
	}
}
