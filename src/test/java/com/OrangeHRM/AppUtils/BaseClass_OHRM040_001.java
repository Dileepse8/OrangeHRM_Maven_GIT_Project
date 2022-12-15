package com.OrangeHRM.AppUtils;
//import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_OHRM040_001 {

	public WebDriver driver;
	public String url = "http://orangehrm.qedgetech.com/";
	public Logger log;

	@BeforeTest
	public void setUpBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		log = Logger.getLogger("com.OrangeHRM_TestNG_Project");
		log.info(" User is URL typed");
		PropertyConfigurator.configure("Log4j.properties");
		log.info("Browser is Opened");
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
		log.info("Browser is closed");
	}

}
