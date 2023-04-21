package com.qa.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener

{
	public void onTestStart(ITestResult result) {
	        System.out.println("Test case started: " + result.getName());
	    }
	    
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test case passed: " + result.getName());
	    }
	    
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test case failed: " + result.getName());
	    }
	    
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test case skipped: " + result.getName());
	    }
	    
	    public void onStart(ITestContext context) {
	        System.out.println("Test suite started: " + context.getName());
	    }
	    
	    public void onFinish(ITestContext context) {
	        System.out.println("Test suite finished: " + context.getName());
	    }

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
	

}
