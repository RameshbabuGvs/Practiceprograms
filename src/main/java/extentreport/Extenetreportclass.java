package extentreport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extenetreportclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExtentReports extentreports=new ExtentReports();
		//File file=new File(".\\reports\\report.html");
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter(".\\reports\\report.html");
		extentreports.attachReporter(sparkreporter);
		System.out.println("HI");
		
		
	ExtentTest test1=extentreports.createTest("Test1");//this method is used for cretion test with name
		test1.pass("This is Pass");
		
		//ExtentTest test2=extentreports.createTest("Test1");//this method is used for cretion test with name
		//test2.log(Status.FAIL, "This is Failed");
		
		extentreports.createTest("Test1").skip("This is Skipped");//write like this also
		
		
		extentreports.
		createTest("Test1")
		.log(Status.INFO,"Info1")
		.log(Status.INFO,"INfo2")
		.log(Status.WARNING, "Warning")
		.log(Status.SKIP, "SKIP")
		.log(Status.FAIL, "FAIL");
		
		
		extentreports.flush();//flush means it cleans the previous reports
		
		//String file=".\\reports\\report.html";
		//Desktop.getDesktop().browse(new File(file).toURI());
		
		
		
		
		
	}

}
