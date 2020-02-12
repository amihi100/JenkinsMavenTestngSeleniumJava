package TestNG;
/**
 * Java Selenium project for Pango insurance app.  
 * amihi100@gmail.com
 * Version 1.4 refactoring.
 */

import java.io.IOException;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.util.InvalidPropertiesFormatException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;

/**
 * import of take screenshot and save a file: import java.io.File; import
 * org.apache.commons.io.FileUtils; import org.openqa.selenium.OutputType;
 * import org.openqa.selenium.TakesScreenshot;
 */
public class SanityAllOptions {
	@Parameters("xml")
	public SanityAllOptions(String xml)
			throws InvalidPropertiesFormatException, FileNotFoundException, IOException, InterruptedException {
		// TimeUnit.SECONDS.sleep(10);
		varClass = new VarClass();
		try {
			varClass.defineVariables(xml);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	java.util.Date dateTime = new java.util.Date();
	VarClass varClass;

//	@Test(priority = 1 , dependsOnGroups={"varClass.defineVariables"})
	@Test(priority = 10)
	public void initialQuestions() throws Exception {
		InitialQuestions initialQuestions = new InitialQuestions();
		try {
			initialQuestions.initialQuestions(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in FIRST OFFER QUESTIONS.");
		}
	}

	@Test(enabled = false)
	// @Test(priority = 20, dependsOnMethods="initialQuestions")
	public void callMeWizard() throws Exception {
		CallMeWizard callMeWizard = new CallMeWizard();
		try {
			callMeWizard.callMeWizard(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in ***Call me wizard 1***");
		}
	}

	@Test(priority = 30, dependsOnMethods = "initialQuestions")
	public void initialOfferScreen() throws Exception {
		InitialOfferScreen initialOfferScreen = new InitialOfferScreen();
		try {
			initialOfferScreen.initialOfferScreen(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in INITIAL OFFER SCREEN QUESTION");
		}
	}

	@Test(priority = 40, dependsOnMethods = "initialOfferScreen")
	public void finalQuestions() throws Exception {

		FinalQuestions finalQuestions = new FinalQuestions();
		// FINAL OFFER SCREENS QUESTIONS.
		try {
			finalQuestions.finalQuestions(varClass.driver, varClass);

		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in FINAL OFFER QUESTIONS");
		}
	}

	@Test(priority = 50, dependsOnMethods = "finalQuestions")
	public void finalOfferScreen() throws Exception {
		FinalOfferScreen finalOfferScreen = new FinalOfferScreen();
		try {
			finalOfferScreen.finalOfferScreen(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in FINAL OFFER screen");
		}
	}

	@Test(priority = 70, dependsOnMethods = "finalOfferScreen")
	public void covers() throws Exception {
		Covers covers = new Covers();
		covers.covers(varClass.driver, varClass);
		try {

		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in COVERS screen");
		}
	}

	@Test(priority = 80, dependsOnMethods = "covers")
	public void payments() throws Exception {
		Payments payments = new Payments();
		try {
			payments.payments(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in PAYMENTS screen");
		}
	}

	// @Test(enabled = false)
	@Test(priority = 85, dependsOnMethods = "payments")
	public void returnSteps() throws Exception {
		ReturnSteps returnSteps = new ReturnSteps();
		try {
			returnSteps.returnSteps(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in moveing BACKWARD");
		}
	}

	// @Test(enabled = false)
	@Test(priority = 86, dependsOnMethods = "returnSteps")
	public void forwardSteps() throws Exception {
		ForwardSteps forwardSteps = new ForwardSteps();
		try {
			forwardSteps.forwardSteps(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed in moveing FORWARD");
		}
	}

	@Test(enabled = false)
	// @Test(priority = 90, dependsOnMethods="forwardSteps")
	public void iframeCreditGuard() throws Exception {
		IframeCreditGuard iframeCreditGuard = new IframeCreditGuard();
		try {
			iframeCreditGuard.iframeCreditGuard(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			// testException();
			throw new Exception("Failed in Iframe CreditGuard");
		}
	}

	@Test(enabled = false)
	// @Test(priority = 100, dependsOnMethods="iframeCreditGuard")
	public void thankYouPage() throws Exception {
		ThankYou thankYou = new ThankYou();
		try {
			thankYou.thankYou(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
			e.printStackTrace();
			testFailed.testFailed(varClass.driver, varClass);
			throw new Exception("Failed to display thank you page");
		}
	}

	@Test(enabled = false)
	// @Test(priority = 110, dependsOnMethods="thankYouPage")
	public void registeredAccount() throws Exception {
		RegisteredAccount registeredAccount = new RegisteredAccount();
		try {
			registeredAccount.registeredAccount(varClass.driver, varClass);
		} catch (Exception e) {
			TestFailed testFailed = new TestFailed();
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

	@AfterSuite()
	public void closeChrome() {
		varClass.driver.quit();
	}

}