package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageObjects.MyTripsPage;

public class DeleteMyTrip extends BaseLoginTest{
	

	@Epic("delete cities trips")
	@Feature("basic delete of trips")
	@Story("as user, i want able to cancel trips")
	@Severity(SeverityLevel.CRITICAL)
	@Test(description="Delete trip by name")
	public void deleteMyTrip() {
		mp.openMyTripsVoid();
		MyTripsPage mtp=new MyTripsPage(driver);
		String city="Paris";
		int oldListSize=mtp.deleteMyTrip(city);		
		mtp.sleep(2000L);
		Assert.assertTrue(mtp.saveListSize(oldListSize));
	}
}
