package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageFunctions {
	private Wrapper objWrapper = null;
	
	public LogInPageFunctions(){
		objWrapper = new Wrapper();
	}

	public void LogIn(WebDriver driver){
		String userName = "ravs788@gmail.com";
		String passWord = "Coolz@788";		
		
		By locatorlnkLogIn = By.xpath("//a[text()='Log in']");
		By locatorUserName = By.xpath("//input[@name='Email']");
		By locatorPassword = By.xpath("//input[@name='Password']");
		By locatorbtnLogIn = By.xpath("//input[@value='Log in']");
		
		// Click on Login Link
		WebElement lnkLogin = driver.findElement(locatorlnkLogIn);
		objWrapper.Click(driver, lnkLogin);
		
		WebElement txtUserName = driver.findElement(locatorUserName);
		WebElement txtPassword = driver.findElement(locatorPassword);
		WebElement btnLogin = driver.findElement(locatorbtnLogIn);
		
		objWrapper.txtEnterData(driver, txtUserName, userName);
		objWrapper.txtEnterData(driver, txtPassword, passWord);
		objWrapper.Click(driver, btnLogin);
	}
	
	public void LogOut(WebDriver driver){
		By locatorlnkLogOut = By.xpath("//a[text()='Log out']");
		WebElement lnkLogout = driver.findElement(locatorlnkLogOut);
		objWrapper.Click(driver, lnkLogout);
	}
}
