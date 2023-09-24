package excelreader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datareader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String file="F:\\Testdata3.xlsx";

FileInputStream fis=new FileInputStream(file);
XSSFWorkbook wb=new XSSFWorkbook(fis);
int sheetcoutn=wb.getNumberOfSheets();
System.out.println("Sheet count is ---"+sheetcoutn);
XSSFSheet Sheet=wb.getSheet("Sheet1");
XSSFRow rowvalue=Sheet.getRow(0);
int rowCount=Sheet.getLastRowNum()+1;
System.out.println("Total number of rows--"+rowCount);
int colcount=rowvalue.getLastCellNum();
System.out.println("Total number of Columns--"+colcount);
//if u want to send Eachrow,Coloumn wise use below Script
String UserName=Sheet.getRow(1).getCell(1).getStringCellValue();
System.out.println(UserName);
		
	}

	
}
