package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CallMeWizard {

	
	WebDriver driver;
	VarClass varClass;
	
	
	public void callMeWizard(WebDriver driver, VarClass varClass) throws InterruptedException {
		this.driver = driver;
	
		TimeUnit.SECONDS.sleep(7);
		// Call me back function.
		varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bid-footer")));
		varClass.driver.findElementByXPath("/html/body/app-root/primary-bid/div/div[2]/ul/li[1]/a/img").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		// if running with REAL APP ID:
		if (varClass.appID) {
			System.out.println(varClass.appID);
			boolean appPhoneNumber = varClass.driver
					.findElementByXPath("//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/a").isDisplayed();
			if (appPhoneNumber) {
				varClass.driver.findElementByXPath("//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/a").click();
				System.out.println("appPhoneNumber is true");
			}
			TimeUnit.SECONDS.sleep(1);
			varClass.driver.findElementByXPath("//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/input").clear();
			// TimeUnit.SECONDS.sleep(1);
			varClass.driver.findElementByXPath("//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/a").click();
			TimeUnit.SECONDS.sleep(1);
		}
		// END
		varClass.driver.findElementByXPath("//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/input")
				.sendKeys(varClass.wizardPhone0);
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/button")));
		varClass.driver
				.findElementByCssSelector("#modal-call-back > div.modal-dialog > div > div.modal-body > p > button")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/button").click();
		// Need to wait 1500 miliSec for popup click/
		TimeUnit.MILLISECONDS.sleep(1500);
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath("//*[@id=\"modal-call-back-success\"]/div[1]/div/div[1]/button/img")
				.click();
		
		
		
		
		
	}
	
	
	
}
