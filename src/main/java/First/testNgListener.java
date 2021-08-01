package First;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * 
 */

/**
 * @author sahilsehgal
 *
 */
public class testNgListener implements ITestListener{

	public void onFinish(ITestContext arg0) {
		System.out.println(arg0.getName() +" got finished");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println(arg0.getName() +" got started");		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println(arg0.getName() +" got failed");		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println(arg0.getName() +" got started");		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println(arg0.getName() +" got passed");		
	}

}
