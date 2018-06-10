package week5day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test= extent.createTest("TC001_Createlead", "Create a new lead in leaf tab");
		test.assignCategory("smoke");
		test.assignAuthor("Dheeraj");
		test.pass("The data entered successfully");
		test.pass("Lead created successfully");
		extent.flush();

	}

}
