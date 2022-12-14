package com.mylistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.baseclass.BaseClass;
import com.utils.DriverUtils;

public class MyListener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
	test = reports.createTest(result.getName());
		
	}

    public void onTestSuccess(ITestResult result) {
	test.log(Status.PASS, "TestCase Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "TestCase Failed");
		try {
		String pathString = DriverUtils.getScreenshot(result.getName());
		test.addScreenCaptureFromPath(pathString);
		}catch(Exception e) {
			e.printStackTrace();
		}
	 }

	
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "TestCase Skipped");
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onStart(ITestContext context) {
		
		
	}

	
	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

}
