package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		
		driver.manage().window().maximize();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Ramesh");
		String Text=driver.switchTo().alert().getText();
		Thread.sleep(2000);
		System.out.println(Text);
	}

}
