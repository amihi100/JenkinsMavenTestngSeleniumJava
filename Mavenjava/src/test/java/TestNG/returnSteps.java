package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class returnSteps {
	WebDriver driver;
	varClass VarClass;
	
	
	public void returnStepsMethod(WebDriver driver, varClass VarClass) throws InterruptedException {
		

		// return from payments to covers:
		VarClass.driver.findElementByXPath("//div[@class='account']//button[@class='btn-empty']").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS + 1);
		// return from covers to final proposal:
		VarClass.driver.findElementByXPath(
				"/html[1]/body[1]/app-root[1]/offer-payment[1]/aw-wizard[1]/div[1]/aw-wizard-step[1]/div[1]/div[2]/div[1]/button[2]")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// return from final proposal to terms and conditions screen:
		VarClass.driver.findElementByXPath("//a[@class='link-back']").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// return from terms and conditions to criminal record and refusal questions:
		VarClass.driver.findElementByXPath("//aw-wizard-step[8]//div[1]//div[1]//button[2]").click();
		// return from criminal record and refusal to 3 questions screen:
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//aw-wizard-step[7]//div[1]//div[1]//button[2]").click();
		// 3 drivers return steps:
		if (Integer.parseInt(VarClass.numberOfDrivers) == 3) {
			TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
			VarClass.driver.findElementByXPath("//aw-wizard-step[6]//div[1]//div[1]//button[2]").click();
			TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
			VarClass.driver.findElementByXPath("//aw-wizard-step[5]//div[1]//div[1]//button[2]").click();
		}
		// 2 drivers return steps:
		if (Integer.parseInt(VarClass.numberOfDrivers) == 2) {
			TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
			VarClass.driver.findElementByXPath("//aw-wizard-step[5]//div[1]//div[1]//button[2]").click();
		}
		// 1 or unlimited drivers return steps:
		// return from 3 questions screen to policy contact details:
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//aw-wizard-step[3]//div[1]//div[1]//button[2]").click();
		// return from policy contact details to policy owner details:
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//aw-wizard-step[2]//div[1]//div[1]//button[2]").click();
		// return from policy owner details to first offer screen:
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//aw-wizard-step[1]//div[1]//div[1]//button[2]").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//a[@class='link-back']").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);

		// return back in first offer:
		// screen 9
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
		WebElement element = VarClass.driver.findElement(By.xpath(
				"//aw-wizard-step[9]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[1]//label[1]//span[1]"));
		WebElement target = VarClass.driver.findElement(By.xpath(
				"//aw-wizard-step[9]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[2]//label[1]//span[1]"));
		(new Actions(VarClass.driver)).dragAndDrop(element, target).perform();
		// screen8
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
		JavascriptExecutor jse = (JavascriptExecutor) VarClass.driver;
		jse.executeScript("document.getElementById('step-0-q7.1-radio-2').focus();");

		JavascriptExecutor js = (JavascriptExecutor) VarClass.driver;
		js.executeScript("$('#media-only').trigger('swipe', {startX: 0.95})");

		VarClass.driver
				.findElementByXPath(
						"/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[8]/div/app-step-header/h1")
				.click();

		VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("step-0-q7.1-radio-2")));
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);

		WebElement element12 = VarClass.driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-offer[1]/aw-wizard[1]/div[1]/aw-wizard-step[8]/div[1]/app-step-content-vertical-options-view[1]/ul[1]/li[2]/label[1]"));
		WebElement target12 = VarClass.driver.findElement(By.className("accessibility-menu"));
		Thread.sleep(250);
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
		(new Actions(VarClass.driver)).dragAndDrop(element12, target12).perform();

		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);

		// screen7
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
		element = VarClass.driver.findElement(By.xpath(
				"//aw-wizard-step[7]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[1]//label[1]//span[1]"));
		target = VarClass.driver.findElement(By.xpath(
				"//aw-wizard-step[7]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[2]//label[1]//span[1]"));
		(new Actions(VarClass.driver)).dragAndDrop(element, target).perform();
		// screen6
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
		element = VarClass.driver.findElement(By.xpath(
				"//aw-wizard-step[6]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[1]//label[1]//span[1]"));
		target = VarClass.driver.findElement(By.xpath(
				"//aw-wizard-step[6]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[2]//label[1]//span[1]"));
		(new Actions(VarClass.driver)).dragAndDrop(element, target).perform();
		// screen5
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
		element = VarClass.driver.findElement(By.xpath(
				"//aw-wizard-step[5]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[1]//label[1]//span[1]"));
		target = VarClass.driver.findElement(By.xpath(
				"//aw-wizard-step[5]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[2]//label[1]//span[1]"));
		(new Actions(VarClass.driver)).dragAndDrop(element, target).perform();
		// screen4
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);

		element = VarClass.driver.findElement(By.xpath(
				"/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[4]/div/app-step-content-vertical-options-view/ul/li[5]/label"));
		target = VarClass.driver.findElement(By.className("accessibility-menu"));
		(new Actions(VarClass.driver)).dragAndDrop(element, target).perform();

		// screen3
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
		element = VarClass.driver.findElement(By.xpath("//aw-wizard-step[3]//button[2]"));
		target = VarClass.driver.findElement(By.xpath("//button[@class='btn-toggle-accessibility-menu']//img"));
		(new Actions(VarClass.driver)).dragAndDrop(element, target).perform();

		// screen2
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
		element = VarClass.driver.findElement(By.xpath(
				"/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[2]/div/app-step-content-vertical-options-view/ul/li[4]/label"));
		target = VarClass.driver.findElement(By.xpath("//button[@class='btn-toggle-accessibility-menu']//img"));
		(new Actions(VarClass.driver)).dragAndDrop(element, target).perform();
		
	}
	

}
