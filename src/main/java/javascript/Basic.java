package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Basic {
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.navigate().to("https://www.facebook.com/");
	      
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	       Thread.sleep(3000);


	JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;

	//WebElement element=(WebElement) jsExecutor.executeScript("return document.getElementById('email');");
	//element.sendKeys("Ramgvs4");

	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:12px red solid;background:yellow;');");


	WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
	jsExecutor.executeScript("arguments[0].setAttribute('style','border:12px red solid;background:yellow;');",username);
	Thread.sleep(3000);

	jsExecutor.executeScript("document.getElementById('email').click();");
	//sendkeys
	jsExecutor.executeScript("document.getElementById('email').value='HYR';");//send keys
	//boarder
	jsExecutor.executeScript("document.getElementById('email').style.border='12px blue solid';background='yellow'");
	Thread.sleep(3000);
	jsExecutor.executeScript("document.getElementById('email').style.border='12px yellow dashed';");

	Thread.sleep(3000);
	//with boarder highligt
	jsExecutor.executeScript("document.getElementById('email').style.border='12px yellow dotted';");

	Thread.sleep(3000);
	//with out boarder
	jsExecutor.executeScript("document.getElementById('email').style.border='12px yellow';");

	//with out color and boarder
	jsExecutor.executeScript("document.getElementById('email').style.border='12px';");

	//with boarder and with out color if we are given it takes default black boarder color
	jsExecutor.executeScript("document.getElementById('email').style.border='12px dotted';");
	//back ground color
	jsExecutor.executeScript("document.getElementById('email').style.background='yellow';");
	jsExecutor.executeScript("document.getElementById('email').style.background='Red';");
	//boarder+Back ground
	jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:5px red solid;background:yellow');");

	//inside text colorchanging
	jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:5px red solid;background:yellow;color:blue');");

	//scrolling 3 methods
	//Scroll/scrollTO
	//ScrollBY
	//scrollintoview
	//jsExecutor.executeScript("window.scrollTo(0,5);");

	//jsExecutor.executeScript("window.scrollBy(0,5);");
	//scroll to particular point
	jsExecutor.executeScript("document.getElementById('reg_pages_msg').scrollIntoView();");



		}
		
		

	}


