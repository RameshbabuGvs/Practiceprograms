package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitwait {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		
		driver.manage().window().maximize();
		driver.navigate().to("https://onlineap.meeseva.gov.in/CitizenPortal/userinterface/citizen/Registration.aspx");//navigate the URL
		Thread.sleep(100);
	
		
		driver.findElement(By.xpath("//input[@name='txtusername']")).sendKeys("ramgvs4gmail.");
		//Implicitwait(100);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='txtadharno']")).sendKeys("123456789");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Globally declred Implicitwait it is applicable to all elements

		driver.findElement(By.xpath("//input[@id='txtNewPassword']")).sendKeys("123456789");
		
//		Explicitwait(50);
		
			WebDriverWait wait = new WebDriverWait(driver, 5);
			
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='btnsubmitReg']"))).click();
	
		
	}

}

