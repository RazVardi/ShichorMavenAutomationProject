package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver;
	JavascriptExecutor js ;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver,this);
	}
	
	public void overrideInput(WebElement selector,String value) {
		highlightElement(selector,"green");
		sleep(1000L);
		//selector.clear();
		selector.sendKeys(value);
	}
	
	public void click(WebElement selector) {
		highlightElement(selector,"green");
		sleep(1000L);
		selector.click();
	}
	
	public String getText(WebElement el) {
		highlightElement(el,"orange");
		sleep(1000L);
		return el.getText();
	}
	
	public void sleep(Long sleeptime) {
		
		try {
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void highlightElement(WebElement element, String color) {
		//keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "background-color:yellow;border: 1px solid,background-color " + color   +";" + originalStyle;
		
		
		// Change the style 
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + newStyle + "');},0);",
				element);

		// Change the style back after few miliseconds
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);

	}
}
