package TestNG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;

public class TestFailed {
	WebDriver driver;
	VarClass varClass;
	ArrayList<String> errorsList = new ArrayList<String>();

	public void testException(WebDriver driver, VarClass varClass) throws Exception, IOException {
		System.out.println("Enterd testException class!");
		TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 5);
		String inputLine = varClass.generatedUrlData;
		// Open buffer reader / writer.
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new FileWriter(
				varClass.LogAndScreenShotPath + "\\" + varClass.environment + varClass.filename + ".txt"));
//		try {
			System.out.println("Input line: " +inputLine);
			out.write(inputLine);
			
			// Take ScreenShot:
			File scrFile = ((TakesScreenshot) varClass.driver).getScreenshotAs(OutputType.FILE);
			// Now copy .jpeg to screenShotPath
			scrFile = ((TakesScreenshot) varClass.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(
					varClass.LogAndScreenShotPath + "\\" + varClass.environment + varClass.filename + ".jpeg"));
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick);
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception("Failed in ScreenShot");
//		}
//		try {

			
			// Print logs from console (Warnings and Errors ONLY!)
			System.out.println("Errors logs:");
			LogEntries logs = varClass.driver.manage().logs().get("browser");
			for (LogEntry entry : logs) {
				System.out.println(entry.getMessage());
				errorsList.add(entry.getMessage());
			}
			;
			// Wait +7 seconds for iiii site.
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 7);
			// Email fields:
			varClass.driver.get("https://iiii.co.il/#contact");
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 5);
			varClass.driver.findElementByXPath("//input[@placeholder='Your name']")
					.sendKeys(varClass.environment + " Error");
			TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
			varClass.driver.findElementByXPath("//input[@placeholder='Your e-mail']")
					.sendKeys("amichaito@matrix.co.il");
			TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
			varClass.driver.findElementByXPath("//input[@placeholder='Subject']")
					.sendKeys(varClass.environment + " Error");
			TimeUnit.MILLISECONDS.sleep(varClass.MILLISECONDS);
			//////////////////// NEW/////////////////
			// Send userID and pid:
			varClass.driver.findElementByXPath("//textarea[@placeholder='Message']")
					.sendKeys(varClass.generatedUrlData + "<br>");
			// Send Warnings and Errors ONLY!:
			System.out.println("****Here are logs in Message email:****");
			for (int i = 0; i < errorsList.size(); i++) {
				System.out.println(errorsList.get(i));
				varClass.driver.findElementByXPath("//textarea[@placeholder='Message']")
						.sendKeys(errorsList.get(i) + "</br>");
				out.write(errorsList.get(i) + "</br>");
			}
			System.out.print("Write to log file.txt successful");
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 3);
			varClass.driver.findElementByXPath("//input[@class='wpcf7-form-control wpcf7-submit']").click();
			// Wait +7 seconds for iiii site.
			TimeUnit.SECONDS.sleep(varClass.waitBeforeClick + 3);
			// Close save log to txt file.
			out.close();
			in.close();
			varClass.driver.quit();
			
//		} finally {
//			out.close();
//			in.close();
//		}
//		// Close agent
//		varClass.driver.quit();
	}

	public void testFailed(WebDriver driver, VarClass varClass) throws Exception {
		try {
			testException(varClass.driver, varClass);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Failed in Email send by iiii.co.il");
		}
	}
}
