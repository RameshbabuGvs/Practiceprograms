package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessIncognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

//chrome options
ChromeOptions co = new ChromeOptions();
co.addArguments("--headless--");

WebDriver driver=new ChromeDriver(co);
driver.navigate().to("https://flipkart.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.quit();



	}

}

