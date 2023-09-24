package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("D:\\Testdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
	    XSSFSheet sheet=workbook.getSheet("RegTestData");
	    XSSFRow row=sheet.getRow(1);
	    XSSFCell cell=row.getCell(0);
	

	}

}
