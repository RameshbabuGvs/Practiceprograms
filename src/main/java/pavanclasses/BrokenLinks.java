package pavanclasses;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	//private static WebDriver driver = null;

    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
           driver.navigate().to("https://www.amazon.in/?ie=U	TF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAjw-qeFBhAsEiwA2G7Nl470gswIvPHK5d32UEAIdPtjyxEHBSve4KZpe_RLw_Xo9fXt98uJixoCWG8QAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjw-qeFBhAsEiwA2G7Nl470gswIvPHK5d32UEAIdPtjyxEHBSve4KZpe_RLw_Xo9fXt98uJixoCWG8QAvD_BwE");
           driver.manage().window().maximize();
           
          // 1.Get the list of all links and images
           
           List<WebElement> linkslist=driver.findElements(By.tagName("a"));
           
          System.out.println(linkslist.size());
          
           linkslist.addAll(driver.findElements(By.tagName("img")));
           System.out.println("Size of the full links and Images"+linkslist.size());
           
           List<WebElement> activelinks=new ArrayList<WebElement>();
           //2.iterator links list
           for(int i=0;i<linkslist.size();i++){
        	   System.out.println(linkslist.get(i).getAttribute("href"));
        	   if(linkslist.get(i).getAttribute("href")!=null){
        	   
        	   activelinks.add(linkslist.get(i));
           }
     }
           
    System.out.println("Size of the Active links and Images"+activelinks.size());
    
    
    //3 check  the href url,with http connection  Api;
    //200--Ok
    //404--not found
    //500--Internal error
    //400--bad request
    for(int j=0;j<activelinks.size();j++){
    	
    	HttpURLConnection connection= (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
    			connection.connect();
    			String response=connection.getResponseMessage();
    			connection.disconnect();
    			System.out.println(activelinks.get(j).getAttribute("href")  +"--->"+response);
    }  
}}


