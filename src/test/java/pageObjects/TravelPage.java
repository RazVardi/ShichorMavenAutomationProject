package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class TravelPage extends BasePage{
	
	@FindBy(css=".form-input__input.react-autosuggest__input.destinations-header__input")
	WebElement destinationEL;
	public TravelPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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
