package extentreport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Extentreportlogs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExtentReports extentreports=new ExtentReports();
		//File file=new File(".\\reports\\report.html");
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter(".\\reports\\report.html");
		extentreports.attachReporter(sparkreporter);
		System.out.println("HI");
		
	
		
		extentreports.createTest("Test1").skip("This is Skipped");//write like this also
		
		
		extentreports.
		createTest("Text based Test")//write like this also for creation of testcase
		.log(Status.INFO,"<i>Info1</i>")//thi is for italic letter format
		.log(Status.INFO,"<b>INFO2</b>");//this is bold letters
		
		String xmldata="<menu id=\"file\" value=\"File\">\r\n"
				+ "  <popup>\r\n"
				+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
				+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
				+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
				+ "  </popup>\r\n"
				+ "</menu>";
		
		String Jsondata="{\"menu\": {\r\n"
				+ "  \"id\": \"file\",\r\n"
				+ "  \"value\": \"File\",\r\n"
				+ "  \"popup\": {\r\n"
				+ "    \"menuitem\": [\r\n"
				+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
				+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}}";
		
extentreports.createTest("XML Based Test").info(MarkupHelper.createCodeBlock(xmldata,CodeLanguage.XML));
		
extentreports.createTest("Json Based Test").log(Status.INFO,MarkupHelper.createCodeBlock(Jsondata,CodeLanguage.JSON));



List<String> listData=new ArrayList<>();
listData.add("Ramesh");
listData.add("Ramesh babu");
listData.add("GVSRameshBabu");

Map<Integer,String> mapData=new HashMap<>();
mapData.put(101, "Ramesh");
mapData.put(102, "Ramesh babu");
mapData.put(103, "GVSRameshBabu");

Set<Integer> setData=mapData.keySet();

extentreports.
createTest("List based Test")
.info(MarkupHelper.createOrderedList(listData))
.info(MarkupHelper.createUnorderedList(listData));

extentreports.
createTest("Set based Test")
.info(MarkupHelper.createOrderedList(setData))
.info(MarkupHelper.createUnorderedList(setData));

extentreports
.createTest("map based Test")
.info(MarkupHelper.createOrderedList(mapData))
.info(MarkupHelper.createUnorderedList(mapData));

extentreports
.createTest("Highlighting log test")
.info(MarkupHelper.createLabel( "This is Highlighted message", ExtentColor.RED));
		
		try {
			int i=5/0;
		}
		catch(Exception e) {
			extentreports
			.createTest("Expection Test2")
			.fail(e);
		}
		
		
		Throwable t=new RuntimeException("This is a custom exception");
		extentreports
		.createTest("Exception Test2")
		.fail(t);
		extentreports
		.createTest("Exception Test3")
		.fail(t);
		
		extentreports.flush();//flush means it cleans the previous reports
		
	}

}
