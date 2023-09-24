package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver();// inilization of browser

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iframe")).size();
		for(int i=0; i<=size; i++){ driver.switchTo().frame(i); int
		  total=driver.findElements(By.xpath("html/body/a/img")).size();
		  System.out.println(total); 
		  driver.switchTo().defaultContent(); }
		 
		//driver.switchTo().frame(1);
		driver.switchTo().frame("a077aa5e");
		 driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();

		
		  
	}

}
