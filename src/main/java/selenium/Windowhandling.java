package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();//inilization of browser 
		
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		System.out.println("Before switching");
	
		  String mainWindowHandle = driver.getWindowHandle();//this is for only one window
		//Set<String> ids = driver.getWindowHandles();//this is for if i have more than one window we can use windowHandles method
	//Set is collection concept it takes only unique(it doesnot accept Duplicates) values
		//iterrator helps the iterates the windows count
		
		ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Total windows Open:"+tabs.size());
		
		
		/*Iterator<String> it = ids.iterator();
		//Parent id
		String parentid = it.next();
// I want to move the child window 
		String childwindow = it.next();
		
		//now i am sucessfully move parent to child
		driver.switchTo().window(childwindow);
		Thread.sleep(20);
		System.out.println(driver.getTitle());
		Thread.sleep(30);
		driver.findElement(By.xpath("//span[text()='Google Account']")).click();
		System.out.println("Sucessfully switched 3rdwindow");
		
		*/
		driver.quit();
		
		}

}
