package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicschechbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
//WebDriver driver = new ChromeDriver();	
driver.navigate().to("https://www.spicejet.com/default.aspx");

driver.manage().window().maximize();

/**for(int i=1;i<5;i++){

 //Normal dropdown methods
Select s = new Select(driver.findElement(By.xpath("//Select[@id='ctl00_mainContent_DropDownListCurrency']")));
s.selectByValue("AED");
Thread.sleep(200);
s.selectByVisibleText("INR");
Thread.sleep(200);
s.selectByIndex(3);}
Thread.sleep(200);
**/

/**
//easy to find out the size of the checkboxes
System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
//Assertion model
Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
Assert.assertFalse(false);

//is Selected method
System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	
**/

System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
//driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight ui-state-active ui-state-hover")).click();
	
	
	}

}
