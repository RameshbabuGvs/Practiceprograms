package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		
		driver.navigate().to("https://onlineap.meeseva.gov.in/CitizenPortal/userinterface/citizen/Registration.aspx");
		
	//Select S= new Select(driver.findElement(By.xpath("//select[@name='ddlcountry']")));//select methid for dropdown
	//S.selectByIndex(6);
	Select S1= new Select(driver.findElement(By.xpath("//select[@name='ddlcountry']")));
	S1.selectByVisibleText("India");
	Select state= new Select(driver.findElement(By.xpath("//select[@name='ddlState']")));
	state.selectByValue("5");
			//SelectType.selectByIndex(2); 
	
	}

}
