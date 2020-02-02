package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class thankYouPage {
	WebDriver driver;
	varClass VarClass;

	public void thankYouPageMethod(WebDriver driver, varClass VarClass) throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		String URL = VarClass.driver.getCurrentUrl();
		if (URL == VarClass.thankYouURL || VarClass.wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("/html/body/app-root/thank-you-page/div/h1")))
				.isDisplayed()) {
			System.out.println("You reached to THANK YOU page!!!");

		}

	}
}