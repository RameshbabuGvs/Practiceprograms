package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reusablmethods {

	public static void flash(WebElement element,WebDriver driver) throws InterruptedException {
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor=element.getCssValue("backgroundColor");
		
		for(int i=0;i<500;i++) {
			changeColor("Yellow",element,driver);
		 changeColor(bgcolor,element,driver);
	}
		
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
	}
	
	
	public static void clickandhighlight( WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		js.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:yellow;');", element);
		element.click();
		
	}
	//boarderandhighlight by using JS
	public static void boarderandhighlight( WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		js.executeScript("arguments[0].setAttribute('style','border:10px red solid;background:yellow;');", element);
	}
	//get title by using js
	public static String  getTitleByJs(WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	//js popup message
	public static void  generatealert(WebDriver driver,String message) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		js.executeScript("alert('"+message+"')");
	}
	//refreshmethod
	
	public static void  jsrefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("history.go(0)");
	}
	//scrollintoview
	
		public static void  scrollintoview(WebDriver driver,WebElement element) {
			// TODO Auto-generated method stub
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("arguments[0].scrollIntoView(true);",element);
		}
		
	public static void  jsScrollupDown(WebDriver driver,int X,int Y) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo('"+X+"','"+Y+"');");
	}

	public static void  ScrollpageDown(WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrolTo(0,document.body.scrollHeight)");
	}
	
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
	
public static String CaptureScreenshotBase64format(WebDriver driver) {
		
		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
		String base64code=takescreenshot.getScreenshotAs(OutputType.BASE64);
	
	System.out.println("Screen shot saved");
	return base64code;
	
	}


public static void Extentreportwithbase64format(WebDriver driver) {
	ExtentReports extentreports=new ExtentReports();
	ExtentSparkReporter sparkreporter=new ExtentSparkReporter(".\\reports\\report.html");
	extentreports.attachReporter(sparkreporter);

	extentreports.createTest("Screenshot Test 1","This is for Attaching  the screenshot to the test at test level")
	.info("This is info message")
	.addScreenCaptureFromBase64String(CaptureScreenshotBase64format(driver));//write like this also
	extentreports.flush();//flush means it cleans the previous reports
}



public static void Extentreportwithoutbase64format(WebDriver driver,String filename) {
	ExtentReports extentreports=new ExtentReports();
	ExtentSparkReporter sparkreporter=new ExtentSparkReporter(".\\reports\\report.html");
	extentreports.attachReporter(sparkreporter);

	extentreports.createTest("Screenshot Test 3","This is for Attaching  the screenshot to the test at test level")
	.info("This is info message")
	.addScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver,"Google.jpg"));//write like this also
	extentreports.flush();//flush means it cleans the previous reports

}


public static void Extentreportwithtestlevel(WebDriver driver,String filename) {
	ExtentReports extentreports=new ExtentReports();
	ExtentSparkReporter sparkreporter=new ExtentSparkReporter(".\\reports\\report.html");
	extentreports.attachReporter(sparkreporter);
	
	extentreports.createTest("Screenshot Test 3","This is for Attaching  the screenshot to the test at test level")
	.info("This is info message")
	.addScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver,"Google.jpg"));//write like this also
	extentreports.flush();//flush means it cleans the previous reports

}

public static void Extentreportwithloglevel(WebDriver driver,String filename) {
	ExtentReports extentreports=new ExtentReports();
	ExtentSparkReporter sparkreporter=new ExtentSparkReporter(".\\reports\\report.html");
	extentreports.attachReporter(sparkreporter);
	
	extentreports.createTest("Screenshot Test 9","This is for Attaching  the screenshot to the test at log level")
	.info("This is info message")
	.pass(MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver, "Google.jpg"),"Test9").build())
	.pass(MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshotbyaddingfilename(driver, "Google.jpg"),"Test9").build());
	
	extentreports.flush();//flush means it cleans the previous reports
}

}
