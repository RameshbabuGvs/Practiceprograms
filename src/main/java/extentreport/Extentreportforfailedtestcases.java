package extentreport;

import java.awt.Desktop;
import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreportforfailedtestcases {
	static WebDriver driver;
	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			String url="https://www.bing.com/search?FORM=U523DF&PC=U523&q=ipc+sections+list";
			driver.navigate().to(url);
			
			
			ExtentReports extentreports=new ExtentReports();
			ExtentSparkReporter sparkreporter=new ExtentSparkReporter(".\\reports\\Test.html");
			ExtentSparkReporter sparkreporter_all=new ExtentSparkReporter(".\\reports\\AllTest.html");
			ExtentSparkReporter sparkreporter_Fail=new ExtentSparkReporter(".\\reports\\FailedTest.html");
			ExtentSparkReporter sparkreporter_Skipandwarning=new ExtentSparkReporter(".\\reports\\Skipandwarning.html");
            sparkreporter_Fail.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();

            sparkreporter_Fail.filter().statusFilter().as(new Status[] {
            		Status.FAIL,
            		Status.SKIP,
            		Status.WARNING
            		}).apply();
			
			
			
			extentreports.attachReporter(sparkreporter_all,sparkreporter_Fail,sparkreporter_Skipandwarning);
			
			sparkreporter.config().setTheme(Theme.DARK);
			sparkreporter.config().setReportName("Com.test");
			sparkreporter.config().setDocumentTitle("Document");
			
			extentreports.createTest("Test1","Testdescription")
			.assignAuthor("Rameshbabu")//Author information
			.assignCategory("Sanity")//Category
			.assignDevice("Chrome")//device name
			.pass("This is Passed Test1");
			
			extentreports.createTest("Test2","Testdescription2")
			.assignAuthor("RameshbabuGvs")
			.assignCategory("Sanity1")
			.assignDevice("Chrome99")
			.fail("This is failed Test2");
			
			extentreports.createTest("Test3","Testdescription3")
			.assignAuthor("RameshbabuGvs","Mahesh","Naresh")
			.assignCategory("Sanity1","Smoke","Regression")
			.assignDevice("Chrome99","IE","Edge")
			.skip("This is skipped Test3");
			
			extentreports.createTest("Test4","Testdescription4")
			.assignAuthor("RameshbabuGvs","Mahesh","Naresh")
			.assignCategory("Sanity1","Smoke","Regression")
			.assignDevice("Chrome99","IE","Edge")
			.warning("This is warning Test4");
			
			Throwable t=new RuntimeException("This is custom exception");
			extentreports
			.createTest("Exception Test")
			.fail(t);
			
			//system & environment varaibles
			Capabilities capabilities=((RemoteWebDriver) driver).getCapabilities();
			
			/*System.out.println(capabilities.getBrowserName());
			System.out.println(capabilities.getVersion());
			System.out.println(System.getProperty("os.name"));
			System.out.println(System.getProperty("java.version"));
			System.out.println(System.getProperty("sun.desktop"));
			*/
			
		extentreports.setSystemInfo("OS", System.getProperty("os.name"));
		extentreports.setSystemInfo("JAVA Verison", System.getProperty("java.version"));
		extentreports.setSystemInfo("Browser", capabilities.getBrowserName()+capabilities.getVersion());
		extentreports.setSystemInfo("Machine", System.getProperty("sun.desktop"));
		extentreports.setSystemInfo("App url", "https://www.myscheme.gov.in/schemes/us");
		extentreports.setSystemInfo("user name", "ramgv4@gmail.com");
		extentreports.setSystemInfo("Password","Ramesh");
		extentreports.setSystemInfo("Version",capabilities.getVersion());
			
			
			
			
			
			extentreports.flush();
			
		
		
		
	}

}
