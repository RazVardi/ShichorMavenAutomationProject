package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

public class BookDestinationsPage extends BasePage{

	
	
	@FindBy(css=".btn-blue.btn")
	WebElement nextStep;
	@FindBy(css="#search-bar.to")
	WebElement writeOnInput;
	@FindBy(css=".destination-form__list-items>button")
	List<WebElement> chooseDestination;
	@FindBy(css=".destination-form-place-option span")
	WebElement chooseListDestination;
	public BookDestinationsPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("search city and submit it")
	public void typeDestination(String city,WebElement destinationInput) {
		click(destinationInput);
		sleep(1000L);
		destinationInput.sendKeys(city);
		sleep(3000L);
		click(chooseListDestination);
		click(nextStep);
	}
	
	@Step("choose preset popular city")
	public void choosePresetDestination(int cityLocation) {
		click(chooseDestination.get(cityLocation)); //cityLocation=0 Paris destination
	}
	
	public String getPresetDestination() {
		String destination=getText(chooseDestination.get(0));
		return destination;
	}

}
