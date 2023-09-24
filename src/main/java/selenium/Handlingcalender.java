package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingcalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "D:\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//WebDriverWait w = new WebDriverWait(driver,5);
	
		driver.manage().window().maximize();
		driver.navigate().to("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
             while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("March")){
	              driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
             }
		List<WebElement>dates = driver.findElements(By.className("day"));
		int count =driver.findElements(By.className("day")).size();
		System.out.println(count);
		for(int i=0;i<count;i++){
			
			
		String text=driver.findElements(By.className("day")).get(i).getText();
		System.out.println(text);
		if (text.equalsIgnoreCase("23")){
			
			driver.findElements(By.className("day")).get(i).click();
			System.out.println("Sucessfully selected");
			break;
		}
		}
		
	}

}

