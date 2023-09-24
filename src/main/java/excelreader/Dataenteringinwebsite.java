package excelreader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dataenteringinwebsite {


		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			 // TODO Auto-generated method stub
			 ExcelDataconfig excel= new ExcelDataconfig("F:\\Testdata3.xlsx");
		 		String name=excel.getData("Sheet", 1, 0);
		         System.out.println(name);
	    	System.setProperty("webdriver.chrome.driver", "D:\\Documents\\chromedriver.exe");
			
	    	WebDriver driver=new ChromeDriver();
	    	
			WebDriverWait w = new WebDriverWait(driver, 60);
			driver.manage().window().maximize();
	    	// Implicit wait
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
			driver.manage().window().maximize();
			driver.navigate().to("https://onlineap.meeseva.gov.in/CitizenPortal/userinterface/citizen/Registration.aspx");
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			Actions a = new Actions(driver); 
			driver.findElement(By.xpath("//input[@name='txtusername']")).sendKeys(name);
			System.out.println("Sucessfully data entered");

		}

	}


