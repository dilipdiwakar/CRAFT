package com.craft;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter
{

	 @Override
	  public void onTestFailure(ITestResult tr) {
		 System.out.println("FAIL "  + tr.getName());
	  }
	 
	  @Override
	  public void onTestSkipped(ITestResult tr) {
	    System.out.println("Skipped "  + tr.getName());
	  }
	 
	  @Override
	  public void onTestSuccess(ITestResult tr) {
		  System.out.println("Passed " + tr.getName());
	  }
	 

}
