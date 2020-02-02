package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class finalQuestions {

	WebDriver driver;
	varClass VarClass;

	// Screen 3.1 genderPolicyOwner:
	public String genderPolicyOwner(String genderPolicyOwner) {
//		genderPolicyOwner = VarClass.genderPolicyOwner;
		if (genderPolicyOwner.contentEquals("male")) {
			return "//select[@id='step-1-gender-3']//option[2]";
		}
		// return female as defulat.
		return "//select[@id='step-1-gender-3']//option[3]";
	}

	// Screen 4.2 criminal record and policy refusal.
	public String criminalAndRefuse(int a) {
		// 0 no change - green path. 1 = criminal record. 2 = policy refuse.
		if (Integer.parseInt(VarClass.criminalAndRefuse) == 1) {
			return "//aw-wizard-step[7]//div[1]//ul[1]//li[1]//question-wrapper[1]//div[1]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[1]//label[1]//span[1]";
		} else
			return "//aw-wizard-step[7]//div[1]//ul[1]//li[2]//question-wrapper[1]//div[1]//div[1]//app-step-content-horizontal-options-view[1]//ul[1]//li[1]//label[1]//span[1]";
	}

	public void finalQuestionsMethod(WebDriver driver, varClass VarClass) throws InterruptedException {

		// Screen2.1: Privacy details of policy owner.
		VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("label-for-step-1-birthDate-4")));
		TimeUnit.SECONDS.sleep(1);
		VarClass.driver.findElementByXPath("//*[@id=\"step-1-firstName-0\"]").sendKeys(VarClass.insuredName);
		VarClass.driver.findElementByXPath("//*[@id=\"step-1-lastName-1\"]").sendKeys(VarClass.insuredLastName);
		VarClass.driver.findElementByXPath("//*[@id=\"step-1-personalId-2\"]").sendKeys(VarClass.insuredIdDriver);
		// Gender
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[1]/div/ul/li[4]/question-wrapper/div/div/combo-box/div/select")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath(genderPolicyOwner(VarClass.genderPolicyOwner)).click();
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[1]/div/ul/li[4]/question-wrapper/div/div/combo-box/div/select")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// birthdate:

		VarClass.driver.findElementByXPath("//input[@id='step-1-birthDate-4']").clear();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//*[@id=\"step-1-birthDate-4\"]").sendKeys(VarClass.insuredBirthDate);
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// license year:
		VarClass.driver.findElementByXPath("//*[@id=\"step-1-licenseIssueYear-5\"]")
				.sendKeys(VarClass.insuredLicenseIssueYear);
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		VarClass.driver
				.findElementByXPath(
						"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[1]/div/div/button[1]")
				.click();
		// Screen2.2: Contact details of policy owner
		VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("step-2-cityID-0"))).click();
		TimeUnit.SECONDS.sleep(1);
		// city:
		VarClass.driver.findElementByXPath("//*[@id=\"step-2-cityID-0\"]/div/div/div[2]/input")
				.sendKeys(VarClass.city);
		TimeUnit.SECONDS.sleep(1);
		VarClass.driver.findElement(By.cssSelector("div.ng-dropdown-panel-items>div>div.ng-option")).click();
		TimeUnit.SECONDS.sleep(1);
		// street:
		VarClass.driver.findElementByXPath("//*[@id=\"step-2-streetID-1\"]/div/div/div[2]/input")
				.sendKeys(VarClass.street);
		TimeUnit.SECONDS.sleep(1);
		VarClass.driver.findElement(By.cssSelector("div.ng-dropdown-panel-items.scroll-host>div>div.ng-option"))
				.click();
		// houseNumber:
		VarClass.driver.findElementByXPath("//*[@id=\"step-2-houseNumber-2\"]").sendKeys(VarClass.houseNumber);
		// Email:
		VarClass.driver.findElementByXPath("//*[@id=\"step-2-email-3\"]").sendKeys(VarClass.email);
		// Cellphone:
		VarClass.driver.findElementByXPath("//*[@id=\"step-2-cellphone-4\"]").sendKeys(VarClass.cellphone);
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		VarClass.driver
				.findElementByXPath(
						"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[2]/div/div/button[1]")
				.click();

		// Screen2.3: 3 questions for driver and policy owner.

		TimeUnit.SECONDS.sleep(1);
		VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[3]/div/ul/li[1]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]")));
		TimeUnit.SECONDS.sleep(1);
		// All No:
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[3]/div/ul/li[1]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]")
				.click();
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[3]/div/ul/li[2]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]")
				.click();
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[3]/div/ul/li[3]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]")
				.click();
		TimeUnit.SECONDS.sleep(1);
		// All YES:
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[3]/div/ul/li[1]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]")
				.click();
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[3]/div/ul/li[2]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]")
				.click();
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[3]/div/ul/li[3]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]")
				.click();
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		VarClass.driver
				.findElementByXPath(
						"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[3]/div/div/button[1]")
				.click();
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);

		// question for additional driver:
		if (VarClass.driver
				.findElementByXPath("/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[5]/div/h1")
				.isDisplayed()) {
			// Screen2.1: Privacy details of policy owner.
			VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[5]/div/h1")));
			TimeUnit.SECONDS.sleep(1);
			VarClass.driver.findElementByXPath("//*[@id=\"step-5-firstName-0\"]").sendKeys(VarClass.driver1Name);
			VarClass.driver.findElementByXPath("//*[@id=\"step-5-lastName-1\"]")
					.sendKeys(VarClass.driver1LastName);
			VarClass.driver.findElementByXPath("//*[@id=\"step-5-personalId-2\"]").sendKeys(VarClass.driver1Id);
			// birthdate:

			VarClass.driver.findElementByXPath("//*[@id=\"step-5-birthDate-3\"]").clear();
			TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
			VarClass.driver.findElementByXPath("//*[@id=\"step-5-birthDate-3\"]").sendKeys(VarClass.driver1BirthDate);
			TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
			// license year:
			VarClass.driver.findElementByXPath("//*[@id=\"step-5-licenseIssueYear-4\"]")
					.sendKeys(VarClass.driver1LicenseIssueYear);
			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
			VarClass.driver
					.findElementByXPath(
							"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[5]/div/div/button[1]")
					.click();

			// End if additional driver1.
		}

		// question for additional 2second driver:
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		if (Integer.parseInt(VarClass.numberOfDrivers) == 3) {
			VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[6]/div/h1")));
			TimeUnit.SECONDS.sleep(2);
			// Screen2.1: Privacy details of policy owner.

			VarClass.driver.findElementByXPath("//*[@id=\"step-10-firstName-0\"]").sendKeys(VarClass.driver2Name);
			VarClass.driver.findElementByXPath("//*[@id=\"step-10-lastName-1\"]")
					.sendKeys(VarClass.driver2LastName);
			VarClass.driver.findElementByXPath("//*[@id=\"step-10-personalId-2\"]").sendKeys(VarClass.driver2Id);
			// birthdate:
			VarClass.driver.findElementByXPath("//*[@id=\"step-10-birthDate-3\"]").clear();
			TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
			VarClass.driver.findElementByXPath("//*[@id=\"step-10-birthDate-3\"]").sendKeys(VarClass.driver2BirthDate);
			TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
			// license year:
			VarClass.driver.findElementByXPath("//*[@id=\"step-10-licenseIssueYear-4\"]")
					.sendKeys(VarClass.driver2LicenseIssueYear);
			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
			VarClass.driver
					.findElementByXPath(
							"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[6]/div/div/button[1]")
					.click();
			// End if additional driver2.
			// }
		}

		// Screen2.4: questions for criminal record and policy refuse.
		VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[7]/div/ul/li[1]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]")));
		TimeUnit.SECONDS.sleep(1);
		// All YES:
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[7]/div/ul/li[1]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]")
				.click();
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[7]/div/ul/li[2]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]")
				.click();
		TimeUnit.SECONDS.sleep(1);
		// All NO:
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[7]/div/ul/li[1]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]")
				.click();
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[7]/div/ul/li[2]/question-wrapper/div/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]")
				.click();
		// Value for red path Scenario:
		try {

			if (Integer.parseInt(VarClass.numberOfDrivers) == 1 || Integer.parseInt(VarClass.numberOfDrivers) == 2) {
				TimeUnit.SECONDS.sleep(1);
				VarClass.driver.findElementByXPath(criminalAndRefuse(Integer.parseInt(VarClass.numberOfDrivers)))
						.click();
				System.out.println("Red path of final offer!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No red path of final offer");
		}

		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		VarClass.driver
				.findElementByXPath(
						"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[7]/div/div/button[1]")
				.click();
		// Screen2.5: Agreements sign V.
		VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chk-step9-q2-lbl")));
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// click V:
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[8]/div/ul/li[3]/question-wrapper/div/div/single-checkbox/label")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// open privacy policy:
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[8]/div/ul/li[1]/question-wrapper/div/div/plain-text/p/span")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//*[@id=\"modal-general-ext\"]/div[1]/div/div[2]/p/span").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		// close privacy policy second screen.
		VarClass.driver.findElementByXPath("//*[@id=\"modal-privacy-policy\"]/div[1]/div/div[1]/button/img").click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath(
				"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[8]/div/ul/li[2]/question-wrapper/div/div/plain-text/p/span")
				.click();
		TimeUnit.MILLISECONDS.sleep(VarClass.MILLISECONDS);
		VarClass.driver.findElementByXPath("//*[@id=\"modal-general-ext\"]/div[1]/div/div[1]/button/img").click();
		TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
		VarClass.driver
				.findElementByXPath(
						"/html/body/app-root/external-app-offer/aw-wizard/div/aw-wizard-step[8]/div/div/button[1]")
				.click();

	}

}
