package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class covers {

	WebDriver driver;
	varClass VarClass;
	public void coversMethod(WebDriver driver, varClass VarClass) throws InterruptedException {
		
		// Screen: Covers.
					VarClass.wait
							.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]//div[2]//div[1]//img[1]")));

					TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);

					VarClass.driver.findElementById("chk-step1-q0-idx0").click();

					VarClass.driver.findElementById("chk-step1-q0-idx1").click();

					VarClass.driver.findElementById("chk-step1-q0-idx2").click();

					System.out.println("Covers included:");
					System.out.println("-------------------------");
					System.out.println(VarClass.driver
							.findElementByXPath("//div[@class='flex-container']//div[1]//div[2]//div[1]//span[1]").getText());
					System.out.println("-------------------------");
					System.out.println(VarClass.driver
							.findElementByXPath(" //div[@class='wizard-step-wrapper']//div[2]//div[2]//div[1]//span[1]")
							.getText());
					System.out.println("-------------------------");
					System.out.println(VarClass.driver.findElementByXPath("//div[3]//div[2]//div[1]//span[1]").getText());
					System.out.println("-------------------------");

					TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
					VarClass.driver.findElementByXPath(
							"/html/body/app-root/offer-payment/aw-wizard/div/aw-wizard-step[1]/div/div[2]/div/button[1]")
							.click();
	}
	
	

}
