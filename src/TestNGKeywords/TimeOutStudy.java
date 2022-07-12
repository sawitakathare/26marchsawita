package TestNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy {
	 @Test(timeOut = 1200)
	  public void n() throws InterruptedException 
	  {
		 Thread.sleep(1000);
		  Reporter.log("N",true);
	  }
	  @Test
	  public void p() 
	  {
		  Reporter.log("P",true);
		 
	  }
	  @Test
	  public void a() 
	  {
		  Reporter.log("A",true);
	  }
}
