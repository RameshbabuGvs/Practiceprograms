package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframes {



		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
	   	System.setProperty("webdriver.chrome.driver", "D:\\Documents\\chromedriver.exe");
			
	    	WebDriver driver=new ChromeDriver();
	    	
			WebDriverWait w = new WebDriverWait(driver, 60);
			driver.manage().window().maximize();
	    	// Implicit wait
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.navigate().to("https://jqueryui.com/droppable/");
			System.out.println("Before clicking");
			int size=driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);
			//driver.switchTo().frame("//iframe[@class='demo-frame']");
			driver.switchTo().frame(0);
			System.out.println("Switched to frame ");
			driver.findElement(By.xpath("//p[text()='Drag me to my target']")).click();
			System.out.println("HI");
			driver.switchTo().defaultContent();
			System.out.println("After switching come back to default");
			driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		System.out.println("Sucessfully cliking the element");
		
		}

	}
