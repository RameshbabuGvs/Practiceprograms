package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionclass {

	
	static WebDriver driver=new ChromeDriver();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "D:\\Documents\\chromedriver.exe");
		
		WebDriverWait w = new WebDriverWait(driver, 60);
		driver.manage().window().maximize();
    	// Implicit wait
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  
		driver.manage().window().maximize();
		driver.navigate().to("https://www.easemytrip.com/?msclkid=19a45e5aa1901cbda34c3ce03eb3a604&utm_source=bing&utm_medium=cpc&utm_campaign=Brand%20RLSA%20(EaseMyTrip.Com)&utm_term=easemytrip%20com&utm_content=EaseMyTrip%20Misspell%20Exact");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("(//a[text()='More '])[1]"));
		
		//Moves Specfic element
		//a.moveToElement(move).perform();//it is click method
		System.out.println("click the element");
		a.moveToElement(move).build().perform();//for mouse hover we can use move to element 
	}

}

