package extentreport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.Status;

public class Extentreport {
	
	 /*public static WebDriver driver;
	 public ExtentHtmlReporter htmlReporter;// this class is responsible for look and feelof the Report
	 public ExtentReports extent;
	 public ExtentTest test;// it is used for update the status testcase is pass or failure
	 
	 @BeforeTest
	 public void setExtent() {
		 
		 htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myreport.html");
		 htmlReporter.config().setDocumentTitle("Automation Report");//Title of the Report
		 htmlReporter.config().setReportName("Functional Report");// Name of the Report
		 htmlReporter.config().setTheme(Theme.DARK); //themeof the report
		 
		 extent=new ExtentReports();
		 extent.attachReporter(htmlReporter);
		 extent.setSystemInfo("Hostname", "localHost");
		 extent.setSystemInfo("OS","Windows");
		 extent.setSystemInfo("TesterName", "Ramesh");
		 extent.setSystemInfo("Browser", "Chrome");
		 
	 }
	 @AfterTest
	 public void endreport() {
		 
		 extent.flush();
	 }
@BeforeMethod
	 public void setup() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	 driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.navigate().to("https://www.nopcommerce.com/en/login?returnUrl=%2Fen");
    
}
	 @Test
	 public void nopcommerceTitle() {
		 
		 test=extent.createTest("nopcommerceTitle");
		 String title=driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals(title, "Login - nopCommerce");
	 }
	 @Test
	 public void nopcommerceTitle1() {
		 
		 test=extent.createTest("nopcommerceTitle");
		 String title=driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals(title, "Login - nopCommerce");
	 }
	 /*@Test
	 public void login() {
		 
		 driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("Rameshbabugvs");
		 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ramesh1213#");
	 }*/
	 
	 
	 
	 @AfterMethod
	 public void tearDown(ITestResult result) throws IOException {
		 
		 if(result.getStatus() ==ITestResult.FAILURE) {
			 
			 test.log(Status.FAIL, "TEST CASE FAILED IS "+ result.getName());//to add name in extent report
			 test.log(Status.FAIL, "TEST CASE FAILED IS "+result.getThrowable());//to add error /exception
			
			 String screenshotPath=Extentreport.getScreenshot(driver,result.getName());
			 
			 test.addScreenCaptureFromPath(screenshotPath);//adding screeshot
			 
		 }
		 else if(result.getStatus() == ITestResult.SKIP){
			 test.log(Status.SKIP, "Test Case SKIPPED IS "+result.getName());
		 }
		 else if (result.getStatus()==ITestResult.SUCCESS) {
			
			 test.log(Status.PASS, "Test Case PASSED IS"+result.getName());
  String screenshotPath=Extentreport.getScreenshot(driver,result.getName());
  		 test.addScreenCaptureFromPath(screenshotPath);//adding screeshot
			 
				}
		 
	 driver.quit();
	 }
	 
	 public static String getScreenshot(WebDriver driver,String screenshotName) throws IOException {
		String dateName=new SimpleDateFormat("yyyyMMdd hh mm ss").format(new Date());
		 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		 
		 String destination =System.getProperty("user.dir")+"/screenshots/" + screenshotName+dateName+ ".png";
			File finaDestination=new File(destination);
			FileUtils.copyFile(source, finaDestination);
			return destination;}
	   
	 
}
