package basePackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WebSiteOperations {
	public static WebDriver driver= null;
	public static LogInPageFunctions logInPage = null;
	public static BaseFunctions baseFunction = null;
	
	@BeforeTest
	public static void Precondition(){
		baseFunction = new BaseFunctions();
		driver = baseFunction.instantiation("Chrome");
		driver.get("http://demo.nopcommerce.com/");		
		logInPage = new LogInPageFunctions();		
	}
	
	@Test
	public static void MainCondition(){
		logInPage.LogIn(driver);
		logInPage.LogOut(driver);		
	}
	
	@AfterTest
	public static void PostCondition(){
		baseFunction.closeBrowser(driver);
	}

}
