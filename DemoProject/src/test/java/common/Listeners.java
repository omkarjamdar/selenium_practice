package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners extends TestUtils implements ITestListener  
{
	String screenshootFile="";
	public void onTestStart(ITestResult result)
	{
		Reporter.log("The method Name is: "+result.getName());
		System.out.println("Test case is starting");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is success");
		Reporter.log("The Status of "+result.getName() +" execution is: "+result.getStatus());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case is Failed - screenshot captured");
		try {
			screenshootFile = getScreenshot();
			screenshootFile=screenshootFile+".png";
			System.out.println(screenshootFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\omkar_jamdar\\eclipse-workspace\\DemoProject\\screenshot\\"+screenshootFile+"\">Test Result</a>");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		
	}
}
