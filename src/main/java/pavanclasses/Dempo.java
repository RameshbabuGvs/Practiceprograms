package pavanclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.browserstack.com/guide/maximize-chrome-window-in-selenium");
	}

}
