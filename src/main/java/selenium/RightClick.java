package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");//for right click  comment 
		driver.navigate().to("https://www.google.co.in/");
		Actions a = new Actions(driver);

        //Double click on element

		//WebElement trialaction = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
         /// a.doubleClick(trialaction).perform();
           Thread.sleep(3000);
           
           
           //right click
         WebElement rightclick = driver.findElement(By.xpath("//input[@name='q']"));
          Thread.sleep(3000);
          a.moveToElement(rightclick).contextClick().build().perform();
          System.out.println("after right click");
          
        //double click
          WebElement doubleclicks = driver.findElement(By.xpath("//input[@name='q']"));
          doubleclicks.sendKeys("Ramesh");
          a.doubleClick(doubleclicks).perform();
          System.out.println("after double click");
          
        
          
		
		
		
		
	}

}
