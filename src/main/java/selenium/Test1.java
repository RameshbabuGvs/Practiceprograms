package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("HI");	
		

		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe"); 
		
		  WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.navigate().to("https://aprtacitizen.epragathi.org/#!/availableslots");
		
		Thread.sleep(800);
		//Actions actions = new Actions(driver);
		Select s=new Select(driver.findElement(By.xpath("//select[@name='serviceType']")));
		Thread.sleep(800);
		s.selectByVisibleText("LLR");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[text()='Check Availability']")).click();
		

	}

}
