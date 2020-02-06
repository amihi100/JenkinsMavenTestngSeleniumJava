package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Payments {
	WebDriver driver;
	VarClass varClass;
	
	public void payments(WebDriver driver, VarClass varClass) throws Exception {
		try {
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
			varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//modal-dialog[@id='modal-isAccountOwnerNull']//li//li[1]//label[1]")));
			varClass.driver
					.findElementByXPath("//*[@id=\"modal-isAccountOwnerNull\"]/div[1]/div/div/div[2]/div/div/p/span")
					.click();
			TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
			varClass.driver.findElementByXPath("//*[@id=\"modal-shield\"]/div[1]/div/div[1]/button/img").click();
			TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
			varClass.driver.findElementByXPath("//label[contains(text(),'2')]").click();
			TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
			varClass.driver.findElementByXPath("//label[contains(text(),'3')]").click();
			TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
			WebElement element = varClass.driver.findElement(By.xpath("//label[contains(text(),'3')]"));
			((JavascriptExecutor)
			varClass.driver).executeScript("arguments[0].scrollIntoView()", element);
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
			varClass.driver.findElementByXPath("//label[contains(text(),'7')]").click();
			TimeUnit.SECONDS.sleep(10);
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
			if (varClass.appID) {
				varClass.driver.findElementByXPath("//li[@class='right-option-disabled']//img[@class='img-default']")
						.click();
			}
		}catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Failed in payments screen!");
		}
		
	}
}
