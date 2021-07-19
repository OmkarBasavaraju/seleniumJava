package Listners;

import java.io.IOException;
import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import utilities.ExtentReport;
import utilities.screenShot;



public class TestNgListners implements ITestListener{
	public static ExtentTest test;
	
	ExtentReport Report = new ExtentReport();
	ExtentReports extentTest = Report.extentReport();
	
	
	public void onTestStart(ITestResult result) {
	test = extentTest.createTest(result.getMethod().getMethodName());
	}

	public void onStart(ITestContext context) {
		

	}

	public void onTestSkipped(ITestResult result) {
		

	}
	public void onTestFailure(ITestResult result) {
		String details = Arrays.toString(result.getThrowable().getStackTrace());
		String Text = "<Details><Summary>Click Below to see the failure reason</Summary>" + details + "</Details>";
		try {
			utilities.screenShot.tajeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Firsto");
		test.addScreenCaptureFromPath("C:\\Users\\IGSA937002\\eclipse-workspace\\PageObjectModelPageFactory\\target\\screenShot\\error.png", "Scrrenshot");
		System.out.println("First");
		Markup m = MarkupHelper.createLabel(Text, ExtentColor.RED);
		test.log(Status.FAIL, m);
	}

	public void onTestSuccess(ITestResult result) {
		
		Markup markup = MarkupHelper.createLabel("Passed", ExtentColor.GREEN);
		test.log(Status.PASS, markup);
	}

	public void onFinish(ITestContext context) {
	extentTest.flush();
	}

}
