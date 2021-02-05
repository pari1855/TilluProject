package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class landingPage extends BaseClass {
	
	@FindBy(xpath="(//a[contains(text(), 'DROPZONE')])[1]")
	WebElement selectDZ;
	
	public WebElement buttonDZ() {
		return selectDZ;
	}
	public void clickOnDZ() {
		selectDZ.click();
	}
	
	
	public landingPage() {
		PageFactory.initElements(driver, this);
	}

}
