package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateget {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");  
			
			WebDriver driver=new ChromeDriver();//inilization of browser 
			
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");//navigate the URL
			Thread.sleep(6000);
			driver.findElement(By.xpath("//a[text()='Sign in']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
			Thread.sleep(6000);
		  driver.navigate().back();
		  Thread.sleep(6000);
	   	driver.navigate().forward();
	   	Thread.sleep(6000);
		
		driver.navigate().refresh();
	   driver.close();
	   System.out.println("Sucessfully browser closed");
		
	}

}
