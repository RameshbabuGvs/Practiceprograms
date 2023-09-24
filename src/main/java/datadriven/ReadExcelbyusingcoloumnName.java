package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelbyusingcoloumnName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//ExcelApiTest EAT=new ExcelApiTest("D:\\Testdata.xlsx");
		
		//for(int rownum =2;rownum<=5;rownum++){
		
		ExcelApiTest EAT=new ExcelApiTest();
		
		
		//String firstname="";
	String FirstName=ExcelApiTest.getCellData("RegTestData", "FirstName",2);
	String LastName=ExcelApiTest.getCellData("RegTestData", "LastName", 3);
	String MiddleName=ExcelApiTest.getCellData("RegTestData", "MiddleName", 4);
    String Dateofdeathmonth=ExcelApiTest.getCellData("RegTestData", "Dateofdeathmonth", 5);
		
   String Dateofdeathday=ExcelApiTest.getCellData("RegTestData", "Dateofdeathday", 5);
   WebDriver driver=new ChromeDriver();
   System.out.println(FirstName);
 //  driver.findElement(By.xpath(firstname)).sendKeys(FirstName);
	}
	
//}

}
