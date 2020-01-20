package TestNG;

import java.io.FileInputStream;
import java.sql.Date;
import java.text.MessageFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Collections;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class varClass {

	
	public String redPath, environmentURL, environment, panguGUID, carNumber, startInsuranceDate, numberOfDrivers, youngestDriverAge, drivingYears,
			mortgageCar, yearsOfInsurance, claimsIn3Years, howManyClaims, restrictions, screenShotPath, filename,
			insuredName, insuredLastName, insuredIdDriver, genderPolicyOwner, insuredBirthDate, insuredLicenseIssueYear,
			city, street, houseNumber, email, cellphone, wizardPhone0, wizardPhone1, driver1Name, driver1LastName,
			driver1Id, driver1BirthDate, driver2Name, driver2LastName, driver2Id, driver2BirthDate,
			driver2LicenseIssueYear,criminalAndRefuse, cardNumber, cardPersonalId, driver1LicenseIssueYear, cardFullName, cardMonth,
			cardYear, localApp, httpOrHttps;

	public boolean appID;
	public String thankYouURL;
	public int waitForElement, waitBeforeClick, MILLISECONDS;
	public Dimension windowDimension;
	public ChromeOptions options;
	ChromeDriver driver;

	//TODO: WHAT IS WAIT?
	
	WebDriverWait wait;
	public void setWaitClass(WebDriverWait wait) {
		wait = wait;
	}
	
//    @Parameters(value="env")
//    @Test
//    public void t1(String desc) {
//        System.out.println("t1: " + desc);
//    }

	// @Test(priority = 0, groups={"varClass.defineVariables"})
	@Parameters({"xml", "env"})
	public void defineVariables(String xml) throws Exception {
    	
		try {
			
			Properties varProps = new Properties();
			windowDimension = new Dimension(372, 900);
			String dir = System.getProperty("user.dir");
			System.out.println("current dir = " + dir);
			String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
			System.out.println("Root path:" + rootPath);
			

			//TODO:
			//David:
			//String filePath = MessageFormat.format("{0}\\configXml\\{1}\\config.{2}.xml", dir, xml);
			String filePath = MessageFormat.format("{0}\\configXml\\config.{1}.xml", dir, xml);
			System.out.println("xml file path: "+ filePath);
			
			varProps.loadFromXML(new FileInputStream(filePath));
			redPath = varProps.getProperty("redPath");
			System.out.println("redpath: "+ varProps.getProperty("redPath"));
			
		
//
//			System.out.println(1);
//			System.out.println("redpath: "+ varProps.getProperty("redPath"));
//			
//			if(varProps.getProperty("redPath").contentEquals("true")) {
//				System.out.println(2);
//				filePath = MessageFormat.format("{0}\\redPath\\config.{1}.xml", dir, env);
//				System.out.println("filePath: "+ filePath);
//				System.out.println("redpath: "+ redPath);
//			}
//			else {
//				filePath = MessageFormat.format("{0}\\config.{1}.xml", dir, env);
//			}
////			

			carNumber = varProps.getProperty("carNumber");// "5901079"; // Menora car#: 59XXX79.//5901079 //2432773
			// environmentURL =
			// "https://stage.pango-ins.co.il/api/test/url?uid=7ee1878d-556c-4aef-ab25-2e29cbae93d8&ln="
			// + carNumber;
			// environmentURL = "https://" + varProps.getProperty("environment")+
			// ".pango-ins.co.il/api/test/url?uid="+ "a17240b3-90a5-4817-b269-d097e9a26668"
			// +"&ln=" + carNumber;

			// Test in 7.5.2019 - 10.5.2019 if RegisterdAccount is still available for the
			// user
			// carNumber = "5900179";
			// environmentURL = "https://" + varProps.getProperty("environment")+
			// ".pango-ins.co.il/api/test/url?uid="+ "d3e1594d-a5f8-4a01-8dbd-8ccf5d1808e0"
			// +"&ln=" + carNumber;

			// environmentURL = "https://" + varProps.getProperty("environment")+
			// ".pango-ins.co.il/api/test/url?ln=" + carNumber + "&ui=" + UUID.randomUUID();

		    
			environment = varProps.getProperty("environment");

			// System.out.println("First URL: "+ environment);
			if (environment.equals("local")) {
				environmentURL = "http://localhost:26904/api/test/url";
				System.out.println("hi: " + environmentURL);
			} else {
				environmentURL = "https://" + varProps.getProperty("environment") + ".pango-ins.co.il/api/test/url?ln="
						+ carNumber + "&ui=" + UUID.randomUUID();
			}
			System.out.println("Environment is: " + environmentURL);
			thankYouURL = "https://" + varProps.getProperty("environment") + " .pango-ins.co.il/thanks";
			// Define resolution - iPhone X (375 x 812).
			// dimension = new Dimension(375, 812);
			// Define Max wait for element and wait before click to next screen (seconds).
			waitForElement = Integer.parseInt(varProps.getProperty("waitForElement"));
			waitBeforeClick = Integer.parseInt(varProps.getProperty("waitBeforeClick"));
			MILLISECONDS = Integer.parseInt(varProps.getProperty("MILLISECONDS"));
			// Define scenario variables - First offer:
			appID = Boolean.valueOf(varProps.getProperty("appID"));
			startInsuranceDate = varProps.getProperty("startInsuranceDate");
			youngestDriverAge = varProps.getProperty("youngestDriverAge");
			numberOfDrivers = varProps.getProperty("numberOfDrivers");
			drivingYears = varProps.getProperty("drivingYears");
			mortgageCar = varProps.getProperty("mortgageCar");
			yearsOfInsurance = varProps.getProperty("yearsOfInsurance");
			claimsIn3Years = varProps.getProperty("claimsIn3Years");
			howManyClaims = varProps.getProperty("howManyClaims");
			restrictions = varProps.getProperty("restrictions");
			// Define scenario variables - Second offer:
			// <!-- Policy owner details: -->
			wizardPhone0 = varProps.getProperty("wizardPhone0");
			wizardPhone1 = varProps.getProperty("wizardPhone1");
			insuredName = varProps.getProperty("insuredName");
			insuredLastName = varProps.getProperty("insuredLastName");
			insuredIdDriver = varProps.getProperty("insuredIdDriver");
			genderPolicyOwner = varProps.getProperty("genderPolicyOwner");

			insuredBirthDate = varProps.getProperty("insuredBirthDate");
			insuredLicenseIssueYear = varProps.getProperty("insuredLicenseIssueYear");
			city = varProps.getProperty("city");
			street = varProps.getProperty("street");
			houseNumber = varProps.getProperty("houseNumber");
			email = varProps.getProperty("email");
			cellphone = varProps.getProperty("cellphone");
			// ADditional Driver1 details:
			driver1Name = varProps.getProperty("driver1Name");
			driver1LastName = varProps.getProperty("driver1LastName");
			driver1Id = varProps.getProperty("driver1Id");
			driver1BirthDate = varProps.getProperty("driver1BirthDate");
			driver1LicenseIssueYear = varProps.getProperty("driver1LicenseIssueYear");
			// ADditional Driver2 details:
			driver2Name = varProps.getProperty("driver2Name");
			driver2LastName = varProps.getProperty("driver2LastName");
			driver2Id = varProps.getProperty("driver2Id");
			driver2BirthDate = varProps.getProperty("driver2BirthDate");
			driver2LicenseIssueYear = varProps.getProperty("driver2LicenseIssueYear");
			
			//redPath final offer criminalAndRefuse:
			criminalAndRefuse = varProps.getProperty("criminalAndRefuse");

			// CreditGaurd details
			cardFullName = varProps.getProperty("cardFullName");
			cardPersonalId = varProps.getProperty("cardPersonalId");
			cardNumber = varProps.getProperty("cardNumber");
			cardMonth = varProps.getProperty("cardMonth");
			cardYear = varProps.getProperty("cardYear");
			
			// Define path of chromedriver.exe file.
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\amichaito\\Desktop\\Code\\Selenium\\PangoAPP\\chromedriver.exe");

			// C:\Users\amichaito\Desktop\chromedriver_win32\chromedriver.exe

			//TODO change this path if running with another machine.
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\amichaito\\Desktop\\chromedriver2\\chromedriver.exe");

			// Define path to save screenShot of first screen (start date).
			screenShotPath = "C:\\Users\\amichaito\\Desktop\\PangoError";

			// Map<String, String> mobileEmulation = new HashMap<>();
			// mobileEmulation.put("deviceName", "iPhone X");

			// options.setExperimentalOption("mobileEmulation", mobileEmulation);

			// options.addArguments("--window-size=320,900");

			options = new ChromeOptions();
			
			//Save agent console logs
	        LoggingPreferences logPrefs = new LoggingPreferences();
	        logPrefs.enable(LogType.DRIVER, Level.ALL);
	        logPrefs.enable(LogType.BROWSER, Level.ALL);
	        options.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
	        
	        options.addArguments("--log-level=1");
			options.addArguments("disable-infobars");
			options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
			options.addArguments("--incognito");
			//options.addArguments("--auto-open-devtools-for-tabs");

			
			driver = new ChromeDriver(options);
			
			
			
			driver.get(environmentURL);
			driver.manage().window().setSize(windowDimension);
			driver.manage().deleteAllCookies();
			TimeUnit.SECONDS.sleep(waitBeforeClick);

			// Extract URL for text.
			String data = driver.findElementByTagName("body").getText();

			if (environment.equals("local")) {
				httpOrHttps = "http://";
			} else {
				httpOrHttps = "https://";
			}

			String[] arr = data.split(httpOrHttps);
			String pango = "";
			for (String ss : arr) {
				pango = ss;
			}

			panguGUID = pango.replaceAll("}", "").replaceAll("\"", "");
			// Open URL with GUID
			driver.get(httpOrHttps + panguGUID);
			System.out.println("Final Url: " + httpOrHttps + panguGUID);
			
		
			// DATE file format
			Calendar cal = Calendar.getInstance();
			cal.setTime(Date.from(Instant.now()));
			// Create a filename from a format string.
			filename = String.format("%1$tY-%1$tm-%1$td-%1$tk-%1$tS-%1$tp", cal);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Failed by wrong configuration!");
		}
	}
}