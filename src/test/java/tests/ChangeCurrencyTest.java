package tests;





import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MainPage;

public class ChangeCurrencyTest extends BaseTest{
	
	MainPage mp;
	
	
	
	@Test
	public void changeCurrencyToDollarTest() {
		mp=new MainPage(driver);
		Assert.assertEquals(mp.changeCurrencyToDollarTest(), "USD");
	}
	
	@Test
	public void changeCurrencyToEuroTest() {
		mp=new MainPage(driver);
		Assert.assertEquals(mp.changeCurrencyToEuroTest(), "EUR");
	}
	
	@Test
	public void changeCurrencyToShekelTest() {
		mp=new MainPage(driver);
		Assert.assertEquals(mp.changeCurrencyToShekelTest(), "ILS");
	}
}
