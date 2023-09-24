package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickDoubleclick {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Double click the button to launch an alertbox
		Actions action = new Actions(driver);
		
		WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		action.doubleClick().perform();
		
		Thread.sleep(300);
		//Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		Thread.sleep(300);
		alert.accept();
		
		//Right Click the buttton
		WebElement RighClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.contextClick(RighClick).perform();

		driver.close();	}

}
