package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunctions {

	public BaseFunctions(){
		
	}
	
	public WebDriver instantiation(String browserName){
		WebDriver driver = null;
		switch (browserName){
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\MyFolder\\Ravi Data\\Learning\\Technical\\Test Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
		}
		return driver;
	}
	
	public void closeBrowser(WebDriver driver){
		driver.quit();
	}
}
