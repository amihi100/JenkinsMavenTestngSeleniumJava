package TestNG;
/**
 * Java Selenium project for Pango insurance app.  
 * amihi100@gmail.com
 * Version 1.3
 */

import java.io.IOException;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.util.InvalidPropertiesFormatException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.InputStreamReader;
//import java.time.Duration;
//import java.time.Instant;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.logging.LogEntries;
//import org.openqa.selenium.logging.LogEntry;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebElement;
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

public class SanityAllOptions {
	@Parameters("xml")
	public SanityAllOptions(String xml)
			throws InvalidPropertiesFormatException, FileNotFoundException, IOException, InterruptedException {
		// TimeUnit.SECONDS.sleep(10);
		 varClass = new  VarClass();
		try {
			varClass.defineVariables(xml);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	java.util.Date dateTime = new java.util.Date();
	 VarClass varClass;

	WebDriverWait waitZ;
	/**
	 * // Screen1.1: Start insurance date. In case we want to use next day month:
	 * date.add(Calendar.DATE, 1); Or just assign the Vars to specific date: static
	 * int startDateYear = 2019; static int startDateMonth = 2; static int
	 * startDateDay = 19;
	 * 
	 */
	
	TestFailed testFailed = new TestFailed();
	InitialQuestions initialQuestions = new InitialQuestions();
	CallMeWizard callMeWizard = new CallMeWizard();
	InitialOfferScreen  initialOfferScreen = new InitialOfferScreen();
	FinalQuestions finalQuestions = new FinalQuestions();
	FinalOfferScreen finalOfferScreen = new FinalOfferScreen();
	Covers covers = new Covers();
	Payments payments = new Payments();
	ReturnSteps returnSteps = new ReturnSteps();
	ForwardSteps forwardSteps = new ForwardSteps();
	IframeCreditGuard iframeCreditGuard = new IframeCreditGuard();
	ThankYou thankYou = new ThankYou();
	RegisteredAccount registeredAccount = new RegisteredAccount();
	
//	@Test(priority = 1 , dependsOnGroups={"varClass.defineVariables"})
	@Test(priority = 10)
	public void initialQuestions() throws Exception {
		try {
			initialQuestions.initialQuestions(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in FIRST OFFER QUESTIONS.");
		}
	}

	@Test(enabled = false)
	// @Test(priority = 20, dependsOnMethods="initialQuestions")
	public void callMeWizard() throws Exception {
		try {

			callMeWizard.callMeWizard(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in ***Call me wizard 1***");
		}
	}


	@Test(priority = 30, dependsOnMethods="initialQuestions")
	public void initialOfferScreen() throws Exception {
		try {
			
			initialOfferScreen.initialOfferScreen(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in INITIAL OFFER SCREEN QUESTION");
		}
	}

	@Test(priority = 40, dependsOnMethods="initialOfferScreen")
	public void finalQuestions() throws Exception {
		// FINAL OFFER SCREENS QUESTIONS.
		try {
			finalQuestions.finalQuestions(varClass.driver, varClass);
			
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in FINAL OFFER QUESTIONS");
		}
	}

	@Test(priority = 50, dependsOnMethods="finalQuestions")
	public void finalOfferScreen() throws Exception {
		try {
			finalOfferScreen.finalOfferScreen(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in FINAL OFFER screen");
		}
	}
	

	@Test(priority = 70, dependsOnMethods="finalOfferScreen")
	public void covers() throws Exception {
		covers.covers(varClass.driver, varClass);
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in COVERS screen");
		}
	}

	@Test(priority = 80, dependsOnMethods="covers")
	public void payments() throws Exception {
		try {
			payments.payments(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in PAYMENTS screen");
		}
	}
	//@Test(enabled = false)
	@Test(priority = 85, dependsOnMethods="payments")
	public void returnSteps() throws Exception {
		try {
			returnSteps.returnSteps(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in moveing BACKWARD");
		}
	}
	//@Test(enabled = false)
	@Test(priority = 86, dependsOnMethods="returnSteps")
	public void forwardSteps() throws Exception {
		try {
			forwardSteps.forwardSteps(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in moveing FORWARD");
		}
	}

	//@Test(enabled = false)
	 @Test(priority = 90, dependsOnMethods="forwardSteps")
	public void iframeCreditGuard() throws Exception {
		try {
			iframeCreditGuard.iframeCreditGuard(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			// testException();
			throw new Exception("Failed in Iframe CreditGuard");
		}
	}

	//@Test(enabled = false)
	@Test(priority = 100, dependsOnMethods="iframeCreditGuard")
	public void thankYouPage() throws Exception {
		try {
			thankYou.thankYou(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed to display thank you page");
		}
	}

	//@Test(enabled = false)
	@Test(priority = 110, dependsOnMethods="thankYouPage")
	public void registeredAccount() throws Exception {
		try {
			registeredAccount.registeredAccount(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed to display thank you page");
		} finally {
			// This block is executed either exception happened or not.
			// TODO: close chrome tabs , delete cookies, preapre for new tests.
			varClass.driver.manage().deleteAllCookies();
			// varClass.driver.close();
			System.out.println("Closed tab and deleted cookies");
		}
	}

}