package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriventest {

	
	@Test(dataProvider="wordpress")
	public void loginTowordpress(){
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().to("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/login-page");
	
	driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("Ram");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Ramesh");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
}
	
	@DataProvider(name="wordpress")
	public Object[][] passData(){
		
		//Array format
	Object[][] data =new Object[3][2];//it means 3 rows 2 coloumns
	
	data [0][0]="admin1";
	data[0][1]="admin2";
	
	data [1][0]="admin1";
	data[0][1]="admin123";
			
	data[2][0]="admi3";
	data[2][1]="admin3";
	
	return data;
	
	
	
	}
}