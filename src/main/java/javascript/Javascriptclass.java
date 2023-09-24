package javascript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Reusablmethods;

import utilities.Reusablmethods;





	
	public class Javascriptclass {

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub

			
			 // TODO Auto-generated method stub
	    	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	    	
			WebDriver driver= new ChromeDriver();
			driver.navigate().to("https://www.twoplugs.com/");
			driver.manage().window().maximize();
			
			WebElement btnJoinnowfree=driver.findElement(By.xpath("(//a[@class='btn green'])[1]"));
			Reusablmethods rm=new Reusablmethods();
			
			WebElement btnsignup=driver.findElement(By.xpath("//span[@class='w-icons-circle1_1']"));
			
			//Reusablmethods.clickandhighlight(btnJoinnowfree, driver);
			//during the runningh alert window visible
		    //Reusablmethods.generatealert(driver, "btnJoinnowfree has been clicked");
			// Reusablmethods.jsrefresh(driver);
		    //Reusablmethods.jsrefresh(driver);
		    
		 
		 // Reusablmethods.scrollintoview(driver, btnsignup);
		 
		   //Reusablmethods.ScrollpageDown(driver);
		   System.out.println("Hi");
		    Reusablmethods.jsScrollupDown(driver, 0, 350);
		    System.out.println("Hi");
		    
		    /*
			 //boarder highlight
			Reusablmethods.boarderandhighlight(btnJoinnowfree, driver);
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Target=new File("D://Softwares/twoplus.png");
			FileUtils.copyFile(src, Target);
		
	     //capturing the get title by JS
			String Title=Reusablmethods.getTitleByJs(driver);
		    System.out.println(Title);
		    
		    */
		    
		    
		}

	}
