package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");	
			
			
			
			String beforexpath="//*[@id='customers']/tbody/tr[";
			String afterxpath="]/td[1]";
			
			List<WebElement>rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
			int rowcount=rows.size();
			System.out.println("Total rows in web table :" +rowcount);
			for(int i=2;i<=rowcount;i++) {
				String actualxpath=beforexpath+i+afterxpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			if(element.getText().equals("Ernst Handel")) {
				System.out.println("Company name :"+element.getText()+ " is found" +"at position:--"+(i-1));
				break;
			}
			}
	
		String beforexpathcontact="//*[@id='customers']/tbody/tr[";
			String afterxpathcontact="]/td[2]";
			for(int i=2;i<=rowcount;i++) {
				String actualxpath=beforexpathcontact+i+afterxpathcontact;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			if(element.getText().equals("Ernst Handel")) {
				System.out.println("Company name :"+element.getText()+ " is found");
				System.out.println("Company name :"+element.getText()+ " is found" +"at position"+i);
				break;
			}
			}
			
			//String beforexpathcontact="//*[@id='customers']/tbody/tr[";
			String afterxpathcountry="]/td[3]";
			for(int i=2;i<=rowcount;i++) {
				String actualxpath=beforexpathcontact+i+afterxpathcountry;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			if(element.getText().equals("Ernst Handel")) {
				System.out.println("Contact name :"+element.getText()+ " is found"+"at position"+i);
				System.out.println("Country name :"+element.getText()+ " is found" +"at position"+i);
				break;
			}
			}
			//Handling coloumns in webtable
			//*[@id="customers"]/tbody/tr[1]/th[1]
			//*[@id="customers"]/tbody/tr[1]/th[2]
			//*[@id="customers"]/tbody/tr[1]/th[3]
			String coloumnbeforexpath= "//*[@id='customers']/tbody/tr[1]/th[";
			String coloumnafterxpath="]";
			
			
			List<WebElement>coloumns=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
			int coloumnscount=coloumns.size();
			System.out.println("Total coloumns in web table :" +coloumnscount);
			for(int i=1;i<=coloumnscount;i++) {
				String coloumnactualxpath=coloumnbeforexpath+i+coloumnafterxpath;
			WebElement element=driver.findElement(By.xpath(coloumnactualxpath));
			System.out.println(element.getText());
			if(element.getText().equals("Roland Mendel")) {
				System.out.println("Coloumn name :"+element.getText()+ " is found" +"at position"+(i-1));
				break;
			}
			}	
	}

}
