package genericlib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListnersimplimentationClass  implements ITestListener
{
	public SeleniumUtility stil = new SeleniumUtility() ;
	
		@Override
		public void onTestStart(ITestResult result)
		{
			String methodName = result.getMethod().getMethodName();
			Reporter.log(methodName+"execution starts");
		}
		@Override
		public void onTestSuccess(ITestResult result)
		{
			String methodeName = result.getMethod().getMethodName();
			Reporter.log(methodeName+"execution pass");
		}
		@Override
		public void onTestFailure(ITestResult result)
		{
			String methodeName = result.getMethod().getMethodName();
			try
			{
				stil.captureScreenShot(".\\ScreenshotFolder\\", methodeName+".png");
			}
			catch(Exception e)
			{
				
			}
			
	
		}
}

