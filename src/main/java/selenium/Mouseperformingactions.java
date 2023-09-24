package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouseperformingactions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		driver.manage().window().maximize();
		driver.navigate().to("https://onlineap.meeseva.gov.in/CitizenPortal/userinterface/citizen/Registration.aspx");
	WebElement Text=driver.findElement(By.xpath("//input[@name='txtusername']"));
	Text.sendKeys("123456789");
	// Copy the Current Address
	Text.sendKeys(Keys.CONTROL);
	Text.sendKeys("A");
	Text.sendKeys(Keys.CONTROL);
	Text.sendKeys("C");
	//Press the TAB Key to Switch Focus to Permanent Address
    Text.sendKeys(Keys.TAB);
		
  //Paste the Address in the Permanent Address field
    WebElement Aadhar=driver.findElement(By.xpath("//input[@name='txtfirstname']"));
    Aadhar.sendKeys(Keys.CONTROL);
    Aadhar.sendKeys("V");
		
    
	}

}
