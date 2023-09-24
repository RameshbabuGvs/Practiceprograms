package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

	File src=new File("F:\\Testdata3.xlsx");
	 // load file
	   FileInputStream fis=new FileInputStream(src);
	 
	   // Load workbook
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	   // Load sheet- Here we are loading first sheetonly
	      XSSFSheet sheet= wb.getSheet("Sheet");
	 String data=sheet.getRow(0).getCell(0).getStringCellValue();
	  System.out.println(data);
	  
	}

	
	
}
