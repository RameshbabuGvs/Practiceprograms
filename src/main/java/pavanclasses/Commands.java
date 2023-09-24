package pavanclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
//WebDriver driver = new ChromeDriver();	
driver.navigate().to("https://www.spicejet.com/default.aspx");

driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

//Conditional Commands
//ISDisplayed,ISEnabled,ISSelected
}
}
