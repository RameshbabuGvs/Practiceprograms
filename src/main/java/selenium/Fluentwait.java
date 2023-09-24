package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait w = new WebDriverWait(driver,5);
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//driver.findElement(By.xpath("//button[text()='Start']")).click();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> ids = driver.getWindowHandles();
		//iterrator helps the iterates the windows count
		Iterator<String> it = ids.iterator();
		//Parent id
		String parentid = it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		
		driver.switchTo().window(parentid);
		
		
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Opening a new window']")));
		
		//w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='results']")));
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		//driver.switchTo().window(parentid);
		
	
	}
}
