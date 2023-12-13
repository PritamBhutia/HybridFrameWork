package Com.Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.Utils.PropertyUtils;

public class BaseClass {
	
	public static WebDriver  driver= null;
	public static ExtentReports report= null;
	public static ExtentSparkReporter spark= null;
	public static ExtentTest test = null;
	public static Logger log = Logger.getLogger(BaseClass.class);
	
	public static void Initialization() throws Exception{
		System.out.println("Initialize The Browser");
		log.info("Initialize the Browser");
		
		String BrowserName= PropertyUtils.ReadProperty("browser");
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","H:/chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		if(BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","H:/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PRITAM/Desktop/automation%20tols/Offline%20Website/index.html");
	}
	public void ExtentInit() {
		
	 report = new ExtentReports();
	 spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReport.html");
	 report.attachReporter(spark);
		
	}

}
