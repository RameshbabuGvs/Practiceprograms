package selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


	public class Filterthewebtableusigjavastreams {
		
		public static void main(String[] args){

		//public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//*[@id='search-field']")).sendKeys("Rice");
		List<WebElement> veggies=driver.findElements(By.xpath("//tr//td[1]"));
		System.out.println(veggies);
		//1 result
		List<WebElement> filteredList=veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		System.out.println(filteredList);
		//1 Result
		Assert.assertEquals(veggies.size(), filteredList.size());

	}}

