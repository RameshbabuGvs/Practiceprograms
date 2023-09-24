package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeathSearch {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Actions actions = new Actions(driver);
		
		driver.navigate().to("https://ok2explore.health.ok.gov/App");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Search Birth Records']")).click();
		Thread.sleep(5);
		//BirthScenario1
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		//FirstName
		driver.findElement(By.xpath("//label[text()='First Name:']//following::input[1]")).sendKeys("Walter");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		
		//MiddleName
		driver.findElement(By.xpath("//label[text()='Middle Name:']//following::input[1]")).clear();
		driver.findElement(By.xpath("//label[text()='Middle Name:']//following::input[1]")).sendKeys("D");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		//Death Month
		driver.findElement(By.xpath("//label[text()='Date of Death:']//following::input[1]")).sendKeys("9");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		
		//GenderSelection
		driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[2]")).click();
		WebElement GenderSelection=driver.findElement(By.xpath("(//input[@class='select2-search__field'])"));
		
		GenderSelection.sendKeys("Male");
		Thread.sleep(2);
		GenderSelection.sendKeys((Keys.DOWN));
		Thread.sleep(2);
		GenderSelection.sendKeys(Keys.ENTER);
		Thread.sleep(2);
		
		//Deathcounty
		driver.findElement(By.xpath("(//select[@class='form-control'])[1]")).click();
		WebElement Birthcounty2=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		
		Birthcounty2.sendKeys("Female");
		Thread.sleep(2);
		Birthcounty2.sendKeys((Keys.DOWN));
		Thread.sleep(2);
		Birthcounty2.sendKeys(Keys.ENTER);
		Thread.sleep(2);
		
		//Searchbutton
		//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		System.out.println("All details are Opened Sucessufully");
		
		
		
		//BirthScenario2
		
		//FirstName
		     driver.findElement(By.xpath("//label[text()='First Name:']//following::input[1]")).clear();
		        driver.findElement(By.xpath("//label[text()='First Name:']//following::input[1]")).sendKeys("Alex");
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				
				//BirtYear
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[3]")).clear();
				Thread.sleep(5);
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[3]")).sendKeys("1985");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				
				
					
				//DateRange
				driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[1]")).click();
				
				WebElement DaterangeSearchbox=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
				DaterangeSearchbox.sendKeys("+/-2 years");
				DaterangeSearchbox.sendKeys((Keys.DOWN));
				Thread.sleep(2);
				DaterangeSearchbox.sendKeys(Keys.ENTER);
				Thread.sleep(2);
				
				
				//SearchButton
				//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
				
				//BirthScenario3
				
			    //LastName
				driver.findElement(By.xpath("//label[text()='Last Name:']//following::input[1]")).clear();
				driver.findElement(By.xpath("//label[text()='Last Name:']//following::input[1]")).sendKeys("Johnson");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
			
				//Birtday
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[2]")).clear();
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[2]")).sendKeys("31");
				
				
				//Birthcounty
				driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[2]")).click();
				WebElement Birthcounty=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
				
				Birthcounty.sendKeys("Female");
				Thread.sleep(2);
				Birthcounty.sendKeys((Keys.DOWN));
				Thread.sleep(2);
				Birthcounty.sendKeys(Keys.ENTER);
				Thread.sleep(2);
				
				//Searchbutton
				//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
				
				
				//BirthScenario4
					//MiddleName
				driver.findElement(By.xpath("//label[text()='Middle Name:']//following::input[1]")).clear();
				driver.findElement(By.xpath("//label[text()='Middle Name:']//following::input[1]")).sendKeys("Roland");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				//BirthMonth
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[1]")).clear();
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[1]")).sendKeys("8");
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				//Searchbutton
				//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
				
				
				//BirthScenario5
				
				//FirstName
				driver.findElement(By.xpath("//label[text()='First Name:']//following::input[1]")).clear();
				driver.findElement(By.xpath("//label[text()='First Name:']//following::input[1]")).sendKeys("Joe*");
				
				//LastName
				driver.findElement(By.xpath("//label[text()='Last Name:']//following::input[1]")).clear();
				driver.findElement(By.xpath("//label[text()='Last Name:']//following::input[1]")).sendKeys("Smith");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				
				
				//MiddleName
				driver.findElement(By.xpath("//label[text()='Middle Name:']//following::input[1]")).clear();
				driver.findElement(By.xpath("//label[text()='Middle Name:']//following::input[1]")).sendKeys("Teddy");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				
				//BirthMonth
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[1]")).clear();
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[1]")).sendKeys("8");
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				

				//Birtday
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[2]")).clear();
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[2]")).sendKeys("16");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				
				
				//BirtYear
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[3]")).clear();
				Thread.sleep(5);
				driver.findElement(By.xpath("//label[text()='Birth Date:']//following::input[3]")).sendKeys("1986");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				
				
				//GenderSelection2
				driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[2]")).click();
				WebElement GenderSelection2=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
				
				GenderSelection2.sendKeys("Female");
				Thread.sleep(2);
				GenderSelection2.sendKeys((Keys.DOWN));
				Thread.sleep(2);
				GenderSelection2.sendKeys(Keys.ENTER);
				Thread.sleep(2);
				
				
				
			//Searchbutton	
				//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
				
		

	}

}

