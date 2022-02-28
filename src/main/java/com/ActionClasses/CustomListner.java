/**
 * 
 */
package com.ActionClasses;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.BaseClasses.BaseClass;

/**
 * @author Vaibhav Garse
 *
 */
public class CustomListner extends BaseClass implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("The test case execution is completed",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("The test has been started",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("this "+result.getMethod().getMethodName()+" is failed and the screenshot is taken in the screenshots folder",true);
		String methodname = result.getMethod().getMethodName();
		fail(methodname);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("the "+result.getMethod().getMethodName()+" is skipped ",true);
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("The demo.opencart. test cases will execute now onwards",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

}
