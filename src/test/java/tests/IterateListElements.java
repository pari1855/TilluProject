package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class IterateListElements extends BaseClass {
	
	@BeforeTest
	public void driversetUp() throws Exception {
		driverInitialization();
		driver.get("https://burblesoft.com/login/dz");
	}
	
	@Test
	public void iterateElements() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rogerdemo");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("11111111!");
		driver.findElement(By.xpath("//button[@id='submit_button']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='index-page-buttons']/a"));
		System.out.println("List Size "+ele.size());
		for(WebElement e: ele) {
			System.out.println(e.getText());
			if(e.getText().equalsIgnoreCase("Burble DZM")) {
				e.click();
			}
		}
	}

}
