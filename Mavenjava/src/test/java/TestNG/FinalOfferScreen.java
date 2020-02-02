package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FinalOfferScreen {
	
	WebDriver driver;
	VarClass varClass; 
	public void finalOfferScreen(WebDriver driver, VarClass varClass) throws InterruptedException {

		// Screen: Final offer!
		varClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/app-root/final-bid/div/div[1]/a[2]")));
		// Need to wait 3 seconds for element.
		TimeUnit.SECONDS.sleep(3);
		// Popup details of 6 months free parking benefit.
		varClass.driver.findElementByXPath("//span[@class='iocn-info']//img").click();
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//modal-dialog[@id='modal-insurance-takanon']//img").click();
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		// Requred covers:
		varClass.driver.findElementByXPath("//div[@class='insurance-covers']//a").click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[1]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[1]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[3]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[3]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[5]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		varClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[5]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
		// Close covers:
		varClass.driver.findElementByXPath(
				"//modal-dialog[@id='modal-insurance-covers-2']//div[@class='modal-header']//img").click();
		// Takanon sale:
//		varClass.driver.findElementByXPath("/html/body/app-root/final-bid/div/div[1]/div[6]/a[2]").click();
//		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
//		varClass.driver.findElementByXPath("//*[@id=\"modal-insurance-takanon\"]/div[1]/div/div[1]/button/img")
//				.click();
//		TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);

		System.out.println(varClass.driver.findElementByXPath("//span[@class='bid-id']").getText().toString());

		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath("//a[@class='link-procceed']").click();

	}
	

}
