package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFindelement {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		
		driver.manage().window().maximize();
		driver.navigate().to("https://onlineap.meeseva.gov.in/CitizenPortal/userinterface/citizen/Registration.aspx");//navigate the URL
      	Thread.sleep(200);
         driver.findElement(By.xpath("//input[@name='txtusernam']")).sendKeys("Ramesh");	
	//List<WebElement>Element=driver.findElements(By.xpath("//p[@class='lable_ite']"));
		//	System.out.println(Element.size());
				
	
	}

}
