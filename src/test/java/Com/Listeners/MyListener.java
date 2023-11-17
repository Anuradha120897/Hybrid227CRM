package Com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import Com.TestCases.Baseclass;

public class MyListener extends Baseclass implements ITestListener{

	
	Status status;
	public void onTestStart(ITestResult result) {
		System.out.println("Test started--->"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success--->"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		//screenshot code
		System.out.println("Test is failed--->"+result.getName());
		String path=Baseclass.getScreenshot(result.getName());
		
		
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped--->"+ result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		
	}

	

	
}
