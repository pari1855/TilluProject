package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class AddProductPages_Form2 extends BaseClass {
	
	public AddProductPages_Form2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@role='menuitem'])[2]")
	WebElement loginBtn;
	
	public void clickOnNextbtn2() {
		loginBtn.click();
	}

}
