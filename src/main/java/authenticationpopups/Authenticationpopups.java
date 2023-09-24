package authenticationpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");  
                                                   
		WebDriver driver=new ChromeDriver();//inilization of browser 
		driver.navigate().to("https://the-internet.herokuapp.com/basic_auth");
		
		
	}

}
