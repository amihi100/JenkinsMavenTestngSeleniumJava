package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitialOfferScreen {

	WebDriver driver;
	VarClass varClass;

	public void initialOfferScreen(WebDriver driver, VarClass varClass) throws InterruptedException {
//		driver = driver;
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 7);
		WebDriverWait wait1 = new WebDriverWait(varClass.driver, varClass.waitForElement);
		wait1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='insurance-benefits']//span")));
		System.out.println(
				"Number of links counted on the page - SPA: " + varClass.driver.findElements(By.tagName("a")).size());
		System.out.println("Car number: " + varClass.driver.findElementByClassName("car-type").getText());
		System.out.println(
				"Price of first offer: " + varClass.driver.findElementByClassName("insurance-price").getText());
		System.out
				.println("Start insurance date: " + varClass.driver.findElementByClassName("insurance-date").getText());
		//Print valid days of proposal:
		System.out.println(varClass.driver.findElementByClassName("bid-extra-details").getText().toString());
		//Click on i for information of sale details.
		varClass.driver.findElementByClassName("iocn-info").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//modal-dialog[@id='modal-insurance-takanon']//img").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		// Check covers:
		//click to Show() content.
		varClass.driver.findElementByXPath("//button[@class='collapse__triger collapse__triger--btn']").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		//Print main covers included:
				System.out.println(varClass.driver.findElementByClassName("insurance-covers--content").getText().toString());
		//Click to open covers modal:
		varClass.driver.findElementByClassName("link-cover-details").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[1]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[1]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[3]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[3]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[5]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[5]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[1]/button/img").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		// Protection / Secure level:
		varClass.driver.findElementByXPath("//ul[@class='list-insurance-links']//li[1]").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		// Printing the secure level from Menora:
		System.out.println("Protect gear needed: "
				+ varClass.driver.findElementByXPath("//h2[@id='shield__modal_title']").getText().toString());
		varClass.driver.findElementByXPath("//*[@id=\"modal-shield\"]/div[1]/div/div[1]/button/img").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		// Terms of condition:
		varClass.driver.findElementByXPath("//div[contains(text(),'-7')]").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//modal-dialog[@id='modal-terms-of-service']//button[@class='btn-modal-close']").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		// Privacy policy:
		varClass.driver
				.findElementByXPath("//div[@class='bid-id']//a[@class='privacy-policy']")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver.findElementByXPath("//*[@id=\"modal-privacy-policy\"]/div[1]/div/div[1]/button/img").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath("//a[@class='link-procceed']").click();
	}
}
