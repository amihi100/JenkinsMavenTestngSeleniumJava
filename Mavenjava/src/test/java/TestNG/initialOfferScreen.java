package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class initialOfferScreen {
	
	WebDriver driver;
	varClass VarClass;
	
	public void initialOfferScreen(WebDriver driver, varClass VarClass) throws InterruptedException {
//		driver = driver;
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick+ 7);
		WebDriverWait wait1 = new WebDriverWait(VarClass.driver,VarClass.waitForElement);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("body > app-root > primary-bid > div > div.bid-content > a.link-procceed")));
		System.out.println("Count of links on the page: " + VarClass.driver.findElements(By.tagName("a")).size());
		System.out.println(
				"Car number: " + VarClass.driver.findElementByXPath("//*[@id=\"carDetilas\"]/span[3]").getText());
		System.out.println("Price of first offer: " + VarClass.driver
				.findElementByXPath("//*[@id=\"primary_bid_div\"]/div[1]/div[1]/div[1]/span").getText());
		System.out.println("Start insurance date: " + VarClass.driver
				.findElementByXPath("//*[@id=\"primary_bid_div\"]/div[1]/div[2]/div[3]").getText());
		// Valid days of proposal:
		System.out.println(VarClass.driver.findElementByXPath("//*[@id=\"primary_bid_div\"]/div[1]/div[4]/span")
				.getText().toString());
		// Check covers:
		VarClass.driver.findElementByXPath("/html/body/app-root/primary-bid/div/div[1]/ul/li[1]/a").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[1]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[1]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[3]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[3]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[5]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[2]/ul/li[5]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//*[@id=\"modal-insurance-covers\"]/div[1]/div/div[1]/button/img")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// Protection / Secure level:
		VarClass.driver.findElementByXPath("//*[@id=\"primary_bid_div\"]/div[1]/ul/li[2]/a").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// Printing the secure level from Menora:
		System.out.println("Protect gear needed: "
				+ VarClass.driver.findElementByXPath("//h2[@id='shield__modal_title']").getText().toString());

		VarClass.driver.findElementByXPath("//*[@id=\"modal-shield\"]/div[1]/div/div[1]/button/img").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// Terms of condition:
		VarClass.driver.findElementByXPath("//span[@class='bid-id']//a[@class='privacy-policy']").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);

		VarClass.driver.findElementByXPath("//*[@id=\"modal-privacy-policy\"]/div[1]/div/div[1]/button/img")
				.click();

		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// Privacy policy:

		VarClass.driver
				.findElementByXPath("/html[1]/body[1]/app-root[1]/primary-bid[1]/div[1]/div[1]/div[4]/span[1]/a[2]")
				.click();

		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);

		VarClass.driver.findElementByXPath("//*[@id=\"modal-privacy-policy\"]/div[1]/div/div[1]/button/img")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);

		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		VarClass.driver.findElementByXPath("//*[@id=\"primary_bid_div\"]/div[1]/a[1]").click();


		
		
	}
	
	
}
