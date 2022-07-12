package TestNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  @Test(priority = 3)
  public void n() 
  {
	  Reporter.log("N",true);
  }
  @Test(priority = 1)
  public void p() 
  {
	  Reporter.log("P",true);
	 
  }
  @Test(priority = 2)
  public void a() 
  {
	  Reporter.log("A",true);
	 
  }
}
