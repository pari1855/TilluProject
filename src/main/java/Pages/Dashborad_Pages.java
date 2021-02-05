package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utility.BaseClass;

public class Dashborad_Pages extends BaseClass {
	
	@FindBy(xpath= "(//ul[@class='navigation-menu']/li/a/i)[1]")
	WebElement dashboard;
	
	@FindBy(xpath ="(//ul[@class='navigation-menu']/li/a/i)")
	List<WebElement> element;
	
	public void clickOnMenuOption(int numOfOption) {
			WebElement option = driver.findElement(By.xpath("(//ul[@class='navigation-menu']/li/a/i)["+numOfOption+"]"));
			option.click();
	}
		
	}

