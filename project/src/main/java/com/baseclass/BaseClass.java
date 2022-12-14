package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.Logger;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utils.PropertiesUtils;

public class BaseClass {
	
	public static WebDriver driver = null;
	public static ExtentReports reports = null;
	public static ExtentSparkReporter sparkReporter = null;
	public static ExtentTest test = null;
	public static Logger logger = Logger.getLogger(BaseClass.class);
	
	public void initialization() throws Exception {
		System.out.println("Initializing Browser"); //only console
		logger.info("Initializing Browser"); //console & file
		
		String Stringname = PropertiesUtils.readproperty("browser");
		System.out.println(Stringname.getBytes());
		
		if (Stringname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.gecko.driver","C:\\project\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		
		if (Stringname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\facebook\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(PropertiesUtils.readproperty("url"));
		
	}
	public void reportInit() {
		reports = new ExtentReports();
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/ExtentReport.html");
		reports.attachReporter(sparkReporter);
	}


	

}
