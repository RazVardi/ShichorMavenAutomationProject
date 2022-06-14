package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class TellUsPage extends BasePage{
	
	
	
	@FindBy(css=".rc-slider-handler-tooltip")//"[class='interest-slider__handle']")
	List<WebElement> slider;
	@FindBy(css=".btn-blue.btn")
	WebElement showResaultBtn;
	@FindBy(css=".title")
	List<WebElement> title;
	@FindBy(css=".d-block.text-truncate")
	List<WebElement> sportSunTitle;

	
	public TellUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Step("set profile graph value for business category")
	public String businessSetGraphs() {
		Integer counter=0;
		for (int i=0;i<title.size();i++) {
			if(getText(title.get(i)).equals("Museums & Galleries")) {
				Actions move = new Actions(driver);
				click(slider.get(i));
				move.dragAndDropBy(slider.get(i), -2, 0).perform();
				sleep(3000L);
				counter++;
			}	
			if(getText(title.get(i)).equals("Sights & Attractions")) {
				Actions move = new Actions(driver);
				click(slider.get(i));
				move.dragAndDropBy(slider.get(i), 0, 0).perform();
				sleep(3000L);
				counter++;
			}	
			if(getText(title.get(i)).equals("Nightlife")) {
				Actions move = new Actions(driver);
				click(slider.get(i));
				move.dragAndDropBy(slider.get(i), 5, 0).perform();
				sleep(3000L);
				counter++;
				break;
			}	
		}
		String strCounter=counter.toString();
		return strCounter;
	}
	
	@Step("set profile graph value for family category")
	public String[] familySetGraphs(String category) {
		Integer counter=0;
		if(category.equals("Family") || category.equals("Extended family")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), -1, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shows & Cultural Events")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), -4, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shopping")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 5, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Sports")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 0, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
			
			
		}
		String strCounter=counter.toString();
		String[] strCounterArr = new String[3];
		strCounterArr[0]= strCounter;
		counter=0;
		if(category.equals("Annual trip") || category.equals("Leisure")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), -5, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shows & Cultural Events")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 5, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strCounter=counter.toString();
		strCounterArr[1]= strCounter;
		counter=0;
		if(category.equals("Bar mitzvah")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), -5, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
				
			}
		}
		strCounter=counter.toString();
		strCounterArr[2]= strCounter;
		return strCounterArr;
	}
	
	public void leisure() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Leisure")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void extended_family() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Extended family")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void bar_mitzvah() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Bar mitzvah")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void annual_trip() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Annual trip")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	@Step("set profile graph value for nature category")
	public String[] natureSetGraphs(String category) {
		Integer counter=0;
		if(category.equals("Nature")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					sleep(3000L);
					click(slider.get(i));
					sleep(3000L);
					move.dragAndDropBy(slider.get(i), 4, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Recreation")) {
					Actions move = new Actions(driver);
					sleep(3000L);
					click(slider.get(i));
					sleep(3000L);
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
				
			}
		}
		String[] strArr=new String[2];
		strArr[0]=counter.toString();
		counter=0;
		if(category.equals("Blue (islands & beaches)") || category.equals("Green (mountains & forests)")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					sleep(3000L);
					click(slider.get(i));
					sleep(3000L);
					move.dragAndDropBy(slider.get(i), 4, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strArr[1]=counter.toString();
		return strArr;
	}
	
	public void blue_islands_and_beaches() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Blue (islands & beaches)")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void green_mountains_and_forests() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Blue (islands & beaches)")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	@Step("set profile graph value for romantic category")
	public String [] romanticSetGraphs(String category) {
		//List<Integer>myList=new ArrayList<Integer>();
		Integer counter=0;
		if(category.equals("Romantic")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shows & Cultural Events")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 4, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shopping")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 6, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Nightlife")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 5, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		String[] strArr=new String[4];
		strArr[0]=counter.toString();
		counter=0;
		if(category.equals("Honeymoon")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shows & Cultural Events")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), -4, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shopping")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), -5, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strArr[1]=counter.toString();
		counter=0;
		if(category.equals("Anniversary")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shopping")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 5, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strArr[2]=counter.toString();
		counter=0;
		if(category.equals("Birthday")||(category.equals("Vacation"))) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shows & Cultural Events")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 4, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shopping")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), -5, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Nightlife")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), -5, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strArr[3]=counter.toString();
		return strArr;
		
	}
	
	public void birthday() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Birthday")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void vacation() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Vacation")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void anniversary() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Anniversary")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void honeymoon() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Honeymoon")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	@Step("set profile graph value for sport category")
	public String sportSetGraphs() {
		Integer counter=0;
		sleep(1000L);
		for (int i=0;i<title.size();i++) {
			if(getText(title.get(i)).equals("Sports")) {
				Actions move = new Actions(driver);
				click(slider.get(i));
				move.dragAndDropBy(slider.get(i), 5, 0).perform();
				click(slider.get(i));
				sleep(3000L);
				counter++;
				break;
			}
		}
		String strCnt=counter.toString();
		return strCnt;
	}
	
	public void running() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Running")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void cycling() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Cycling")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void tennis() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Tennis")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void basketball() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Basketball")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void football() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Football")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	@Step("set profile graph value for theme category")
	public String[] themeSetGraphs(String category) {
		Integer counter=0;
		if(category.equals("Theme")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Museums & Galleries")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 2, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shows & Cultural Events")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 6, 0).perform();
					sleep(3000L);
					counter++;
				}
				
				if(getText(title.get(i)).equals("Gastronomy")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Recreation")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		String[]strArr=new String[6];
		strArr[0]=counter.toString();
		counter=0;
		if(category.equals("Wine and gastronomy")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Gastronomy")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), -4, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Recreation")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strArr[1]=counter.toString();
		counter=0;
		if(category.equals("Music")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Shows & Cultural Events")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 6, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strArr[2]=counter.toString();
		counter=0;
		if(category.equals("Culture")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Museums & Galleries")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 2, 0).perform();
					sleep(3000L);
					counter++;
				}
				if(getText(title.get(i)).equals("Shows & Cultural Events")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 6, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strArr[3]=counter.toString();
		counter=0;
		if(category.equals("Theme parks")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Sights & Attractions")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strArr[4]=counter.toString();
		counter=0;
		if(category.equals("Recreation")) {
			for (int i=0;i<title.size();i++) {
				if(getText(title.get(i)).equals("Recreation")) {
					Actions move = new Actions(driver);
					click(slider.get(i));
					move.dragAndDropBy(slider.get(i), 3, 0).perform();
					sleep(3000L);
					counter++;
					break;
				}
			}
		}
		strArr[5]=counter.toString();
		counter=0;
		return strArr;
	}
	
	public void wine_and_gastronomy() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Wine and gastronomy")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void music() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Music")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void culture() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Culture")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void theme_parks() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Theme parks")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	public void recreation() {
		for(int i=0;i<sportSunTitle.size();i++) {
			if(getText(sportSunTitle.get(i)).equals("Recreation")) {
				click(sportSunTitle.get(i));
			}
		}
	}
	
	@Step("Click on show resaults button")
	public void showResault() {
		click(showResaultBtn);
	}
}
