package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

public class SearchPage extends BasePage {
	
	@FindBy(css=".destinations-page-item__link.d-block.flex-fill")
	WebElement imageURL;
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Click on the image url")
	public void clickOnImageURL() {
		sleep(3000L);
		click(imageURL);
	}

}
