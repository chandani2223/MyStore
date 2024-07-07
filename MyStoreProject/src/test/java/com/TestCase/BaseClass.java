package com.TestCase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected Logger logger= LogManager.getLogger(this.getClass());

	ReadConfig rc = new ReadConfig();
	String urls = rc.getBaseURL();
	String brow = rc.getbrowser();

	public WebDriver driver;
	@BeforeClass
	public void setUp() {

		// Initialize logger for the test class
		//logger = LogManager.getLogger(this.getClass());
		switch(brow.toLowerCase()) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\tester\\MyStoreProject\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			logger.info("Open the URL in chrome browser");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			logger.warn("Unsupported browser specified in configuration: " + brow);
			driver = null;
			break;
		}
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(urls);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else {
			logger.error("WebDriver initialization failed for browser: " + brow);
		}
	}

	@AfterClass
	public void tearDown() throws Exception {
		//Thread.sleep(2000);
		//driver.close();
	}
}
