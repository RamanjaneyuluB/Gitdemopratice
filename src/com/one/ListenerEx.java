package com.one;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testNg.Reports;

public class ListenerEx implements ITestListener {
	
	ExtentReports extentReports = Reports.reports();
	ExtentTest test;
	
	@Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub	
		System.out.println("Ram");
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub		
    	System.out.println("Ram");
    	System.out.println("Ram");
    	System.out.println("Ram");
    	System.out.println("Ram");
    	System.out.println("Ram");
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        // TODO Auto-generated method stub	
    	test.log(Status.PASS, "Test Passed");
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
        // TODO Auto-generated method stub
    	test.fail(result.getThrowable());
        		
    }		

    @Override		
    public void onTestStart(ITestResult result) {					
        // TODO Auto-generated method stub	
    	test=extentReports.createTest(result.getMethod().getMethodName());
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }		

}
