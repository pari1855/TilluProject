package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class TestingLinks extends BaseClass {
	@BeforeTest
	public void setUp() throws Exception {
		driverInitialization();
	}
	@Test
	public void fetchLinks() {
		//driver.get("https://www.bing.com/");
		//driver.findElement(By.id("dots_overflow_menu_container")).click();
		 driver.get("https://www.allegro.pl");

	        WebElement categoryCombo = driver.findElement(By.xpath("//div//div//select"));
	        Select categorySelect = new Select(categoryCombo);
	        categorySelect.selectByIndex(3);
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("/html/body/div[2]/div[8]/div/div[2]/div/div[2]/button[2]")).click(); 
	       WebElement inputField =driver.findElement(By.xpath("//input[@name='string']"));
	       inputField.sendKeys("mavic mini");
	       inputField.submit();
} 
}
