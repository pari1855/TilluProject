package StackOverflow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class Question01112021 extends BaseClass {	
	@BeforeTest
	public void DRiverInitialization() throws Exception {
		driverInitialization();
	}
	
	@Test
	public void StackQuestion() {
		
		List<WebElement> options = new Select(driver.findElement(By.xpath("//select[@id='id_contact']"))).getOptions();
		for(WebElement e: options) {
			System.out.println(e.getText());
		}
		Set<String> optionNames = new HashSet<String>(options.size());
		for(WebElement element: options) {
			if(optionNames.add(element.getText())==false) {
				System.out.println("Duplicate option:" +element);
			}
			else {
				System.out.println("No duplicate options found");
			}
		}
	    
	   /*
	    * Select s = new Select(driver.findElement(
                By.xpath("//Select[@id='unmappedTech']")));
        List<WebElement> list = s.getOptions();
        Set<String> listNames = new HashSet<String>(list.size());
        for (WebElement element : list) {
           //Set will not allow to add duplicate value
            if(listNames.add(element.getText())==false){
                System.out.println("Duplicate value is: "+element);
            }
        }
		*/
				
	}

}
