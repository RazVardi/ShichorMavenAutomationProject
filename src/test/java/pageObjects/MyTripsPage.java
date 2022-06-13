package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTripsPage extends BasePage {
	
	@FindBy(css = "[class='trip-item__title']")
	private List<WebElement> listTitle;
	@FindBy(css = ".trip-item__control.trip-item__control--delete>[class='vector-icon']")
	private List<WebElement> listTrash;
	@FindBy(css = ".btn-blue.btn-small.btn")
	private WebElement listTrash2;
	@FindBy(css = ".btn.btn-link")
	private List<WebElement> openCityList;
	
	public MyTripsPage(WebDriver driver) {
		super(driver);

	}
	
	
	public void deleteMyTrip(String city) {
		for(int i=0;i<listTitle.size();i++) {
			if(getText(listTitle.get(i)).equals(city)) {
				click(listTrash.get(i));
				click(listTrash2);
				
			}
		}
	}
	public Boolean checkDeleteMyTrip(String city) {
		for(int i=0;i<listTitle.size();i++) {
			if(!getText(listTitle.get(i)).equals(city)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean  openMyTrip(String city) {
		for(int i=0;i<listTitle.size();i++) {
			if(getText(listTitle.get(i)).equals(city)) {
				click(openCityList.get(i));
				sleep(2000L);
				return true;
			}
			
		}
		return false;
	}

}
