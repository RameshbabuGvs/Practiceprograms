package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupsinselenium {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "D://Softwares//chromedriver.exe");

		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/alerts");
		System.out.println("Browswer opened");
		driver.findElement(By.xpath("//button[text()='Click me' and @id='promtButton']")).click();
		
		driver.switchTo().alert().sendKeys("Ram");// for entering text in popup we can use Sendkeys method
		String str=driver.switchTo().alert().getText();// for get text in popup we can use get text method
		System.out.println(str);
		driver.switchTo().alert().accept();// for clicking ok button use accept() method 
		
		driver.findElement(By.xpath("//button[text()='Click me' and @id='promtButton']")).click();
		driver.switchTo().alert().dismiss();//for Clicking cancel button use dissmiss method
		
	}

}
