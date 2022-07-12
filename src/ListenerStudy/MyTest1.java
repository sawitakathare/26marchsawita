package ListenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest1 {
	 @Test
	  public void TC4() 
	  {
		  Reporter.log("TC4 is Running",true);
	  }
	  @Test
	  public void TC5() 
	  {
		  Assert.fail();
		  Reporter.log("TC5 is Running",true);
	  }
	  @Test(dependsOnMethods = "TC5")
	  public void TC6() 
	  {
		  
		  Reporter.log("TC6 is Running",true);
	  }
}
