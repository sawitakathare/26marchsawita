package TestNGIncludeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
	 @Test
	  public void n() 
	  {
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
