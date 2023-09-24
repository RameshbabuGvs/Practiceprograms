package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebtablepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://ui.freecrm.com/contacts");	
			
			driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("rameshbabugvs@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ramesh123$");
			driver.findElement(By.xpath("//div[text()='Login']")).click();
			
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]
			
			String beforexpath="//*[@id='main-content']/div/div[2]/div/table/tbody/tr[";
			String afterxpath="]/td[2]";
			
			//List<WebElement>rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
			//int rowcount=rows.size();
			//System.out.println("Total rows in web table :" +rowcount);
			for(int i=2;i<=7;i++) {
				//String actualxpath=beforexpath+i+afterxpath;
			//WebElement element=driver.findElement(By.xpath(actualxpath));
				WebElement name = driver.findElement(By.xpath(beforexpath+ i + afterxpath));
				
			System.out.println(name);
			if(name.equals("Mahesh babu")) {
				 driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/table/tbody/tr["+i+"]/td[2]+")).click();
				
				break;
			}
			}
	
		
		
		
	}

}
