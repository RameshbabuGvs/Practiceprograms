package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendingarrayofproductstocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
           //Array it takes less memeory
		 int j=0;
		String[] itemsNeeded = {"Brocolli","Cucumber"};
       driver.get("https://rahulshettyacademy.com/seleniumPractise/");
       Thread.sleep(300);
       
     List<WebElement> products=  driver.findElements(By.cssSelector("h4.product-name"));
       
     
     for(int i=0;i<products.size();i++) {
    	 
    	 String[] name = products.get(i).getText().split("-");
    	 String formattedName=name[0].trim();
    	 //convert Array into Arraylist for easy Search
    	 //check weather name your extractedis present in arrayor not	
    	 
    	 List itemsNeededlist=Arrays.asList(itemsNeeded);
    	 
    	 
    	 System.out.println("name of the products"+name);
    	 
    	
    	// if(name.contains("Cucumber")){--if u are using one item use this or two,more items use below
    	 if(itemsNeededlist.contains(formattedName)){
    		 j++;
    		 //if ok Click Addto cart button
    	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
    		 //index value is equal to cucumber button will be click
    	
    	if(j==2){
    		break;
    	}
    	/*break;--if u are arraylist concept not able to usebreak,intially we are used to find out the only one vegetable name Brocolli
    	that is thr the reason we are used break unnescerlly it checks the 30times in for loop once it is availbele 3rd iteration break the stmt.*/ 
    		 
    	 }
    	 
     }
       
	}

}
