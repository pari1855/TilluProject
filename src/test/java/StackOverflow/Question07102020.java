package StackOverflow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class Question07102020 extends BaseClass {
		
	@BeforeTest
	public void InitializeDriver() throws Exception 	{
		driverInitialization();
	}
	
	public void printDataTable() {
		List<WebElement> Rows = driver.findElements(By.xpath("//div[@class='tableContainer']/div/table/tbody/tr[@data-compseason='363']"));
		int totalRows = Rows.size();
		System.out.println("Number of Rows: "+totalRows);
		//int totalColumns;
		for(int i=1;i<=totalRows+1;i++) {
			List<WebElement> Columns = driver.findElements(By.xpath("//div[@class='tableContainer']/div/table/tbody/tr[@data-compseason='363']["+i+"]/td"));
		
			for(WebElement e: Columns) {
				System.out.print(e.getText());
				}
			}
			
}
		 
}
