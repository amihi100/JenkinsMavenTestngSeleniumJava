package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class RegisteredAccount {

	WebDriver driver;
	VarClass varClass;

	public void registeredAccount(WebDriver driver, VarClass varClass) throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);

		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		if (varClass.appID) {
			varClass.driver.get(varClass.environmentURL);
		}
		if (varClass.driver.findElementByXPath("/html/body/app-root/registered-account/div/div[1]/div/img")
				.isDisplayed()
				|| varClass.driver
						.findElementByXPath("/html/body/app-root/registered-account/div/div[2]/ul/li[1]/a/img")
						.isDisplayed()) {
			System.out.println("You reached to Registered Account page!!!");

		}

	}
}