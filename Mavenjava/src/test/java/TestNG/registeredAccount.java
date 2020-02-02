package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class registeredAccount {

	WebDriver driver;
	varClass VarClass;

	public void registeredAccountMethod(WebDriver driver, varClass VarClass) throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);

		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		if (VarClass.appID) {
			VarClass.driver.get(VarClass.environmentURL);
		}
		if (VarClass.driver.findElementByXPath("/html/body/app-root/registered-account/div/div[1]/div/img")
				.isDisplayed()
				|| VarClass.driver
						.findElementByXPath("/html/body/app-root/registered-account/div/div[2]/ul/li[1]/a/img")
						.isDisplayed()) {
			System.out.println("You reached to Registered Account page!!!");

		}

	}
}