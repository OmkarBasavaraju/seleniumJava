package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	public ExtentReports extentReport() {
		ExtentSparkReporter extent = new ExtentSparkReporter("C:\\Users\\IGSA937002\\eclipse-workspace\\PageObjectModelPageFactory\\target\\extent.html");
		extent.config().setReportName("PageFactoryModel");
		extent.config().setTheme(Theme.STANDARD);
		ExtentReports report = new ExtentReports();
		report.attachReporter(extent);
		return report;
	}

}
