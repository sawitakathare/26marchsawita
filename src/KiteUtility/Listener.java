package KiteUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends UtilityProp implements ITestListener
{
@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("Welcome your TC is passed TC name is "+result.getName(),true);
	
}
@Override
	public void onTestFailure(ITestResult result) 
{
		Reporter.log("TC is failed and TC name is "+result.getName(),true);
		try {
			UtilityProp.captureScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
		
	
}
