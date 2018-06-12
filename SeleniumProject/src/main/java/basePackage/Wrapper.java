package basePackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wrapper {

	public void Click(WebDriver driver, WebElement element){
		int elementPresenceCounter = 0;

		if(element.isDisplayed() && element.isEnabled() && elementPresenceCounter<5){
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		}
		else{
			while(!element.isDisplayed()){
				elementPresenceCounter++;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(element.isDisplayed() && element.isEnabled() && elementPresenceCounter<5){
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
					element.click();
					break;
				}
				else
					break;
			}
		}
	}

	public void txtEnterData(WebDriver driver, WebElement element, String txtToEnter){
		int elementPresenceCounter = 0;

		if(element.isDisplayed() && element.isEnabled() && elementPresenceCounter<5){
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.sendKeys(txtToEnter);
		}
		else{
			while(!element.isDisplayed()){
				elementPresenceCounter++;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(element.isDisplayed() && element.isEnabled() && elementPresenceCounter<5){
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
					element.sendKeys(txtToEnter);
					break;
				}
				else
					break;
			}
		}
	}
}
