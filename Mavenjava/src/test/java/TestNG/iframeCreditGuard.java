package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class iframeCreditGuard {
	WebDriver driver;
	varClass VarClass;

	public void iframeCreditGuardMethod(WebDriver driver, varClass VarClass) throws InterruptedException {

		// Screen: CreditGuard
		TimeUnit.SECONDS.sleep(10);
		// handke with iframe

		// handle with popups alerts
		// Print the alert first:
		// System.out.println(VarClass.driver.switchTo().alert().getText());
		// VarClass.driver.switchTo().accept(); // Accept = ok done yes.
		// VarClass.driver.switchTo().dismiss(); // Dont accept.
		if (VarClass.appID) {
			VarClass.driver.switchTo().frame(0);
			VarClass.driver.findElementByXPath("//*[@id=\"mat-input-0\"]").sendKeys(VarClass.cardFullName);
			TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
			VarClass.driver.findElementByXPath("//*[@id=\"mat-checkbox-1\"]/label/div").click();
			TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
			VarClass.driver.findElementByXPath("//*[@id=\"content\"]/form/button/span").click();

		} else {
			VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[@class='account']//button[@class='btn-blue'][contains(text(),'המשך')]")));
			TimeUnit.SECONDS.sleep(1);
			VarClass.driver
					.findElementByXPath("//div[@class='account']//button[@class='btn-blue'][contains(text(),'המשך')]")
					.click();

			VarClass.driver.findElementByXPath("//*[@id=\"cardNumber\"]").sendKeys(VarClass.cardNumber);
			VarClass.driver.findElementByXPath("//*[@id=\"personalId\"]").sendKeys(VarClass.cardPersonalId);
			VarClass.driver.findElementByXPath("//*[@id=\"fullName\"]").sendKeys(VarClass.cardFullName);
			TimeUnit.SECONDS.sleep(1);
			// driver.switchTo().defaultContent();
			Select dropdownYear = new Select(VarClass.driver.findElement(By.id("expYear")));
			dropdownYear.selectByVisibleText(VarClass.cardYear);
			TimeUnit.SECONDS.sleep(1);
			Select dropdownMonth = new Select(VarClass.driver.findElement(By.id("expMonth")));
			TimeUnit.SECONDS.sleep(1);
			dropdownMonth.selectByVisibleText(VarClass.cardMonth);
			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
			VarClass.driver.findElementByXPath("//*[@id=\"submitBtn\"]").click();

		}

	}
}
