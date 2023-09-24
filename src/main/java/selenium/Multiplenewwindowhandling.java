package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import authenticationpopups.SwitchWindow;

public class Multiplenewwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\jars\\chromedriver.exe");  
        
		WebDriver driver=new ChromeDriver();//inilization of browser 
		driver.navigate().to("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		String Parent=driver.getWindowHandle();
		WebElement Flights=driver.findElement(By.xpath("//a[text()='Flights']"));
		WebElement Hotels=driver.findElement(By.xpath("//a[text()='Hotels']"));
		WebElement Trains=driver.findElement(By.xpath("//a[text()='Trains']"));
		WebElement Cabs=driver.findElement(By.xpath("//a[text()='Cabs']"));
		
		Actions actions=new Actions(driver);
		//if u are Handling new Windows u can use below code
		actions.keyDown(Keys.SHIFT).click(Flights).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		actions.keyDown(Keys.SHIFT).click(Hotels).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		actions.keyDown(Keys.SHIFT).click(Trains).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		actions.keyDown(Keys.SHIFT).click(Cabs).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		
		//actions.keyDown(Keys.CONTROL).click(Cabs).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		
		Set<String>windows=driver.getWindowHandles();
		System.out.println("Total windows open "+windows.size());
		SwitchWindow switchWIndow=new SwitchWindow(driver);
		
		switchWIndow.toTitle("Flight Tickets, Flights Booking at Lowest Airfare, Book Air Tickets-Goibibo");
		
		System.out.println("Now switch to:"+driver.getTitle());
		
		switchWIndow.toTitle("Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo");
		
		System.out.println("Now switch to:"+driver.getTitle());
		
		switchWIndow.toTitle("Book Train Tickets Online, Use IRCTC Login - Goibibo");
		
		System.out.println("Now switch to:"+driver.getTitle());
		
		//switchWIndow.toTitle("Cab Booking - Outstation cabs, Car Rental, Taxi & Cars Booking");
		//System.out.println("Now switch to:"+driver.getTitle());
		
		driver.switchTo().window(Parent);
		System.out.println("Now switched to"+driver.getTitle());
		
		driver.quit();
		//if u are Handling new Tabs u can use below code
		
		
	}

}
