package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import io.qameta.allure.Attachment;

public class ListenerClass extends TestListenerAdapter {
	@Attachment
	public byte[] captureScreenshot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Object webDriverAttribute = result.getTestContext().getAttribute("WebDriver");
		if(webDriverAttribute instanceof WebDriver) {
			captureScreenshot((WebDriver)webDriverAttribute);
		}
	}
}
