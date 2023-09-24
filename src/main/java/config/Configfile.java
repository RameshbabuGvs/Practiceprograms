package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configfile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
readPropetiesFile();
	}

	public static void readPropetiesFile() throws IOException, InterruptedException {
		String filepath="D:\\workspace\\Learningproject\\src\\main\\java\\config\\Configfile";
		
		FileInputStream fis= new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(fis);

		System.out.println(prop.getProperty("Password"));
		System.out.println(prop.getProperty("url"));
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\jars\\chromedriver.exe");  
		
		//WebDriver driver=new ChromeDriver();//inilization of browser 
		
		
	}
	
	
}
