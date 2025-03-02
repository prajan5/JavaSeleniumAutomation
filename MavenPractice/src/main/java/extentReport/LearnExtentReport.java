package extentReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		//set path for the report
		ExtentHtmlReporter er = new ExtentHtmlReporter("./reports/result.html");
		//report should not override
		er.setAppendExisting(true);
		//Create Object for Extent report
		ExtentReports  ers = new ExtentReports();
		//connect step 1 and step2
		ers.attachReporter(er);
		//create test case details (testname, testcase description)
		ExtentTest test = ers.createTest("LoginPage", "LeaftapsApplication");
		test.assignAuthor("Priya Rajan");
		test.assignCategory("Smoke");
		//set test step level status
		test.pass("Enter User Name");
		test.pass("Enter Password");
		test.pass("Click on login button");
		//add screen shot to the report 
		test.pass("crmsfa",MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot/leaptaps.png").build());
		//create test case details (testname, testcase description)
		ExtentTest test1 = ers.createTest("CreateLead", "LeaftapsApplicationforCreateLead");
		test1.assignAuthor("Samuel");
		test1.assignCategory("Sanity");
		//set test step level status
		test1.pass("crmsfa");
		test1.pass("Leads");
		test1.fail("Click on CRM/SFA");
		//close
		ers.flush();
		System.out.println("done");
		

	}

}
