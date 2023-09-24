package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "D:\\Documents\\chromedriver.exe");
		
    	WebDriver driver=new ChromeDriver();
    	
		WebDriverWait w = new WebDriverWait(driver, 60);
		driver.manage().window().maximize();
    	// Implicit wait
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  
		//WebDriverWait w = new WebDriverWait(driver,5);
    	
    	//Explicit wait
   

		driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flights']"))).click();
	
		
		//driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='findFlights']"))).click();
		
		
		
		
	}

}
