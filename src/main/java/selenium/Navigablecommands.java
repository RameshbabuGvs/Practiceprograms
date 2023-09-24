package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigablecommands {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "D:\\Documents\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        
       driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        
           //driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
           
           driver.manage().window().maximize();
      	System.out.println("navigable commands execution started");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		
		System.out.println("navigable commands");
		
		//driver.close();// it is used for closing only one respective tab
		//driver.quit();//it is used for closing entire browser.
		
	}

}
