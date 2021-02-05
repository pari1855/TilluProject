package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollDown  extends BaseClass {
	public void scrollDown(WebElement eleToScroll) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", eleToScroll);
	}
}
