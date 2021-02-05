package testingAPI;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.http.HttpRequest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Example1 extends BaseClass {

		@BeforeTest
		public void driverini() throws Exception {
		driverInitialization();
		}
		
		//String getAPI = "http://api.zippopotam.us/us/90210";
		@Test(enabled=false)
		public void TC_01() {
		RestAssured.baseURI = "http://api.zippopotam.us/us";
		RequestSpecification req = RestAssured.given();
		Response respnose = req.request(Method.GET,"/90210" );
		String contentType = respnose.header("Content-Type").toString();
		String  server = respnose.header("Server").toString();
		System.out.println("Status code is: "+server);
		System.out.println("Status code is: "+contentType);
		String resBody = respnose.getBody().asString();
		System.out.println(resBody);
		}
		@Test
		public void htmlTable() {
			List<WebElement> Rows = driver.findElements(By.xpath("//div[@class='tableContainer']/div/table/tbody/tr[@data-compseason='363']"));
			int totalRows = Rows.size();
			System.out.println("Number of Rows: "+totalRows);
			String array[] = new String[totalRows];
			//int totalColumns;
			for(int i=1;i<=totalRows+1;i++) {
				List<WebElement> Coloumns = driver.findElements(By.xpath("//div[@class='tableContainer']/div/table/tbody/tr[@data-compseason='363']["+i+"]/td"));
				int totalColumns = Coloumns.size();
				//List<WebElement>  Elelist = driver.findElements(By.xpath("//div[@class='tableContainer']/div/table/tbody/tr[@data-compseason='363']["+i+"]/td["+j+"]"));
				array[i] = driver.findElement(By.xpath("//div[@class='tableContainer']/div/table/tbody/tr[@data-compseason='363']["+i+"]/td")).getText();
//				for(WebElement e: array) {
//					System.out.print(e.getText());
//					}
				for(int j=1;j<=totalColumns;j++) {
					System.out.println(array[j]);
				}
				}
				
				}
		@Test
		public void htmlTablePractice() {
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			List<WebElement> eleRowCount = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
			int rowCount = eleRowCount.size();
			List<WebElement> col = null;
//			List<WebElement> eleColumnCount = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//			int columnCount = eleColumnCount.size();
//			WebElement[][] array = new WebElement[rowCount][columnCount];
//			List<WebElement> elements;
			/*for(WebElement row: eleRowCount) {
					elements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
				}
			for(WebElement ele:elements) {
				
			}*/
			}
		}
				
		

