package extentreport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Reusablmethods;

public class AttchscreenshotwithExtentreport {
	
static WebDriver driver;
public static String CaptureScreenshotbyaddingfilename(WebDriver driver,String fileName) {
	
	TakesScreenshot takescreenshot=(TakesScreenshot) driver;
	File sourceFile=takescreenshot.getScreenshotAs(OutputType.FILE);
	File destFile= new File("./Screenshots/"+fileName);
try {

	FileUtils.copyFile(sourceFile, destFile);
}
catch(Exception e){
	e.printStackTrace();
}
System.out.println("Screen shot saved");
return destFile.getAbsolutePath();

}

public static String CaptureScreenshotBase64format() {
	
	TakesScreenshot takescreenshot=(TakesScreenshot) driver;
	String base64code=takescreenshot.getScreenshotAs(OutputType.BASE64);

System.out.println("Screen shot saved");
return base64code;

}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.bing.com/search?FORM=U523DF&PC=U523&q=ipc+sections+list");
		
		
		ExtentReports extentreports=new ExtentReports();
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter(".\\reports\\report.html");
		extentreports.attachReporter(sparkreporter);
	
		Reusablmethods rm=new Reusablmethods();
		
		
	
		extentreports.createTest("Screenshot Test 1","This is for Attaching  the screenshot to the test at test level")
		.info("This is info message")
		.addScreenCaptureFromBase64String(Reusablmethods.CaptureScreenshotBase64format(driver));//write like this also
		
		extentreports.createTest("Screenshot Test 1","This is for Attaching  the screenshot to the test at test level")
		.info("This is info message")
		.addScreenCaptureFromBase64String(CaptureScreenshotBase64format());//write like this also
		
		extentreports.createTest("Screenshot Test 2","This is for Attaching  the screenshot to the test at test level")
		.info("This is info message")
		.addScreenCaptureFromBase64String(CaptureScreenshotBase64format(),"Google home page");//write like this also
		
		
		extentreports.createTest("Screenshot Test 3","This is for Attaching  the screenshot to the test at test level")
		.info("This is info message")
		.addScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver, "Google.jpg"));//write like this also
		
		extentreports.createTest("Screenshot Test 4","This is for Attaching  the screenshot to the test at test level")
		.info("This is info message")
		.addScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver, "Google.jpg"),"S3");//write like this also
		
		Throwable t=new Throwable("This is throwable exception");
		extentreports.createTest("Screenshot Test 8","This is for Attaching  the screenshot to the test at log level")
		.info("This is info message")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(CaptureScreenshotBase64format(),"mainpage").build())
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(CaptureScreenshotBase64format(),"mainpage").build());
		
		extentreports.createTest("Screenshot Test 9","This is for Attaching  the screenshot to the test at log level")
		.info("This is info message")
		.pass(MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver, "Google.jpg"),"Test9").build())
		.pass(MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver, "Google.jpg"),"Test9").build());
		
		extentreports.createTest("Screenshot Test 10","This is for Attaching  the screenshot to the test at log level")
		.info("This is info message")
		.fail(t,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver, "Google.jpg")).build())
		.fail(t,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver, "Google.jpg")).build());
		
		
		
		
		extentreports.flush();//flush means it cleans the previous reports
	driver.close();
	}

	
	
}
