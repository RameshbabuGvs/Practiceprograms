package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximizewindowdeletingcookies {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//if u want to delete all cookies use this
		driver.manage().deleteCookieNamed("asdf");//if u want to delete specific cookie use this
		driver.navigate().to("https://google.com");

	}

}
