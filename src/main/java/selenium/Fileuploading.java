package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		   //driver.navigate().to("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705384516477&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
		  driver.get("https://www.foundit.in/seeker/registration");
		  WebElement upload=driver.findElement(By.xpath("//input[@id='file-upload']"));
		  upload.sendKeys("C:\\Users\\HP\\Downloads\\kiran Mamidala.docx");
		  System.out.println("Sucessfully uploaded");
		
	}

}
