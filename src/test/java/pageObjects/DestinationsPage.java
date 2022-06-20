package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

public class DestinationsPage extends BasePage{
	
	@FindBy(css=".form-input__input.react-autosuggest__input.destinations-header__input")
	WebElement destinationEL;

	public DestinationsPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Click on destination internal link")
	public void clickOnSearchDestination() {
		click(destinationEL);
	}
	
	@Step("type the city name and submit it")
	public void searchDestination(String value) {
		destinationEL.sendKeys(value);
		destinationEL.submit();
	}

}
