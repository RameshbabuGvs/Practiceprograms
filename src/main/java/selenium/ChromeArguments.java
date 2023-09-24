package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeArguments {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
 driver.navigate().to("https://www.browserstack.com/guide/maximize-chrome-window-in-selenium");
		
		
		
	}

}
