package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy {
	  @Test
	  public void n() 
	  {
		  Reporter.log("N",true);
	  }
	  @Test(enabled = false)
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
