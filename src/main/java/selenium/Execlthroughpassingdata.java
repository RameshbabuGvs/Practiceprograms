package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execlthroughpassingdata {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();//inilization of browser 
		driver.manage().window().maximize();
		driver.navigate().to("https://onlineap.meeseva.gov.in/CitizenPortal/userinterface/citizen/Registration.aspx");//navigate the URL
		Thread.sleep(200);
		String file="F:\\LoginData.xlsx";
		FileInputStream fis=new FileInputStream(file);//reading purpose
		XSSFWorkbook wb= new XSSFWorkbook(fis);//WorkbookObkect
		int sheetcount = wb.getNumberOfSheets();//it count the sheets count work book
	System.out.println("Sheet Count"+sheetcount);
	XSSFSheet sheetname=wb.getSheet("Sheet1");
	System.out.println("SheetName"+sheetname);
	XSSFRow RowCount=sheetname.getRow(0);
	int RowsCount=sheetname.getLastRowNum()+1;
	System.out.println("Rows Count"+RowsCount);
	String UserName=sheetname.getRow(1).getCell(0).getStringCellValue();
	String Aadhar=sheetname.getRow(3).getCell(0).getStringCellValue();
	String FirstName=sheetname.getRow(3).getCell(1).getStringCellValue();
	System.out.println(UserName);
	Thread.sleep(200);
	driver.findElement(By.xpath("//input[@name='txtusername']")).sendKeys(UserName);
	Thread.sleep(200);
	driver.findElement(By.xpath("//input[@name='txtadharno']")).sendKeys(Aadhar);
	Thread.sleep(100);
	driver.findElement(By.xpath("//input[@name='txtfirstname']")).sendKeys(FirstName);
	wb.close();}
}
