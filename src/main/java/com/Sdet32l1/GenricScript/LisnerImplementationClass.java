package com.Sdet32l1.GenricScript;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LisnerImplementationClass implements ITestListener {
	ExtentSparkReporter spark;
	ExtentReports extentReports;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On test start");
		 test = extentReports.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test sucess");
		test.log(Status.PASS, result.getMethod().getMethodName()+"is pass");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On test failure");
		test.log(Status.FAIL, result.getMethod().getMethodName()+"is failed");
		test.log(Status.FAIL, result.getThrowable());
		
		WebDriverMethods webDriverMethods=new WebDriverMethods();
		try {
			test.addScreenCaptureFromPath(webDriverMethods.takesScreenShot(BaseClass.staticdriver, result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test Skipped");
		test.log(Status.FAIL, result.getMethod().getMethodName()+"is skipped");
		test.log(Status.FAIL, result.getThrowable());
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On start");
		 spark=new ExtentSparkReporter("./extentReporter/extentReport.html");
		spark.config().setDocumentTitle("documentTitle");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("ReporterName");
		
		 extentReports=new ExtentReports();
		extentReports.attachReporter(spark);
		extentReports.setSystemInfo("Environment", "TestNg Environment");
		extentReports.setSystemInfo("Reporter Name", "Pavithra B S");
		extentReports.setSystemInfo("Platform", "Windows 10");
		extentReports.setSystemInfo("Unit Testing tool", " TestNg");
		extentReports.setSystemInfo("Build management tool", "Maven");
		extentReports.setSystemInfo("Automation tool", "Selenium");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On test Finish");
		extentReports.flush();
		
	}

	
}
