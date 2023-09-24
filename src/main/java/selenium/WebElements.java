package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		
		driver.manage().window().maximize();
		driver.navigate().to("https://onlineap.meeseva.gov.in/CitizenPortal/userinterface/citizen/Registration.aspx");//navigate the URL
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@name='txtusername']")).sendKeys("ramgvs4gmail.com");
		

		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='txtAnswer']//following::input[@name='txtemailId']")).sendKeys("ramgvs4@gmail.com");
		Thread.sleep(100);
		//driver.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("ramgvs4@gmail.com");
		
		
		String ActuallabelValue=driver.findElement(By.xpath("(//p[@class='lable_item'])[1]")).getText();
		System.out.println(ActuallabelValue);
		
		String ExpectedLabelvalue="Desired Login ID1 *";
		System.out.println(ExpectedLabelvalue);
		
		if(ExpectedLabelvalue == ActuallabelValue) {
			Thread.sleep(150);
			driver.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("ramgvs4@gmail.com");
		}
		else {
			System.out.println("Test is fail");
		}
	//	String email=driver.findElement(By.xpath("//input[@id='txtConfirmEmail']")).getTagName();
		//System.out.println(email);
		
		Thread.sleep(150);
		//driver.findElement(By.xpath("//input[@name='btnsubmitReg']")).click();
	}
}
