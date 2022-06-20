package pageObjects;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;



public class MainPage extends BasePage {
	
	@FindBy(css = "#email")
	private WebElement emailField;
	@FindBy(css = "div>#password")
	private WebElement passwordField;
	@FindBy(css = ".nav-right__user>button")
	private WebElement loginBtnEl;
	@FindBy(css = ".btn-dark-blue.btn")
	private WebElement loginBtnEl2;
	@FindBy(css = "button.nav-right-menu__item")
	private WebElement logoutBtn;
	@FindBy(css = ".btn-blue.btn-fluid.btn")
	private WebElement loginBtnApprove;
	@FindBy(css = ".btn-blue.btn-small.btn")
	private WebElement logoutBtnApprove;
	@FindBy(css = ".nav-right__user-profile>button")
	private WebElement profielEl;
	@FindBy(css = ".form-error")
	private WebElement errorEl;
	@FindBy(css = ".nav-right__toggle>.btn")
	private WebElement globe;
	@FindBy(css = "button~.locale-settings-list__item:nth-child(2)")
	private WebElement dollar;
	@FindBy(css = "button~.locale-settings-list__item:nth-child(3)")
	private WebElement euro;
	@FindBy(css = "div>.locale-settings-list__item:first-child")
	private WebElement shekel;
	@FindBy(css = ".locale-settings__tab+.locale-settings__tab")
	private WebElement currency;
	@FindBy(css = "span>.home-hero__button-img")
	private WebElement startPlan;
	@FindBy(css = ".app-header__desktop [href='/en/profile/bookmarks']>.vector-icon")
	private WebElement myTrip;
	@FindBy(css = ".app-header__desktop [href='/en/destinations']>.vector-icon")
	private WebElement destinations;
	@FindBy(css = ".app-header__desktop [href='https://tripready.co.il/']>.vector-icon")
	private WebElement covidAssist;
	
	@FindBy(css = "[class='header-dropdown__title']")
	private List<WebElement> serviceMenu;
	@FindBy(css = "[class='header-dropdown-menu']")
	private List<WebElement> hotelLinkXpath;
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	@FindBy(css="[href='https://www.booking.com/?aid=344905&changed_currency=1&selected_currency=ILS']:last-child")
	private WebElement hotelFooter;
	@FindBy(css = "[class='btn-dark-blue btn']")
	private WebElement saveTripBtn;
	@FindBy(css=".rs-select2__input #search-bar\\.to")
	WebElement destinationInput;
	@FindBy(css=".react-joyride__spotlight"/*".react-joyride__overlay"*/)
	WebElement removePopup;
	@FindBy(css=".modal-v2__close-button>[class='vector-icon']")
	WebElement xIcon;
	@FindBy(css=".locale-settings__tab.locale-settings__tab--active>.locale-settings__tab-value")
	WebElement currentCurrency;
	String strCurrentCurrency;
	@FindBy(css="[class='app-header__logo']")
	WebElement shichorLogo;
	
	@FindBy(css=".trip-item__title")
	List<WebElement> myTripTitle;
	@FindBy(css="[class='header-dropdown-item']")
	List<WebElement> serviceList;
	@FindBy(css="[class='app-header__desktop'] [class='header-dropdown__title'] span")
	WebElement serviceMenuHover;
	@FindBy(css="[class='app-header__desktop'] [href='https://www.booking.com/?aid=344905&changed_currency=1&selected_currency=ILS'] span")
	WebElement hotelLink;
	@FindBy(css="[class='app-header__desktop'] [href='https://shichor.kiwi.com/en/landing/?currency=ILS'] img")
	WebElement flightsLink;
	@FindBy(css="[class='app-header__desktop'] [href='https://www.viator.com/?medium=api&pid=P00048614&mcid=42383'] img")
	WebElement experiencesLink;
	@FindBy(css="[class='app-header__desktop'] [href='https://www.555.co.il/pearl/apps/travel?companyName=SHR'] img")
	WebElement insuranceLink;
	@FindBy(css="[class='app-header__desktop'] [href='https://www.rent4less.co.il/WhiteLabelsRes/7522-en/WhiteLabel.aspx'] img")
	WebElement carRentalLink;
	@FindBy(css="[class='app-header__desktop'] [class='header-dropdown-menu'] a")
	List<WebElement> listLinks;
	private int i;
	
	
	public MainPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Click on login button")
	public void clickOnLogin() {
		click(loginBtnEl);
	}
	
	@Step("made a login process")
	public void login(String email, String password) {
		overrideInput(emailField,email);
		overrideInput(passwordField,password);
		click(loginBtnApprove);	
	}
	
	@Step("made a logout process")
	public String logout() {
		Actions action = new Actions(driver);
		sleep(2000l);
		action.moveToElement(profielEl).build().perform();
		click(logoutBtn);
		sleep(2000l);
		click(logoutBtnApprove);
		sleep(2000l);
		String loginStr=getText(loginBtnEl);
		System.out.println("loginStr is: " + loginStr);
		return loginStr;
		
	}
	
	@Step("test if login is succes")
	public String loginSucceedTest() {
		String profileElStr=getText(profielEl);
		return profileElStr;
		
	}

	public String getErrorMessage(String errorMsg) {
		errorMsg=getText(errorEl);
		return errorMsg;
	}
	
	@Step("get the error message")
	public String loginFailedTest() {
		String errorMsg=getText(errorEl);
		System.out.println("the error message is: " + errorMsg);
		return errorMsg;
	}
	
	@Step("Click on x icon")
	public void clickOnXicon() {
		click(xIcon);
	}
	
	@Step("change currency to dollar process")
	public String changeCurrencyToDollarTest() {
		Actions action = new Actions(driver);
		action.moveToElement(globe).build().perform();
		click(currency);
		click(dollar);
		action.moveToElement(globe).build().perform();
		click(currency);
		sleep(2000l);
		strCurrentCurrency= getText(currentCurrency);
		return strCurrentCurrency;
	}
	
	@Step("change currency to euro process")
	public String changeCurrencyToEuroTest() {
		Actions action = new Actions(driver);
		action.moveToElement(globe).build().perform();
		click(currency);
		click(euro);
		action.moveToElement(globe).build().perform();
		click(currency);
		sleep(2000l);
		strCurrentCurrency= getText(currentCurrency);
		return strCurrentCurrency;
	}
	
	@Step("change currency to shekel process")
	public String changeCurrencyToShekelTest() {
		Actions action = new Actions(driver);
		action.moveToElement(globe).build().perform();
		click(currency);
		click(shekel);
		action.moveToElement(globe).build().perform();
		sleep(2000l);
		click(currency);
		sleep(2000l);
		strCurrentCurrency= getText(currentCurrency);
		return strCurrentCurrency;
	}
	
	
	
	@Step("open the my trips page on the site")
	public Boolean openMyTrips() {
		try {
			sleep(3000L);
			click(myTrip);
			sleep(3000L);
			return true;
		}catch(Exception error) {
			return false;
		}
		
	}
	
	@Step("open the my trips page on the site")
	public void openMyTripsVoid() {
		click(myTrip);
		sleep(2000l);
	}
	
	@Step("open the destination page on the site")
	public Boolean openDestinations() {
		try {
			click(destinations);
			return true;
		}catch(Exception error) {
			return false;
		}
		
	}
	
	@Step("open the covid assist page on the site")
	public Boolean openCovidAssist() {
		try {
			click(covidAssist);
			sleep(3000L);
			closeTab();
			return true;
		}catch(Exception error) {
			return false;
		}
		
	}
	
	@Step("open the hotels links page on external site")
	public Boolean  clickOnHotelNew() {
		try {
			hoverOnServiceMenu();
			sleep(3000L);
			linkLocation(i++);
			return true;
		}catch(Exception error) {
			return false;
		}
		
	}
	
	@Step("open the flights links page on external site")
	public Boolean clickOnFlightsNew() {
		try {
			hoverOnServiceMenu();
			sleep(3000L);
			linkLocation(i++);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
	
	@Step("open the experiences links page on external site")
	public Boolean clickOnExperiencesNew() {
		try {
			hoverOnServiceMenu();
			sleep(3000L);			
			linkLocation(i++);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
	
	@Step("open the insurance links page on external site")
	public Boolean clickOnInsuranceNew() {
		hoverOnServiceMenu();
		try {
			hoverOnServiceMenu();
			sleep(3000L);
			linkLocation(i++);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
	
	@Step("open the car rental links page on external site")
	public Boolean clickOnCarRentalNew() {
		hoverOnServiceMenu();
		try {
			hoverOnServiceMenu();
			sleep(3000L);		
			linkLocation(i);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
	
	@Step("hover  on the service menu  to show the links on internal site")
	public void hoverOnServiceMenu() {
		click(serviceMenuHover);
		System.out.println("test hoverOnServiceMenu is: "+ serviceMenuHover);
	}
	
	
	
	public void createNewFlexibleTrip2() {
		sleep(3000l);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.startPlan();
		BookDestinationsPage bdp=new BookDestinationsPage(driver);
		String city="Helsinki";
		sleep(2000l);
		bdp.typeDestination(city,destinationInput);
		/*BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		sleep(3000l);
		driver.navigate().refresh();
		sleep(5000l);
		click(saveTripBtn);
		sleep(4000l);
		openMyTrips();
		for(int i=0;i<myTripTitle.size();i++) {
			if(getText(myTripTitle.get(i)).equals("Oslo")) {
				return true;
			}
		}
		return false;*/
	}
	
	public Boolean createNewFlexibleTrip() {
		sleep(3000l);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.startPlan();
		BookDestinationsPage bdp=new BookDestinationsPage(driver);
		String city="Oslo";
		sleep(2000l);
		bdp.typeDestination(city,destinationInput);
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		sleep(3000l);
		driver.navigate().refresh();
		sleep(5000l);
		click(saveTripBtn);
		sleep(4000l);
		openMyTrips();
		for(int i=0;i<myTripTitle.size();i++) {
			if(getText(myTripTitle.get(i)).equals("Oslo")) {
				return true;
			}
		}
		return false;
	}
	public Boolean createNewFlexibleTripPresetDest () {
		sleep(3000l);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.startPlan();
		BookDestinationsPage bdp=new BookDestinationsPage(driver);
		int cityLocation=0;
		bdp.choosePresetDestination(cityLocation);
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		sleep(3000L);
		driver.navigate().refresh();
		sleep(3000L);
		click(saveTripBtn);
		sleep(3000L);
		openMyTrips();
		for(int i=0;i<myTripTitle.size();i++) {
			if(getText(myTripTitle.get(i)).equals("Paris")) {
				return true;
			}
		}
		return false;
	}
	
	public String createNewFlexibleBusinessTrip() {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnBusiness();
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String strTup=tup.businessSetGraphs();
		tup.showResault();
		return strTup;
	}
	
	public String createNewFlexibleFamilyTrip() {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnFamily();
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String category="Family";
		String  [] tupStr= tup.familySetGraphs(category);
		tup.showResault();
		return tupStr[0];
	}
	
	public String createNewFlexibleNatureTrip() {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnNature();
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String category="Nature";
		String[] strArr=tup.natureSetGraphs(category);
		tup.showResault();
		return strArr[0];
	}
	
	public String createNewFlexibleRomanticTrip() {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnRomantic();
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String category="Romantic";
		String[] strArr =tup.romanticSetGraphs(category);
		tup.showResault();
		return strArr[0];
	}
	public String createNewFlexibleSportTrip() {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnSport();
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String str=tup.sportSetGraphs();
		sleep(3000L);
		tup.showResault();
		sleep(3000L);
		return str;
	}
	
	public String createNewFlexibleSportTripByCategory(String category) {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnSport();
		ip.clickBySportSubCategory(category);
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String str= tup.sportSetGraphs();
		sleep(3000L);
		tup.showResault();
		click(shichorLogo);
		sleep(2000L);
		return str;
	}
	
	public String createNewFlexibleRomanticTripByCategory(String category) {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnRomantic();
		sleep(2000L);
		ip.clickByRomanticSubCategory(category);
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String[] strArr=tup.romanticSetGraphs(category);
		sleep(3000L);
		tup.showResault();
		click(shichorLogo);
		sleep(2000L);
		return chooseReturnRomantic(strArr,category);
	}
	
	private String chooseReturnRomantic(String[] strArr, String category) {
		if(category.equals("Honeymoon")) {
			return strArr[1];
		}
		if(category.equals("Anniversary")) {
			return strArr[2];
		}
		return strArr[3]; //category.equals("Birthday")||
		                  //(category.equals("Vacation"))
	}

	public String createNewFlexibleNatureTripByCategory(String category) {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnNature();
		sleep(2000L);
		ip.clickByNatureSubCategory(category);
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String[] strArr=tup.natureSetGraphs(category);
		sleep(3000L);
		tup.showResault();
		click(shichorLogo);
		sleep(2000L);
		return strArr[1];
	}
	
	public String createNewFlexibleThemeTripByCategory(String category) {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnTheme();
		ip.clickByThemeSubCategory(category);
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String[] strArr= tup.themeSetGraphs(category);
		sleep(3000L);
		tup.showResault();
		click(shichorLogo);
		sleep(2000L);
		return chooseReturnTheme(strArr,category);
	}
	
	private String chooseReturnTheme(String[] strArr, String category) {
		if(category.equals("Wine and gastronomy")) {
			return strArr[1];
		}
		if(category.equals("Music")) {
			return strArr[2];
		}
		if(category.equals("Culture")) {
			return strArr[3];
		}
		if(category.equals("Theme parks")) {
			return strArr[4];
		}
		return strArr[5]; //category.equals("Recreation")
	}

	public String createNewFlexibleFamilyTripByCategory(String category) {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnFamily();
		ip.clickByFamilySubCategory(category);
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String [] strArr=tup.familySetGraphs(category);
		sleep(3000L);
		tup.showResault();
		click(shichorLogo);
		sleep(2000L);
		return chooseReturnFamily(strArr,category);
	}
	
	private String chooseReturnFamily(String[] strArr,String category) {
		if(category.equals("Extended family")) {
			return strArr[0];
		}
		if(category.equals("Annual trip") || category.equals("Leisure")) {
			return strArr[1];
		}
		return strArr[2]; //"Bar mitzvah"
	}

	public String createNewFlexibleThemeTrip() {
		sleep(3000L);
		click(startPlan);
		PlanPage pp =new PlanPage(driver);
		pp.inspireMe();
		BookDatesPage bdp2=new BookDatesPage(driver);
		bdp2.clickOnFlexibleDate();
		InspirePage ip=new InspirePage(driver);
		ip.clickOnTheme();
		ip.clickOnNextStep();
		TellUsPage tup =new TellUsPage(driver);
		String category="Theme";
		String[] strArr= tup.themeSetGraphs(category);
		tup.showResault();
		return strArr[0];
	}
	
	public boolean createTripByDestinationOnly() {
		sleep(3000L);
		openDestinations();
		DestinationsPage dp=new DestinationsPage(driver);
		sleep(3000L);
		dp.clickOnSearchDestination();
		String city="Frankfurt";
		dp.searchDestination(city);
		sleep(3000L);
		SearchPage sp=new SearchPage(driver);
		sp.clickOnImageURL();
		sleep(3000L);
		PlanPage pp=new PlanPage(driver);
		pp.clickOnStartPlanNew();
		sleep(3000L);
		driver.navigate().refresh();
		click(saveTripBtn);
		sleep(3000L);
		openMyTrips();
		for(int i=0;i<myTripTitle.size();i++) {
			if(getText(myTripTitle.get(i)).equals("Frankfurt")) {
				return true;
			}
		}
		return false;
		
	}
	
	public Boolean openExistingTrip(String city) {
		openMyTrips();
		MyTripsPage mtp=new MyTripsPage(driver);
		if(mtp.openMyTrip(city)){
			return true;
		}else {
			return false;
		}
	}
	
	public void closeTab() {
		sleep(2000L);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
	}
	
	public Boolean linkLocation(int i) {
		while(i<listLinks.size()) {
			click(listLinks.get(i));
			closeTab();
			return true;
		}
		return false;
	}
	
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	
}
