package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.BaseClass;

public class AddProductPages_Form1 extends BaseClass {
	
	public AddProductPages_Form1() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Form- LOT Details page
	@FindBy(xpath="(//select[@class='form-control'])[1]")
	WebElement drp_SelectTag;
	
	@FindBy(xpath="//input[@id='lot']")
	WebElement lot_Name;
	
	@FindBy(xpath="//input[@id='OdooRef']")
	WebElement SellerRef_Number;
	
	@FindBy(xpath="//input[@id='quantity']")
	WebElement lotTotal_Quantity;
	
	@FindBy(xpath="//select[@id='category']")
	WebElement lot_category;
	
	@FindBy(xpath="//select[@id='location']")
	WebElement selectLocation;
	
	@FindBy(xpath="//textarea[@id='lot_description']")
	WebElement lotdescription;
	
	@FindBy(xpath="(//input[@name='radio'])[1]")
	WebElement liveRadio;
	
	@FindBy(xpath="(//input[@id='product_type'])[2]")
	WebElement demoRadio;
	
	@FindBy(xpath="//li/a[contains(text(),'Next')]")
	WebElement nextButton;
	
	public void lotType(String liveOrDemo) {
		String type = liveOrDemo;
		if(type.equalsIgnoreCase("live")) {
			liveRadio.click();
		}
		else {
			demoRadio.click();
		}
	}
	
	public WebElement selectTagDrpDwn() {
		return drp_SelectTag;
	}
	
	public void enterLotName(String lotName) {
		lot_Name.sendKeys(lotName);
	}
	
	
	public void enterLotRefNumber(String lotRefNum) {
		SellerRef_Number.sendKeys(lotRefNum);
	}
	public void enterProductQuantity(String totalQuantity) {
		lotTotal_Quantity.sendKeys(totalQuantity);
	}
	
	public void clickOnNextbtn1() {
		nextButton.click();
	}
	
	public void selectLotCategory(String lotCategoryName) {
		Select drpdwn = new Select(lot_category);
		drpdwn.selectByVisibleText(lotCategoryName);
	}
	
	public void selectLocation(String bidLocation) {
		Select drpdwn = new Select(selectLocation);
		drpdwn.selectByVisibleText(bidLocation);
	}
	
	public void enterlotDescription(String lotDescription) {
		lotdescription.sendKeys(lotDescription);
	}
	
	public void selectTag(String optionName) {
	Select drpdwn = new Select(drp_SelectTag);
	try {
	drpdwn.selectByVisibleText(optionName);
	}
	catch(Exception e) {
		System.out.println("SelectTag dropdown option not found "+e.getStackTrace());
	}
	}	
	
	
	}
	
