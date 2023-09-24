package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshotmethod {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		 driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.navigate().to("https://google.com");
           getScreenshot(driver, "Loginpage");
            Thread.sleep(50);
            
		// ((TakesScreenshot)driver)---It takes the screen shot for Browser
		// getScreenshotAs(OutputType.FILE);---It stores the screen shot in File
		// format
		// src stores the Image
		// Fileutils stores the src to local machine
    // driver.close();	
	}
	
	/*public static void screeshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fs=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("D:\\workspace\\LearningJava1\\screenshot\\"+timestamp()+".png"));}
	
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());}
*/
	public static String getScreenshot(WebDriver driver,String screenshotName) throws IOException {
		String dateName=new SimpleDateFormat("yyyyMMdd hh mm ss").format(new Date());
		 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		 
		 String destination =System.getProperty("user.dir")+"/screenshots/" + screenshotName+dateName+ ".png";
			File finaDestination=new File(destination);
			FileUtils.copyFile(source, finaDestination);
			return destination;
		 
	 }
}
