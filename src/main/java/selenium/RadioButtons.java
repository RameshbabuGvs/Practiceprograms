package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		
		driver.manage().window().maximize();
		driver.navigate().to("https://onlineap.meeseva.gov.in/CitizenPortal/userinterface/citizen/Registration.aspx");//navigate the URL
		Thread.sleep(200);
		
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@name='txtusername']")).sendKeys("ramgvs4gmail.com");
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='txtAnswer']//following::input[@name='txtemailId']")).sendKeys("ramgvs4@gmail.com");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("ramgvs4@gmail.com");
		Thread.sleep(200);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(200);
		//driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(200);
		
		
	}

}
