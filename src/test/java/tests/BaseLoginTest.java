package tests;



import org.testng.annotations.BeforeClass;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseLoginTest extends BaseTest {
	
	@BeforeClass
	public void setup() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.shichor.co.il/en");
		mp.clickOnLogin();
		mp.sleep(1000l);
		mp.login("raz.auto@yahoo.com", "otuA14916");
	}
}
