package datadriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import java.io.FileInputStream;
 
public class ExcelApiTest
{
   public FileInputStream fis = null;
   public static XSSFWorkbook workbook = null;
   public static XSSFSheet sheet = null;
   public static XSSFRow row = null;
   public static XSSFCell cell = null;
 // String xlFilePath;
 
  // public ExcelApiTest(String xlFilePath) throws Exception
   public ExcelApiTest() throws Exception
   {
     //  this.xlFilePath = xlFilePath;
	   
	   String xlFilePath="D:\\Testdata.xlsx";
       fis = new FileInputStream(xlFilePath);
       workbook = new XSSFWorkbook(fis);
       fis.close();
   }
 
   public int getRowCount(String sheetName)
   {
       sheet = workbook.getSheet(sheetName);
       int rowCount = sheet.getLastRowNum()-1;
       return rowCount;
   }
 
   public int getColumnCount(String sheetName)
   {
       sheet = workbook.getSheet(sheetName);
       row = sheet.getRow(0);
       int colCount = row.getLastCellNum();
       return colCount;
   }
   
   

   public static String getCellData(String sheetName, String colName, int rowNum)
   {
       try
       {
           int col_Num = -1;
           sheet = workbook.getSheet(sheetName);
           row = sheet.getRow(0);
           for(int i = 0; i < row.getLastCellNum(); i++)
           {
               if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
                   col_Num = i;
           }

           row = sheet.getRow(rowNum - 1);
           cell = row.getCell(col_Num);

           if(cell.getCellTypeEnum() == CellType.STRING)
               return cell.getStringCellValue();
           else if(cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA)
           {
               String cellValue = String.valueOf(cell.getNumericCellValue());
               if(HSSFDateUtil.isCellDateFormatted(cell))
               {
                   DateFormat df = new SimpleDateFormat("dd/MM/yy");
                   Date date = cell.getDateCellValue();
                   cellValue = df.format(date);
               }
               return cellValue;
           }else if(cell.getCellTypeEnum() == CellType.BLANK)
               return "";
           else
               return String.valueOf(cell.getBooleanCellValue());
       }
       catch(Exception e)
       {
           e.printStackTrace();
           return "row "+rowNum+" or column "+colName +" does not exist  in Excel";
       }
   }
	   
	
	   
   }
