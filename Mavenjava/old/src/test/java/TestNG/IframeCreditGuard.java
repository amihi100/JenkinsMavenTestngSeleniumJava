package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class IframeCreditGuard {
	WebDriver driver;
	VarClass varClass;

	public void iframeCreditGuard(WebDriver driver, VarClass varClass) throws InterruptedException {

		// Screen: CreditGuard
		TimeUnit.SECONDS.sleep(10);
		// handshake with iframe
		// handle with popups alerts
		// Print the alert first:
		// System.out.println(varClass.driver.switchTo().alert().getText());
		// varClass.driver.switchTo().accept(); // Accept = ok done yes.
		// varClass.driver.switchTo().dismiss(); // Dont accept.
		if (varClass.appID) {
			varClass.driver.switchTo().frame(0);
			varClass.driver.findElementByXPath("//*[@id=\"mat-input-0\"]").sendKeys(varClass.cardFullName);
			TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
			varClass.driver.findElementByXPath("//*[@id=\"mat-checkbox-1\"]/label/div").click();
			TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
			varClass.driver.findElementByXPath("//*[@id=\"content\"]/form/button/span").click();
		} else {
			varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[@class='account']//button[@class='btn-blue'][contains(text(),'המשך')]")));
			TimeUnit.SECONDS.sleep(1);
			varClass.driver
					.findElementByXPath("//div[@class='account']//button[@class='btn-blue'][contains(text(),'המשך')]")
					.click();
			varClass.driver.findElementByXPath("//*[@id=\"cardNumber\"]").sendKeys(varClass.cardNumber);
			varClass.driver.findElementByXPath("//*[@id=\"personalId\"]").sendKeys(varClass.cardPersonalId);
			varClass.driver.findElementByXPath("//*[@id=\"fullName\"]").sendKeys(varClass.cardFullName);
			TimeUnit.SECONDS.sleep(1);
			// driver.switchTo().defaultContent();
			Select dropdownYear = new Select(varClass.driver.findElement(By.id("expYear")));
			dropdownYear.selectByVisibleText(varClass.cardYear);
			TimeUnit.SECONDS.sleep(1);
			Select dropdownMonth = new Select(varClass.driver.findElement(By.id("expMonth")));
			TimeUnit.SECONDS.sleep(1);
			dropdownMonth.selectByVisibleText(varClass.cardMonth);
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
			varClass.driver.findElementByXPath("//*[@id=\"submitBtn\"]").click();
		}
	}
}