package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utility.BaseClass;

public class TC_Login extends BaseClass{
@BeforeMethod
public void setUp() throws Exception {
	driverInitialization();
}
@Test
public void LaunchDemo() {
 driver.get("http://admin.cpbids.com/admin_login");
 String title = driver.getTitle();
 System.out.println("Title of page"+ title);
}
@Test
public void Login() {
	LoginPage cpLogin = new LoginPage();
	cpLogin.userName("admin", "&E.zFR=VDpyK");
} 
}
