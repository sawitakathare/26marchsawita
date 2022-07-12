package ListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;




public class Listener implements ITestListener

{
@Override
public void onTestFailure(ITestResult result)
{
	Reporter.log("screenshot taken please check TC",true);
	Reporter.log("failed TC name is "+result.getName(),true);

}
@Override
	public void onTestSuccess(ITestResult result) 
{

    Reporter.log("TC is passed",true);
    Reporter.log("Success TC name "+result.getName(),true);
	}
@Override
	public void onTestSkipped(ITestResult result) 
{
		Reporter.log("TC is skipped please check dependant mehtod",true);
		Reporter.log("skipped TC name is "+result.getName(),true);
	}

	
}
