package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		   //driver.navigate().to("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705384516477&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
		  driver.get("https://www.google.co.in/");
		   
		Actions actions = new Actions(driver);
		 WebElement Firstname=driver.findElement(By.xpath("//input[@name='q']"));
		 Firstname.sendKeys("Puma");
		 
		//actions.sendKeys(Keys.ARROW_DOWN);
		//actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		System.out.println("Sucessfully selected");
		/*
	 WebElement Firstname=driver.findElement(By.xpath("//input[@name='field-keywords']"));
	 Firstname.sendKeys("Puma");
	 //actions.sendKeys(Keys.BACK_SPACE);
	actions.sendKeys(Keys.ARROW_DOWN);
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	System.out.println("Sucessfully selected");*/
		
		// by using one element we can scroll down
		driver.findElement(By.xpath("(//a[@data-agch='HJ3bqe'])[2]")).sendKeys(Keys.ARROW_DOWN);
		System.out.println("Scrolled");
		driver.findElement(By.xpath("(//a[@data-agch='HJ3bqe'])[2]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//a[@data-agch='HJ3bqe'])[2]")).sendKeys(Keys.ARROW_DOWN);
	}
	
}
