package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Utility.BaseClass;

public class LoginPage extends BaseClass {
		@FindBy(xpath="(//input)[1]")
		WebElement Username;
		
		@FindBy(xpath="(//input)[3]")
		WebElement Password;
		
		@FindBy(xpath="//button[@type ='submit']")
		WebElement loginbtn;
		
		public void userName(String username, String password) {
			Username.sendKeys(username);
			Password.sendKeys(password);
			loginbtn.click();
			Reporter.log("Login Successfully.");
		}
		public LoginPage() {
			
			PageFactory.initElements(driver, this);
		}
}
