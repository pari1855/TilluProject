package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Dashborad_Pages;
import Pages.LoginPage;
import Utility.BaseClass;

public class Dashboard_TC extends BaseClass{
	
	@BeforeMethod
	public void setup() {
		try {
			driverInitialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void dashBoardOption() {
		LoginPage login_obj = new LoginPage();
		login_obj.userName("admin", "&E.zFR=VDpyK");
		Dashborad_Pages main_obj = new Dashborad_Pages();
		main_obj.clickOnMenuOption(2);
		Reporter.log("Clicked on dashborad option", true);
		//1. Lot Details testScript
		Select drpOP_1 = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[1]")));
		drpOP_1.selectByIndex(3);
		driver.findElement(By.xpath("//input[@id='lot']")).sendKeys("Test_Lot");
		String lot_Ref_No = driver.findElement(By.xpath("//input[@id='lot_ref_number']")).getText().toString();
		System.out.println("Lot Reference number is: "+ lot_Ref_No + "carried");
		driver.findElement(By.xpath("//input[@id='OdooRef']")).sendKeys("Ref123");
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("100");
		Select drpCategory = new Select(driver.findElement(By.xpath("//select[@id='category']")));
		drpCategory.selectByVisibleText("Test Lots");
		Select drpLocation = new Select(driver.findElement(By.xpath("//select[@id='location']")));
		drpLocation.selectByVisibleText("Hong Kong");
		driver.findElement(By.xpath("//textarea[@id='lot_description']")).sendKeys("This is for Testing purpose....");
		driver.findElement(By.xpath("(//input[@name='radio'])[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//li/a[contains(text(),'Next')]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//a[@role='menuitem'])[2]")).click();

		WebElement next_button = driver.findElement(By.xpath("(//li/a[@role='menuitem'])[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", next_button);
		next_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='base_price']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='min_base_price']")).sendKeys("1000");
		Select selectSeller_drpDwn= new Select(driver.findElement(By.xpath("//select[@id='seller_name']")));
		selectSeller_drpDwn.selectByVisibleText("CPBids");
		driver.findElement(By.xpath("(//a[@role='menuitem'])[2]")).click();
		Select timezone_drpdwn = new Select(driver.findElement(By.xpath("//select[@id='timezone']")));
		timezone_drpdwn.selectByIndex(17);
		driver.findElement(By.xpath("//input[@id='datepicker-autoclose']")).sendKeys("2020-09-09");
		driver.findElement(By.xpath("//input[@id='datepicker-autoclose1']")).sendKeys("2020-09-10");
		driver.findElement(By.xpath("(//a[@role='menuitem'])[2]")).click();
		driver.findElement(By.xpath("(//a[@role='menuitem'])[3]")).click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		
		
		
	}
	
	
}
