package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiplenewTabshandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\jars\\chromedriver.exe");  
        
		WebDriver driver=new ChromeDriver();//inilization of browser 
		driver.navigate().to("https://www.goibibo.com/");
		
		
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();

		
		//String Parent=driver.getWindowHandle();
		WebElement Flights=driver.findElement(By.xpath("//a[text()='Flights']"));
		WebElement Hotels=driver.findElement(By.xpath("//a[text()='Hotels']"));
		WebElement Trains=driver.findElement(By.xpath("//a[text()='Trains']"));
		WebElement Cabs=driver.findElement(By.xpath("//a[text()='Cabs']"));
		
		Actions actions=new Actions(driver);
		//if u are Handling new Tabs u can use below code
		actions.keyDown(Keys.CONTROL).click(Flights).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.keyDown(Keys.CONTROL).click(Hotels).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.keyDown(Keys.CONTROL).click(Trains).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.keyDown(Keys.CONTROL).click(Cabs).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
	String parentwindow=driver.getWindowHandle();
		Set<String>windows=driver.getWindowHandles();
		for(String winID:windows) {
			if(!winID.equals(parentwindow)) {
				driver.switchTo().window(winID);
				String Currenttitle=driver.getTitle();
  if(Currenttitle.
   equals("Book Train Tickets Online, Use IRCTC Login - Goibibo")) {
	System.out.println("Tab has been matched");
  driver.switchTo().window(parentwindow);}
    else {
    	System.out.println("Tab has been not matched");
    }
	driver.switchTo().window(parentwindow);
				}}
		
		System.out.println("Now switch to parent window");
		System.out.println("Now switch to:"+driver.getTitle());
driver.quit();
	}
	
	
}
