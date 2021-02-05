package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.AddProductPages_Form1;
import Pages.AddProductPages_Form2;
import Pages.AddProductPages_Form3;
import Pages.Dashborad_Pages;
import Pages.LoginPage;
import Utility.BaseClass;

public class Testing_Class extends BaseClass {
	@BeforeClass
	public void setup() {
		try {
			driverInitialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void dashBoardOption() {
		LoginPage login_obj = new LoginPage();
		login_obj.userName("admin", "&E.zFR=VDpyK");
		Dashborad_Pages main_obj = new Dashborad_Pages();
		main_obj.clickOnMenuOption(2);
		Reporter.log("Clicked on dashborad option", true);
	}
	@Test(priority=2)
	public void first_form() {
		AddProductPages_Form1 addproduct = new AddProductPages_Form1();
		addproduct.selectTag("Mixed");
		addproduct.enterLotName("TestQA");
		addproduct.enterLotRefNumber("Test123");
		addproduct.enterProductQuantity("225");
		addproduct.selectLotCategory("Test Lots");
		addproduct.selectLocation("Hong Kong");
		addproduct.enterlotDescription("I am doing Testing");
		addproduct.lotType("demo");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addproduct.clickOnNextbtn1();
	}
	@Test(priority=3)
	public void second_form() {
		AddProductPages_Form2 addForm2 = new AddProductPages_Form2();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addForm2.clickOnNextbtn2();
	}
	@Test(priority=4)
	public void third_form() {
		AddProductPages_Form3 addForm3 = new AddProductPages_Form3();
		addForm3.clickOnNextbtn3();		
	}
	/*@Test(priority=5)
	public void fourth_form() {
		driver.findElement(By.xpath("//input[@id='base_price']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='min_base_price']")).sendKeys("1000");
		Select selectSeller_drpDwn= new Select(driver.findElement(By.xpath("//select[@id='seller_name']")));
		selectSeller_drpDwn.selectByVisibleText("CPBids");
		driver.findElement(By.xpath("(//a[@role='menuitem'])[2]")).click();
	}
	@Test(priority=6)
	public void fifth_form() {
		Select timezone_drpdwn = new Select(driver.findElement(By.xpath("//select[@id='timezone']")));
		timezone_drpdwn.selectByIndex(17);
		driver.findElement(By.xpath("//input[@id='datepicker-autoclose']")).sendKeys("2020-09-09");
		driver.findElement(By.xpath("//input[@id='datepicker-autoclose1']")).sendKeys("2020-09-10");
		driver.findElement(By.xpath("(//a[@role='menuitem'])[2]")).click();
	}
	@Test(priority=7)
	public void sixth_form() {
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
*/		
		
	
	/*@AfterClass
	public void tearDown() {
		driver.quit();
	}*/
	
	
}

