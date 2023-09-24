package excelreader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreading {

public static void main(String[]args) throws IOException{
		
		String file="F:\\Testdata.xlsx";
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);//workbook object
		int sheetscount = wb.getNumberOfSheets();
		System.out.println("Total no of Sheets in Workbook"  + sheetscount);
		XSSFSheet sheet=wb.getSheet("Sheet1");//here get the Sheet name
		
		XSSFRow rowvalue=sheet.getRow(0);//it means it takes the index row(header)
		int rowCount=sheet.getLastRowNum()+1;//+1 means index start from 0
		System.out.println("Total number of Rows in sheet is"  + rowCount);
	    int colCount=rowvalue.getLastCellNum();//it takes LastCell num
		System.out.println("Total number of Columns in sheet is  "  + colCount);
		
		for(int i=1;i<rowCount;i++){
			
			String UserName=sheet.getRow(i).getCell(1).getStringCellValue();				
					System.out.println("Data of the Row1 and coloumn1 data--  "+i+"is"+UserName);
		}
		/*//if u want to send Eachrow,Coloumn wise use below Script
		String UserName=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(UserName);
		*/
		wb.close();
		
		
		
	}

}
