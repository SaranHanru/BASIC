package testNGTestScripts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestScript implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is going to execute");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is Failed");
	} 
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Failed with percentage");
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("before everything");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("After everything");
	}
}

