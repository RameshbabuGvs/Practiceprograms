package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");  
				
				WebDriver driver=new ChromeDriver();//inilization of browser 
				
				driver.manage().window().maximize();
				driver.navigate().to("https://www.facebook.com/");//navigate the URL
				Thread.sleep(200);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prabhanjan.in@gmail.com");
				

				Thread.sleep(200);
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password");
				Thread.sleep(100);
				driver.findElement(By.xpath("//button[@name='login']")).click();
				
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				String expectedTitle = "Facebook";
				if(actualTitle.contains(expectedTitle)) {
					System.out.println("Title matched");
				}else {
					System.out.println("Title is not matched");
				}
				driver.close();	
			}

}
