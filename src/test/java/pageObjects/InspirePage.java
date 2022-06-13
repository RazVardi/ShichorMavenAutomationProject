package pageObjects;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InspirePage extends BasePage {

	@FindBy(css="[class='search-purpose__item-img'][alt='business']")
	WebElement inspireBusiness;
	@FindBy(css="[class='search-purpose__item-img'][alt='family']")
	WebElement inspireFamily;
	@FindBy(css="[class='search-purpose__item-img'][alt='theme']")
	WebElement inspireTheme;
	@FindBy(css="[class='search-purpose__item-img'][alt='nature']")
	WebElement inspireNature;
	@FindBy(css="[class='search-purpose__item-img'][alt='romantic']")
	WebElement inspireRomantic;
	@FindBy(css="[class='search-purpose__item-img'][alt='sport']")
	WebElement inspireSport;
	@FindBy(css=".btn-blue.btn")
	WebElement nextStep;
	@FindBy(css=".d-block.text-truncate")
	List<WebElement> subCategoryOfSport;
	
	public InspirePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnBusiness() {
		click(inspireBusiness);
	}
	
	

	public void clickOnFamily() {
		click(inspireFamily);
	}
	
	public void clickOnTheme() {
		click(inspireTheme);
	}
	
	public void clickOnNature() {
		click(inspireNature);
	}
	
	public void clickOnRomantic() {
		click(inspireRomantic);
	}
	
	public void clickOnSport() {
		click(inspireSport);
	}
	
	public void clickOnNextStep() {
		click(nextStep);
	}

	public void clickBySportSubCategory(String category ) {
		if(category.equals("Running")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Cycling")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Tennis")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Basketball")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Football")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
	}
	
	public void clickByRomanticSubCategory(String category ) {
		if(category.equals("Birthday")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Vacation")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Anniversary")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Honeymoon")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		
	}
	
	public void clickByNatureSubCategory(String category ) {
		if(category.equals("Blue (islands & beaches)")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Green (mountains & forests)")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		
	}
	
	public void clickByThemeSubCategory(String category ) {
		if(category.equals("Theme parks")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Culture")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Music")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Wine and gastronomy")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Recreation")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
	}

	
	public void clickByFamilySubCategory(String category ) {
		if(category.equals("Leisure")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Extended family")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Bar mitzvah")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		if(category.equals("Annual trip")) {
			for(int i=0;i<subCategoryOfSport.size();i++) {
				if(getText(subCategoryOfSport.get(i)).equals(category)){
					click(subCategoryOfSport.get(i));
				}
			}
		}
		
	}
	
}
