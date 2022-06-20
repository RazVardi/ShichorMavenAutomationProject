package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

public class MyTripsPage extends BasePage {
	
	@FindBy(css = "[class='trip-item__title']")
	private List<WebElement> listTitle;
	@FindBy(css = ".trip-item__control.trip-item__control--delete>[class='vector-icon']")
	private List<WebElement> listTrash;
	@FindBy(css = ".btn-blue.btn-small.btn")
	private WebElement listTrash2;
	@FindBy(css = ".btn.btn-link")
	private List<WebElement> openCityList;
	int i;
	
	public MyTripsPage(WebDriver driver) {
		super(driver);

	}
	
	
	public int deleteMyTrip(String city) {
		for(i=0;i<listTitle.size();i++) {
			if(getText(listTitle.get(i)).equals(city)) {
				click(listTrash.get(i));
				click(listTrash2);
				System.out.println("paris deleted from mytrip");
				return listTitle.size();
			}
		}
		i=-1;
		return i;
	}
	
	public Boolean checkDeleteMyTrip(int oldListSize) {
		
		if(oldListSize-1==listTitle.size()) {
			return true;
		}
		return false;
	}
	
	@Step("test if city exist on the list")
	public Boolean openMyTrip(String city) {
		for(int i=0;i<listTitle.size();i++) {
			if(getText(listTitle.get(i)).equals(city)) {
				click(openCityList.get(i));
				sleep(2000L);
				return true;
			}
			
		}
		return false;
	}


	public Boolean saveListSize(int oldListSize) {
		try {
			Boolean state=checkDeleteMyTrip(oldListSize);
			System.out.println("state is: " + state);
			return state;
		}catch(Exception error) {
			return false;
		}
	}
}

