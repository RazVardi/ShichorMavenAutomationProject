package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CreateTripByDestinationOnlyTest extends BaseLoginTest  {
	
	
	@Epic("creat trip with destination only")
	@Feature("create trip without dates")
	@Story("as user, i want to create trip without dates")
	@Severity(SeverityLevel.TRIVIAL)
	@Test(description="create trip with destination only")
	public void createTripByDestinationOnly(){
		Assert.assertTrue(mp.createTripByDestinationOnly());
	}
}
