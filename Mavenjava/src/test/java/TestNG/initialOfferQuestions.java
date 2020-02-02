//package TestNG;
//
//import java.time.Duration;
//import java.time.Instant;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By.ByXPath;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//public class initialOfferQuestions {
//
//	
//	varClass VarClass ;
//	
//	WebDriver driver;
//	
//	public void initialOfferQuestions() throws Exception {
//		
//		this.driver = driver;
////		initialOfferQuestions(driver);
//	
//	}
//	
//	// Screen 1.2
//		public String numberOfDrivers(String numOfDrivers) {
//
//			numOfDrivers = VarClass.numberOfDrivers;
//			switch (Integer.parseInt(numOfDrivers)) {
//			case 1:
//				numOfDrivers = "//aw-wizard-step[2]//div[1]//app-step-content-vertical-options-view[1]//ul[1]//li[1]//label[1]";
//				break;
//
//			case 2:
//				numOfDrivers = "//aw-wizard-step[@class='aw-wizard-step']//label[contains(text(),'2')]";
//				break;
//
//			case 3:
//				numOfDrivers = "//label[contains(text(),'3')]";
//				break;
//
//			case 9:
//				numOfDrivers = "//aw-wizard-step[@class='aw-wizard-step']//li[4]//label[1]";
//				break;
//
//			default:
//				numOfDrivers = "//aw-wizard-step[@class='aw-wizard-step']//li[4]//label[1]";
//				break;
//			}
//			return numOfDrivers;
//		}
//
//		// Screen 1.4 driverYears
//		public String driverYears(String drivingYearsNumber) {
//
//			drivingYearsNumber = VarClass.drivingYears;
//			if (Integer.parseInt(VarClass.drivingYears) == 0) {
//				drivingYearsNumber = "//aw-wizard-step[@class='aw-wizard-step step-youngest-driver-experience']//li[1]//label[1]";
//			} else if (Integer.parseInt(VarClass.drivingYears) == 1) {
//				drivingYearsNumber = "//aw-wizard-step[@class='aw-wizard-step step-youngest-driver-experience']//li[2]//label[1]";
//			} else if (Integer.parseInt(VarClass.drivingYears) > 1 && Integer.parseInt(VarClass.drivingYears) < 10) {
//				drivingYearsNumber = "//label[contains(text(),'2-9')]";
//			} else if (Integer.parseInt(VarClass.drivingYears) > 9 && Integer.parseInt(VarClass.drivingYears) < 16) {
//				drivingYearsNumber = "//label[contains(text(),'10-15')]";
//			} else if (Integer.parseInt(VarClass.drivingYears) > 15) {
//				drivingYearsNumber = "//label[contains(text(),'16+')]";
//			}
//			return drivingYearsNumber;
//		}
//
//		// Screen 1.5 mortgageCar
//		public String mortgageCar(String isMortgageCar) {
//			isMortgageCar = VarClass.mortgageCar;
//			if (isMortgageCar.contentEquals("false")) {
//				return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[5]/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]";
//			}
//			return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[5]/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]";
//		}
//
//		// Screen 1.6 yearsOfInsurance
//		public String yearsOfInsurance(String yearsOfInsurance) {
//			yearsOfInsurance = VarClass.yearsOfInsurance;
//			if (yearsOfInsurance.contentEquals("false")) {
//				return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[6]/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]";
//			}
//			return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[6]/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]";
//		}
//
//		// Screen 1.7 claimsIn3Years
//		public String claimsIn3Years(String claimsIn3Years) {
//			claimsIn3Years = VarClass.claimsIn3Years;
//			if (claimsIn3Years.contentEquals("false")) {
//				return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[6]/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]";
//			}
//			return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[7]/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]";
//		}
//
//		// Screen 1.8 howManyClaims
//		public String howManyClaims(String howManyClaims) {
//			howManyClaims = VarClass.howManyClaims;
//
//			if (howManyClaims.contentEquals("0")) {
//				return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[8]/div/app-step-content-vertical-options-view/ul/li[1]/label";
//			}
//			if (howManyClaims.contentEquals("1")) {
//				return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[8]/div/app-step-content-vertical-options-view/ul/li[2]/label";
//			}
//			return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[8]/div/app-step-content-vertical-options-view/ul/li[3]/label";
//		}
//
//		// Screen 1.9 Restriction in 3 years No restrictions:
//		public String restrictions(String restrictions) {
//			restrictions = VarClass.restrictions;
//			if (restrictions.contentEquals("true")) {
//				return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[9]/div/app-step-content-horizontal-options-view/ul/li[2]/label/span[1]";
//			}
//			// retrun false to avoid red path.
//			return "/html/body/app-root/app-offer/aw-wizard/div/aw-wizard-step[9]/div/app-step-content-horizontal-options-view/ul/li[1]/label/span[1]";
//		}
//	
//	
//	
//	
//	@Test (priority =4)
////	@Test(priority = 1 , dependsOnGroups={"varClass.defineVariables"})
////	@Test(priority = 12)
//	public void initialOfferQuestionsZ() throws Exception {
//		try {
//			
//			
//
//			// Show accessibility-menu:
//			// $('.accessibility-menu').show()
//			// $('.accessibility-menu').hide()
//
//			JavascriptExecutor js = (JavascriptExecutor) VarClass.driver;
//			js.executeScript("$('.accessibility-menu').show()");
//
//			Instant start = Instant.now();
//
//			// Screen1.1: Start insurance date.
//			VarClass.wait = new WebDriverWait(VarClass.driver, VarClass.waitForElement);
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath("//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']")
//					.click();
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath(
//					"/html/body/div[1]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-month-view/table/tbody/tr[1]/td[3]/div")
//					.click();
//
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath("//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")
//					.click();
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath("//button[@class='btn-next orange-circle']").click();
//			// Screen1.2: How many drivers.
//			VarClass.wait.until(ExpectedConditions
//					.visibilityOfElementLocated(ByXPath.xpath((numberOfDrivers(VarClass.numberOfDrivers)))));
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath(numberOfDrivers(VarClass.numberOfDrivers)).click();
//			// Screen1.3: Youngest driver.
//			VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("youngest-driver-age")));
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementById("label-for-youngest-driver-age").click();
//			VarClass.driver.findElementById("youngest-driver-age").sendKeys(VarClass.youngestDriverAge);
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath("//aw-wizard-step[3]//*[contains(@class,'orange')]").click();
//			// Screen1.4: licenseOfYoungestDriver.;
//			VarClass.wait
//					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(driverYears(VarClass.drivingYears))));
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath(driverYears(VarClass.drivingYears)).click();
//			// Screen1.5: Mortgaged Vehicle.
//			VarClass.wait
//					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mortgageCar(VarClass.mortgageCar))));
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath(mortgageCar(VarClass.mortgageCar)).click();
//			// Screen1.6: 3 years insurance.
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 2);
//			VarClass.driver.findElementByXPath(yearsOfInsurance(VarClass.yearsOfInsurance)).click();
//			// Screen1.7: Claims in 3 years.
//			JavascriptExecutor jse = (JavascriptExecutor) VarClass.driver;
//			jse.executeScript("document.getElementById('step-0-q7-0-radio-2').focus();");
//			// VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("step-0-q7-0-radio-2")));
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick + 1);
//			VarClass.driver.findElementByXPath(claimsIn3Years(VarClass.claimsIn3Years)).click();
//			// Screen1.8 how many claims in 3 years.
//			VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app-offer")));
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath(howManyClaims(VarClass.howManyClaims)).click();
//			// Screen1.9 Restrictions in 3 years
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app-offer")));
//			TimeUnit.SECONDS.sleep(VarClass.waitBeforeClick);
//			VarClass.driver.findElementByXPath(restrictions(VarClass.restrictions)).click();
//			// Print time of function (instant now).
//			Instant end = Instant.now();
//			System.out.println("Method initialOfferQuestions took: " + Duration.between(start, end));
//		} catch (Exception e) {
//			e.printStackTrace();
////			testException();
//			throw new Exception("Failed in FIRST OFFER QUESTIONS.");
//		}
//	}
//	
//}
