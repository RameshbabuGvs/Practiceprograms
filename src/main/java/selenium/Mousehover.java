package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\jars\\chromedriver.exe");  
  		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[text()='More']"));
		//Moves Specfic element
		a.moveToElement(move).perform();
	
		
		//Entering Keyboard keys(Capital letter,Small letters)
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//Mouse Rightclickmopertions
		//a.moveToElement(move).contextClick().build().perform();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		

		
		
	}

}
