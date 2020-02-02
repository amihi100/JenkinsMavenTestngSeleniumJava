package TestNG;
/**
 * Java Selenium project for Pango insurance app.  
 * amihi100@gmail.com
 * Version 1.3
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.InvalidPropertiesFormatException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
//import java.io.PrintStream;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.io.FileOutputStream;
//import java.util.Date;
//import java.util.Scanner;
//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.logging.LogType;
//import com.google.errorprone.annotations.Var;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.SkipException;
//import org.testng.annotations.BeforeMethod;
//import com.google.common.base.Stopwatch;

/**
 * import of take screenshot and save a file: import java.io.File; import
 * org.apache.commons.io.FileUtils; import org.openqa.selenium.OutputType;
 * import org.openqa.selenium.TakesScreenshot;
 *
 */

public class sanityAllOptionsTest {
	@Parameters("xml")
	public sanityAllOptionsTest(String xml)
			throws InvalidPropertiesFormatException, FileNotFoundException, IOException, InterruptedException {
		// TimeUnit.SECONDS.sleep(10);
		 VarClass = new  varClass();
		try {
			VarClass.defineVariables(xml);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	java.util.Date dateTime = new java.util.Date();
	 varClass VarClass;

	WebDriverWait waitZ;
	/**
	 * // Screen1.1: Start insurance date. In case we want to use next day month:
	 * date.add(Calendar.DATE, 1); Or just assign the Vars to specific date: static
	 * int startDateYear = 2019; static int startDateMonth = 2; static int
	 * startDateDay = 19;
	 * 
	 */
	
	testFailed testFailedObject = new testFailed();
	initialQuestions initialQuestionsObject = new initialQuestions();
	callMeWizard callMeWizardObject = new callMeWizard();
	initialOfferScreen  initialOfferScreenObject = new initialOfferScreen();
	finalQuestions finalQuestionsObject = new finalQuestions();
	finalOfferScreen finalOfferScreenObject = new finalOfferScreen();
	covers coversObject = new covers();
	payments paymentsObject = new payments();
	returnSteps returnStepsObject = new returnSteps();
	forwardSteps forwardStepsObject = new forwardSteps();
	iframeCreditGuard iframeCreditGuardObject = new iframeCreditGuard();
	thankYouPage thankYouPageObject = new thankYouPage();
	registeredAccount registeredAccountObject = new registeredAccount();
	
//	@Test(priority = 1 , dependsOnGroups={"varClass.defineVariables"})
	@Test(priority = 10)
	public void initialQuestions() throws Exception {
		try {
			initialQuestionsObject.initialQuestionsMethod(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed in FIRST OFFER QUESTIONS.");
		}
	}

	@Test(enabled = false)
	// @Test(priority = 20, dependsOnMethods="initialQuestions")
	public void callMeWizard() throws Exception {
		try {

			callMeWizardObject.callMeWizardMethod(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed in ***Call me wizard 1***");
		}
	}


	@Test(priority = 30, dependsOnMethods="initialQuestions")
	public void initialOfferScreen() throws Exception {
		try {
			
			initialOfferScreenObject.initialOfferScreen(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed in INITIAL OFFER SCREEN QUESTION");
		}
	}

	@Test(priority = 40, dependsOnMethods="initialOfferScreen")
	public void finalQuestions() throws Exception {
		// FINAL OFFER SCREENS QUESTIONS.
		try {
			finalQuestionsObject.finalQuestionsMethod(VarClass.driver, VarClass);
			
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed in FINAL OFFER QUESTIONS");
		}
	}

	@Test(priority = 50, dependsOnMethods="initialOfferScreen")
	public void finalOfferScreen() throws Exception {
		try {
			finalOfferScreenObject.finalOfferScreenMethod(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed in FINAL OFFER screen");
		}
	}
	

	@Test(priority = 70, dependsOnMethods="initialOfferScreen")
	public void covers() throws Exception {
		coversObject.coversMethod(VarClass.driver, VarClass);
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed in COVERS screen");
		}
	}

	@Test(priority = 80, dependsOnMethods="initialOfferScreen")
	public void payments() throws Exception {
		try {
			paymentsObject.paymentsMethod(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed in PAYMENTS screen");
		}
	}

	@Test(priority = 85, dependsOnMethods="initialOfferScreen")
	public void returnSteps() throws Exception {
		try {
			returnStepsObject.returnStepsMethod(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed in moveing BACKWARD");
		}
	}

	@Test(priority = 86, dependsOnMethods="initialOfferScreen")
	public void forwardSteps() throws Exception {
		try {
			forwardStepsObject.forwardStepsMethod(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed in moveing FORWARD");
		}
	}

	@Test(enabled = false)
	// @Test(priority = 90, dependsOnMethods="initialOfferScreen")
	public void iframeCreditGuard() throws Exception {
		try {
			iframeCreditGuardObject.iframeCreditGuardMethod(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			// testException();
			throw new Exception("Failed in Iframe CreditGuard");
		}
	}

	@Test(enabled = false)
	// @Test(priority = 100, dependsOnMethods="initialOfferScreen")
	public void thankYouPage() throws Exception {
		try {
			thankYouPageObject.thankYouPageMethod(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed to display thank you page");
		}
	}

	@Test(enabled = false)
	// @Test(priority = 110, dependsOnMethods="initialOfferScreen")
	public void registeredAccount() throws Exception {
		try {
			registeredAccountObject.registeredAccountMethod(VarClass.driver, VarClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailedObject.testFailedMethod(VarClass.driver, VarClass);
			throw new Exception("Failed to display thank you page");
		} finally {
			// This block is executed either exception happened or not.
			// TODO: close chrome tabs , delete cookies, preapre for new tests.
			VarClass.driver.manage().deleteAllCookies();
			// VarClass.driver.close();
			System.out.println("Closed tab and deleted cookies");
		}
	}

}