package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class PlanPage extends BasePage{
	@FindBy(css=".btn-blue.btn-fluid.btn")
	List<WebElement> startPlan;
	@FindBy(css="[class='destination-cta-banner__button-body']")
	WebElement startPlanNew;
	public PlanPage(WebDriver driver) {
		super(driver);
	}
	
	public void startPlan() {
		sleep(1000L);
		WebElement startPlanEl=startPlan.get(0);
		click(startPlanEl);
	}
	
	@Step("click on inspire me button")
	public void inspireMe() {
		sleep(1000L);
		WebElement startPlanEl1=startPlan.get(1);
		click(startPlanEl1);
	}
	
	@Step("click on start planning + button")
	public void clickOnStartPlanNew() {
		sleep(2000L);
		click(startPlanNew);
	}
}
