package StackOverflow;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class Question11232020 extends BaseClass {
	@BeforeTest
	public void InitializeDriver() throws Exception 	{
		driverInitialization();
	}
	@Test
	public void selectOprtions() {
		driver.get("https://uk.farnell.com/");
		Select options = new Select(driver.findElement(By.xpath("//select[@id='categoryIdBox']")));
		options.selectByVisibleText("Ceramic Capacitors");
	}
	
}
