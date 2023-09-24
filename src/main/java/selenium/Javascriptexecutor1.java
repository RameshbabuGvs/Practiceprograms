package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutor1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		WebElement element=(WebElement) jsExecutor.executeScript("return document.getElementById('email');");
		
		element.click();
		element.sendKeys("Ramgvs4");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
