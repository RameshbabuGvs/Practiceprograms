package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicseleniumclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Setting system properties of ChromeDriver
System.setProperty("webdriver.chrome.driver", "D://Softwares//chromedriver.exe");

//Creating an object of ChromeDriver
WebDriver driver = new ChromeDriver();
//WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://registration.ap.gov.in/chatbot-0.0.1-SNAPSHOT/");
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[text()='RTI Act']")).click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//driver.findElement(By.xpath("(//a[@class='nav-link'])[6]")).click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println("Element clicked");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		
	}

}
