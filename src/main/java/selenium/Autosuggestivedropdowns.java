package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdowns {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(300);
		driver.switchTo().frame("notification-frame-~19715a043");
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		//driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']")).click();
		driver.findElement(By.id("fromCity")).click();
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Mum");//FromPlace
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("toCity")).click();
        driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Del");
        driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ENTER);

	}
}
