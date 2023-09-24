package extentreport;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Removechnageorderintags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		String url="https://www.bing.com/search?FORM=U523DF&PC=U523&q=ipc+sections+list";
		driver.navigate().to(url);
		
		
		ExtentReports extentreports=new ExtentReports();
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter(".\\reports\\report.html");
	
		
		
		sparkreporter.viewConfigurer().viewOrder().as(new ViewName[]{
		ViewName.TEST,
		ViewName.DASHBOARD,
		ViewName.EXCEPTION,
		ViewName.CATEGORY,
		ViewName.DEVICE
		
		}).apply();
		
		extentreports.attachReporter(sparkreporter);
		
		sparkreporter.config().setTheme(Theme.DARK);
		sparkreporter.config().setReportName("Com.test");
		sparkreporter.config().setDocumentTitle("Document");
		
		extentreports.createTest("Test1","Testdescription")
		.assignAuthor("Rameshbabu")//Author information
		.assignCategory("Sanity")//Category
		.assignDevice("Chrome")//device name
		.pass("This is failed Test");
		
		extentreports.createTest("Test2","Testdescription2")
		.assignAuthor("RameshbabuGvs")
		.assignCategory("Sanity1")
		.assignDevice("Chrome99")
		.fail("This is failed Test1");
		
		extentreports.createTest("Test3","Testdescription3")
		.assignAuthor("RameshbabuGvs","Mahesh","Naresh")
		.assignCategory("Sanity1","Smoke","Regression")
		.assignDevice("Chrome99","IE","Edge")
		.pass("This is failed Test1");
		
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
		
		
		
		
		
		extentreports.flush();
		
		
		
	}

}
