package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CallMeWizard {

	WebDriver driver;
	VarClass varClass;
	///// Variables of call me wizard: //////
	String a = "/html/body/app-root/primary-bid/div/div[2]/ul/li[1]/a/img";
	String b = "//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/a";
	String c = "//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/a";
	String d = "//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/input";
	String e = "//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/a";
	String f = "//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/input";
	String g = "//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/button";
	String h = "#modal-call-back > div.modal-dialog > div > div.modal-body > p > button";
	String i = "//*[@id=\"modal-call-back\"]/div[1]/div/div[2]/p/button";
	String j = "//*[@id=\"modal-call-back-success\"]/div[1]/div/div[1]/button/img";

	public void callMeWizard(WebDriver driver, VarClass varClass) throws InterruptedException {
		this.driver = driver;

		TimeUnit.SECONDS.sleep(7);
		// Call me back function.
		varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bid-footer")));
		varClass.driver.findElementByXPath(a).click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		// if running with REAL APP ID:
		if (varClass.appID) {
			System.out.println(varClass.appID);
			boolean appPhoneNumber = varClass.driver.findElementByXPath(b).isDisplayed();
			if (appPhoneNumber) {
				varClass.driver.findElementByXPath(c).click();
				System.out.println("appPhoneNumber is true");
			}
			TimeUnit.SECONDS.sleep(1);
			varClass.driver.findElementByXPath(d).clear();
			// TimeUnit.SECONDS.sleep(1);
			varClass.driver.findElementByXPath(e).click();
			TimeUnit.SECONDS.sleep(1);
		}
		// END
		varClass.driver.findElementByXPath(f).sendKeys(varClass.wizardPhone0);
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(g)));
		varClass.driver.findElementByCssSelector(h).click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath(i).click();
		// Need to wait 1500 miliSec for popup click/
		TimeUnit.MILLISECONDS.sleep(1500);
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath(j).click();

	}

}
