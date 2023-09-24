package excelreader;

import java.io.IOException;

public class ReadExceldatabyusingExcelDataconfig {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelDataconfig excel= new ExcelDataconfig("F:\\Datasheet.xlsx");
		
		System.out.println(excel.getData("Sheet", 0, 0));

	}

}
