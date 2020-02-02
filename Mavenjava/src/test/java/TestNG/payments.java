package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class payments {
	WebDriver driver;
	varClass VarClass;
	
	public void paymentsMethod(WebDriver driver, varClass VarClass) throws InterruptedException {

		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//modal-dialog[@id='modal-isAccountOwnerNull']//li//li[1]//label[1]")));
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-isAccountOwnerNull\"]/div[1]/div/div/div[2]/div/div/p/span")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//*[@id=\"modal-shield\"]/div[1]/div/div[1]/button/img").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//label[contains(text(),'2')]").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//label[contains(text(),'3')]").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);

		WebElement element = VarClass.driver.findElement(By.xpath("//label[contains(text(),'3')]"));

		((JavascriptExecutor)

		VarClass.driver).executeScript("arguments[0].scrollIntoView()", element);
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);

		VarClass.driver.findElementByXPath("//label[contains(text(),'7')]").click();
		TimeUnit.SECONDS.sleep(10);
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);

		if (VarClass.appID) {

			VarClass.driver.findElementByXPath("//li[@class='right-option-disabled']//img[@class='img-default']")
					.click();

		} else {
//			This text contained Hebrew letters!
		}
	}

}
