package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handletablegridsinwebpage {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait w = new WebDriverWait(driver,5);
	
	
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cricbuzz.com/live-cricket-scorecard/30409/rcb-vs-dc-19th-match-indian-premier-league-2020");
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));//it helps to find the entire table 
int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();//it finds the row size
System.out.println(+rowcount+"rowvaluescount");
int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
System.out.println(count);
for (int i=0;i<count-2;i++) {
	System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
	
}

System.out.println(driver.findElement(By.xpath("(//div[text()='Extras']/following-sibling::div[1])[1]")).getText());//---It gets the All lastsecond row values
	
System.out.println(driver.findElement(By.xpath("(//div[text()='Total']/following-sibling::div[1])[1]")).getText());
	}

}
