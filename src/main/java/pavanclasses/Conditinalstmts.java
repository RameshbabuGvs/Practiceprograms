package pavanclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditinalstmts {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
//WebDriver driver = new ChromeDriver();	
driver.navigate().to("https://book.spicejet.com/LoginAgent.aspx");

driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
WebElement Username=driver.findElement(By.xpath("//input[@id='ControlGroupLoginAgentView_AgentLoginView_TextBoxUserID']"));

WebElement Password=driver.findElement(By.xpath("//input[@id='ControlGroupLoginAgentView_AgentLoginView_PasswordFieldPassword']"));

if(Username.isDisplayed()){
	Username.sendKeys("Rameshbabu");
}

if(Username.isEnabled()){
	Username.clear();
}
	
	}
}
