package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		driver.manage().window().maximize();
		driver.navigate().to("https://onlineap.meeseva.gov.in/CitizenPortal/userinterface/citizen/Registration.aspx");//navigate the URL
		Thread.sleep(100);
		// ((TakesScreenshot)driver)---It takes the screen shot for Browser
				// getScreenshotAs(OutputType.FILE);---It stores the screen shot in File
				// format
				// src stores the Image
				// Fileutils stores th e src to local machine

File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        
            FileUtils.copyFile(screenshot, new File("D:\\homePageScreenshot1.JPEG"));
           
	}

}
