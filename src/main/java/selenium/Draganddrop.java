package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/droppable/");
		
		Actions Actions = new Actions(driver);
		 
		WebElement from = driver.findElement(By.id("draggable"));
		 
		WebElement to = driver.findElement(By.id("droppable"));	
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//Perform drag and drop
		Actions.dragAndDrop(from, to).perform();
		
		
		
		
	}
}
