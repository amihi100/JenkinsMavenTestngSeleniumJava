package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ThankYou {
	WebDriver driver;
	VarClass varClass;

	public void thankYou(WebDriver driver, VarClass varClass) throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		String URL = varClass.driver.getCurrentUrl();
		if (URL == varClass.thankYouURL || varClass.wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("/html/body/app-root/thank-you-page/div/h1")))
				.isDisplayed()) {
			System.out.println("You reached to THANK YOU page!!!");
		}
	}
}