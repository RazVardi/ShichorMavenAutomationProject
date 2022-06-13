package tests;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.MainPage;

public class BaseLoginTest extends BaseTest {
	//WebDriver driver;
	
	MainPage mp;
	@BeforeClass
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.shichor.co.il/en");
		mp = new MainPage(driver);
		mp.clickOnLogin();
		mp.sleep(1000l);
		mp.login("raz.auto@yahoo.com", "otuA14916");
	}
}
