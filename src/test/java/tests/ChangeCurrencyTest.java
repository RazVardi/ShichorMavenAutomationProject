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

public class ChangeCurrencyTest extends BaseTest{
	
	
	
	@Epic("dollar currency")
	@Feature("change currency to dollar")
	@Story("as user, i want to change currency to dollar")
	@Severity(SeverityLevel.NORMAL)
	@Description("valid the Change currency to dollar - exptected to success")
	@Test(description="Change currency to dollar")
	public void changeCurrencyToDollarTest() {
		Assert.assertEquals(mp.changeCurrencyToDollarTest(), "USD");
	}
	
	@Epic("euro currency")
	@Feature("change currency to euro")
	@Story("as user, i want to change currency to euro")
	@Severity(SeverityLevel.NORMAL)
	@Description("valid the Change currency to euro - exptected to success")
	@Test(description="Change currency To euro")
	public void changeCurrencyToEuroTest() {
		Assert.assertEquals(mp.changeCurrencyToEuroTest(), "EUR");
	}
	
	@Epic("shekel currency")
	@Feature("change currency to shekel")
	@Story("as user, i want to change currency to shekel")
	@Severity(SeverityLevel.NORMAL)
	@Description("valid the Change currency to shekel - exptected to success")
	@Test(description="Change currency To shekel")
	public void changeCurrencyToShekelTest() {
		Assert.assertEquals(mp.changeCurrencyToShekelTest(), "ILS");
	}
}
