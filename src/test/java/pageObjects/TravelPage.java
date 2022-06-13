package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelPage extends BasePage{
	
	@FindBy(css=".form-input__input.react-autosuggest__input.destinations-header__input")
	WebElement destinationEL;
	public TravelPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnSearchDestination() {
		click(destinationEL);
	}
	
	public void searchDestination(String value) {
		destinationEL.sendKeys(value);
		destinationEL.submit();
	}

}
