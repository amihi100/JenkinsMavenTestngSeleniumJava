package TestNG;

import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitialQuestions {

	WebDriver driver;
	VarClass varClass;
	///// Variables screen 1.1: insurance start date://////
	String open_calander = "//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']";
	String select_today = ".mat-calendar-body-cell-content.mat-calendar-body-today";
	String next_one = "//button[@class='btn-next orange-circle']";
	///// Variables screen 1.2: how many drivers://////
	String one_driver = "//aw-wizard-step[2]//div[1]//app-step-content-vertical-options-view[1]//ul[1]//li[1]//label[1]";
	String two_drivers = "//aw-wizard-step[@class='aw-wizard-step']//label[contains(text(),'2')]";
	String three_drivers = "//label[contains(text(),'3')]";
	String all_drivers = "//aw-wizard-step[@class='aw-wizard-step']//li[4]//label[1]";
	///// Variables screen 1.3: youngest driver://////
	String label_youngest_driver = "label-for-youngest-driver-age";
	String value_youngest_driver = "youngest-driver-age";
	String next_three = "//aw-wizard-step[3]//*[contains(@class,'orange')]";
	///// Variables screen 1.4: driving_history://////
	String zero_driving_history = "//aw-wizard-step[@class='aw-wizard-step step-youngest-driver-experience']//li[1]//label[1]";
	String one_driving_history = "//aw-wizard-step[@class='aw-wizard-step step-youngest-driver-experience']//li[2]//label[1]";
	String two_driving_history = "//label[contains(text(),'2-9')]";
	String ten_driving_history = "//label[contains(text(),'10-15')]";
	String sixten_driving_history = "//label[contains(text(),'16+')]";
	///// Variable screen 1.5 mortgage car://////
	String false_mortgageCar = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[5]/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]";
	String true_mortgageCar = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[5]/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]";
	///// Variable screen 1.6 years of insurance://////
	String false_yearsOfInsurance = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[6]/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]";
	String true_yearsOfInsurance ="/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[6]/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]";
	///// Variable screen 1.7 claims in 3 years://////
	String false_claimsIn3Years = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[6]/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]";
	String true_claimsIn3Years = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[7]/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]";
	///// Variable screen 1.8 how many claims://////
	String zero_claims = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[8]/div/app-step-content-vertical-options-view/ul/li[1]/label";
	String one_claim = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[8]/div/app-step-content-vertical-options-view/ul/li[2]/label";
	String one_plus_claims = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[8]/div/app-step-content-vertical-options-view/ul/li[3]/label";
	///// Variable screen 1.9 Restriction in 3 years://////
	String true_non_restrictions = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[9]/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]";
	String false_non_restrictions = "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[9]/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]";
	
	// Start insurance at the same day.
	int startDateYear = Calendar.getInstance().get(Calendar.YEAR);
	// static int startDateMonth = Calendar.getInstance().get(Calendar.MONTH)+9;
	int startDateMonth = Calendar.getInstance().get(Calendar.MONTH);
	// Fix for problem MONTH:
	int startDateDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	String dateWithZero;
	String numOfDrivers = "";

	public int monthDatePlus1(String dayOrMonth, int valueOfDayOrMonth) {

		if (dayOrMonth == "month") {
			if (valueOfDayOrMonth < 12) {
				valueOfDayOrMonth = valueOfDayOrMonth + 1;
			}
			System.out.println("month plus1: " + valueOfDayOrMonth);
		}
		if (dayOrMonth == "day") {
			if (valueOfDayOrMonth < 12) {
				valueOfDayOrMonth = valueOfDayOrMonth + 1;
			}
			System.out.println("month plus1: " + valueOfDayOrMonth);
		}

		return valueOfDayOrMonth;
	}

	public String addZero(int oneDigit) {
		if (String.valueOf(oneDigit).length() == 1) {
			dateWithZero = "0" + oneDigit;
			return dateWithZero;
		}
		return Integer.toString(oneDigit);
	}

	// Screen 1.2
	public String numberOfDrivers(String numOfDrivers) throws InterruptedException {

		// numOfDrivers = this.varClass.numberOfDrivers;
		switch (Integer.parseInt(numOfDrivers)) {
		case 1:
			numOfDrivers = one_driver;
			break;

		case 2:
			numOfDrivers = two_drivers;
			break;

		case 3:
			numOfDrivers = three_drivers;
			break;

		case 9:
			numOfDrivers = all_drivers;
			break;

		default:
			numOfDrivers = all_drivers;
			break;
		}
		return numOfDrivers;
	}

	// Screen 1.4 driverYears
	public String driverYears(String drivingYearsNumber) {
		// drivingYearsNumber = varClass.drivingYears;
		if (Integer.parseInt(drivingYearsNumber) == 0) {
			drivingYearsNumber = zero_driving_history;
		} else if (Integer.parseInt(drivingYearsNumber) == 1) {
			drivingYearsNumber = one_driving_history;
		} else if (Integer.parseInt(drivingYearsNumber) > 1 && Integer.parseInt(drivingYearsNumber) < 10) {
			drivingYearsNumber = two_driving_history;
		} else if (Integer.parseInt(drivingYearsNumber) > 9 && Integer.parseInt(drivingYearsNumber) < 16) {
			drivingYearsNumber = ten_driving_history;
		} else if (Integer.parseInt(drivingYearsNumber) > 15) {
			drivingYearsNumber = sixten_driving_history;
		}
		return drivingYearsNumber;
	}

	// Screen 1.5 mortgageCar
	public String mortgageCar(String isMortgageCar) {
		// isMortgageCar = varClass.mortgageCar;
		if (isMortgageCar.contentEquals("false")) {
			return false_mortgageCar;
		}
		return true_mortgageCar;
	}

	// Screen 1.6 yearsOfInsurance
	public String yearsOfInsurance(String yearsOfInsurance) {
		// yearsOfInsurance = varClass.yearsOfInsurance;
		if (yearsOfInsurance.contentEquals("false")) {
			return false_yearsOfInsurance;
		}
		return true_yearsOfInsurance;
	}

	// Screen 1.7 claimsIn3Years
	public String claimsIn3Years(String claimsIn3Years) {
		// claimsIn3Years = varClass.claimsIn3Years;
		if (claimsIn3Years.contentEquals("false")) {
			return false_claimsIn3Years;
		}
		return true_claimsIn3Years;
	}

	// Screen 1.8 howManyClaims
	public String howManyClaims(String howManyClaims) {
		// howManyClaims = varClass.howManyClaims;

		if (howManyClaims.contentEquals("0")) {
			return zero_claims;
		}
		if (howManyClaims.contentEquals("1")) {
			return one_claim;
		}
		return one_plus_claims;
	}

	// Screen 1.9 Restriction in 3 years No restrictions:
	public String restrictions(String restrictions) {
		// restrictions = varClass.restrictions;
		if (restrictions.contentEquals("true")) {
			return true_non_restrictions;
		}
		// retrun false to avoid red path.
		return false_non_restrictions;
	}

	public void initialQuestions(WebDriver driver, VarClass varClass) throws InterruptedException {
		// Display accessibility menu
		JavascriptExecutor js = (JavascriptExecutor) varClass.driver;
		js.executeScript("$('.accessibility-menu').show()");
		// Start count time for proposal
		Instant start = Instant.now();
		varClass.wait = new WebDriverWait(varClass.driver, varClass.waitForElement);
		// Screen1.1: Start insurance date.
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath(open_calander).click();
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByCssSelector(select_today).click();
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath(next_one).click();
		// Screen1.2: How many drivers.
		varClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(ByXPath.xpath((numberOfDrivers(varClass.numberOfDrivers)))));
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath(numberOfDrivers(varClass.numberOfDrivers)).click();
		// Screen1.3: Youngest driver.
		varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("youngest-driver-age")));
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementById(label_youngest_driver).click();
		varClass.driver.findElementById(value_youngest_driver).sendKeys(varClass.youngestDriverAge);
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath(next_three).click();
		// Screen1.4: licenseOfYoungestDriver.;
		varClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(driverYears(varClass.drivingYears))));
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath(driverYears(varClass.drivingYears)).click();
		// Screen1.5: Mortgaged Vehicle.
		varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mortgageCar(varClass.mortgageCar))));
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath(mortgageCar(varClass.mortgageCar)).click();
		// Screen1.6: 3 years insurance.
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 2);
		varClass.driver.findElementByXPath(yearsOfInsurance(varClass.yearsOfInsurance)).click();
		// Screen1.7: Claims in 3 years.
		JavascriptExecutor jse = (JavascriptExecutor) varClass.driver;
		jse.executeScript("document.getElementById('step-0-q7-0-radio-2').focus();");
		// varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("step-0-q7-0-radio-2")));
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 1);
		varClass.driver.findElementByXPath(claimsIn3Years(varClass.claimsIn3Years)).click();
		// Screen1.8 how many claims in 3 years.
		varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app-offer")));
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath(howManyClaims(varClass.howManyClaims)).click();
		// Screen1.9 Restrictions in 3 years
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app-offer")));
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
		varClass.driver.findElementByXPath(restrictions(varClass.restrictions)).click();
		// Print time of function (instant now).
		Instant end = Instant.now();
		System.out.println("Method initialOfferQuestions took: " + Duration.between(start, end));
	}
}