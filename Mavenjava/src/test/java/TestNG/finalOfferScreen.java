package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class finalOfferScreen {
	
	WebDriver driver;
	varClass VarClass; 
	public void finalOfferScreenMethod(WebDriver driver, varClass VarClass) throws InterruptedException {

		// Screen: Final offer!
		VarClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/app-root/final-bid/div/div[1]/a[2]")));
		// Need to wait 3 seconds for element.
		TimeUnit.SECONDS.sleep(3);
		// Popup details of 6 months free parking benefit.
		VarClass.driver.findElementByXPath("//span[@class='iocn-info']//img").click();
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
		VarClass.driver.findElementByXPath("//modal-dialog[@id='modal-insurance-takanon']//img").click();
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		// Requred covers:
		VarClass.driver.findElementByXPath("//div[@class='insurance-covers']//a").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[1]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[1]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[3]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[3]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[5]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver
				.findElementByXPath("//*[@id=\"modal-insurance-covers-2\"]/div[1]/div/div[2]/ul/li[5]/panel/div/a")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// Close covers:
		VarClass.driver.findElementByXPath(
				"//modal-dialog[@id='modal-insurance-covers-2']//div[@class='modal-header']//img").click();
		// Takanon sale:
//		VarClass.driver.findElementByXPath("/html/body/app-root/final-bid/div/div[1]/div[6]/a[2]").click();
//		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
//		VarClass.driver.findElementByXPath("//*[@id=\"modal-insurance-takanon\"]/div[1]/div/div[1]/button/img")
//				.click();
//		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);

		System.out.println(VarClass.driver.findElementByXPath("//span[@class='bid-id']").getText().toString());

		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		VarClass.driver.findElementByXPath("//a[@class='link-procceed']").click();

	}
	

}
