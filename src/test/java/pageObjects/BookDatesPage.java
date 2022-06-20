package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

public class BookDatesPage extends BasePage{
	
	@FindBy(css="[class='dates-form__picker']")
	WebElement datePicker;
	@FindBy(css="[class='search-dates-menu__flexible']")
	private WebElement FlexibleDateBtn;
	@FindBy(css=".btn-blue.btn")
	private List<WebElement> planTripBtn;
	
	public BookDatesPage(WebDriver driver) {
		super(driver);
	}	
	
	@Step("click on flexible dates button")
	public void clickOnFlexibleDate() {
		sleep(1000L);
		click(FlexibleDateBtn);
	}

}
