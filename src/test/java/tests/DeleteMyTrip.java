package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.MyTripsPage;


public class DeleteMyTrip extends BaseLoginTest{
	
	//MainPage mp;
	
	@Test
	public void deleteMyTrip() {
		 //=new MainPage(driver);
		mp.openMyTrips();
		MyTripsPage mtp=new MyTripsPage(driver);
		String city="London";
		mtp.deleteMyTrip(city);
		Assert.assertTrue(mtp.checkDeleteMyTrip(city));
	}
}
