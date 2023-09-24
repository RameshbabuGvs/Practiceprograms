package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//WebDriverWait w = new WebDriverWait(driver,5);
		
			driver.manage().window().maximize();
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
			System.out.println(driver.findElements(By.tagName("a")).size());//if helps to find the no.of links in a page
			WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
			System.out.println(footerdriver.findElements(By.tagName("a")).size());//it helps to find the only Footer links
			
			WebElement Coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul[1]"));
			System.out.println(Coloumndriver.findElements(By.tagName("a")).size());//It helps to find out only Coloumn links
			//4.Click on each coloumns link opening or not	
			for(int i=1;i<Coloumndriver.findElements(By.tagName("a")).size();i++){
				
				String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				
				Coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
				Thread.sleep(5000L);
				
			}
	//This For loop for Opening All tabs
			
				Set<String> abc = driver.getWindowHandles();
				Iterator<String>it = abc.iterator();
				
				while(it.hasNext()){
					//hasNext()---Means it verifies the Next window is available or not
					//Next()--Means It moves the Next window with out verification
					
					driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				}
			}
			
		}




