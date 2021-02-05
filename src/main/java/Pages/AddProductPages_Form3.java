package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;
import Utility.ScrollDown;

public class AddProductPages_Form3 extends BaseClass  {

		public AddProductPages_Form3() {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "(//li/a[@role='menuitem'])[2]")
	WebElement nextBtn;
	ScrollDown scrollTo = new ScrollDown();
	
	public void clickOnNextbtn3() {
		scrollTo.scrollDown(nextBtn);
		nextBtn.click();
	}
}
