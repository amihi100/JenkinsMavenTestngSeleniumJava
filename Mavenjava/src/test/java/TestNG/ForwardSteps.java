package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForwardSteps {
	WebDriver driver;
	VarClass varClass;
	
	public void forwardSteps(WebDriver driver, VarClass varClass) throws InterruptedException {
		

		// in chrome desktop from some reason the datepicker opened when returning back.
		// Fix by click.
		// Click in first screen to close picker.
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath("//button[@class='btn-next orange-circle']").click();

		// move to screen2
//		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
//		varClass.driver.findElementByXPath("//aw-wizard-step[1]//button[1]").click();
		// move to screen3
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[2]//button[1]").click();
		// move to screen4
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[3]//button[2]").click();
		// move to screen5
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver
				.findElementByXPath(
						"/html[1]/body[1]/app-root[1]/app-offer[1]/aw-wizard[1]/div[1]/aw-wizard-step[4]/button[1]")
				.click();
		// move to screen6
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[5]//button[1]").click();
		// move to screen7
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[6]//button[1]").click();
		// move to screen8
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[7]//button[1]").click();
		// move to screen9
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[8]//button[1]").click();
		// move to firstOfferScreen
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[9]//button[1]").click();
		// TODO function check if phone number == wizardPhone0
		TimeUnit.SECONDS.sleep(10);
		// move to screen2.1
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//a[@class='link-procceed']").click();
		// move to screen2.2, screen privacy details of policy owner:
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[1]//div[1]//div[1]//button[1]").click();
		// screen contact details of policy owner:
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[2]//div[1]//div[1]//button[1]").click();

		// screen 3 yes \ no questions:
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//aw-wizard-step[3]//div[1]//div[1]//button[1]").click();

		// 3dirvers mode: WORKING GOOD!
		if (Integer.parseInt(varClass.numberOfDrivers) == 3) {

			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
			varClass.driver.findElementByXPath("//aw-wizard-step[5]//div[1]//div[1]//button[1]").click();

			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
			varClass.driver.findElementByXPath("//aw-wizard-step[6]//div[1]//div[1]//button[1]").click();
		}
		// 9dirvers mode: WORKING GOOD (NO CHANGES NEEDED!)
		// 1dirvers mode: WORKING GOOD (NO CHANGES NEEDED!)

		// 2 drivers mode:
		else if (Integer.parseInt(varClass.numberOfDrivers) == 2) {
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
			// screen2.4 details of extra driver:
			varClass.driver.findElementByXPath("//aw-wizard-step[5]//div[1]//div[1]//button[1]").click();

		}

		// screen 2.4 2 questions:
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath("//aw-wizard-step[7]//div[1]//div[1]//button[1]").click();

		// /html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[7]/div/div/button[1]
		// screen2.5 (Approve V)
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver
				.findElementByXPath(
						"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[8]/div/div/button[1]")
				.click();
		TimeUnit.SECONDS.sleep(10);

		// finalOfferScreen:
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 2);
		varClass.driver.findElementByXPath("//a[@class='link-procceed']").click();

		// coversScreen:
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath("//button[@class='btn-blue']").click();

		// payments screen (scroll down to see 7 payments).
		WebElement element = varClass.driver.findElement(By.xpath("//label[contains(text(),'3')]"));
		((JavascriptExecutor) varClass.driver).executeScript("arguments[0].scrollIntoView()", element);
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);

		
	}
	

}
