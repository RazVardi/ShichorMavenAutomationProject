package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;





public class BaseTest {
	
	 WebDriver driver;
	
	@BeforeClass
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shichor.co.il/en");
		
	}
	
	@AfterClass
	public void tearDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
