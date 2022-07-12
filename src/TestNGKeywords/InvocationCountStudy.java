package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount = 4)
  public void UserIDValid() 
  {
	  Reporter.log("Good Evening",true);
  }
  @BeforeMethod
  public void key()
  {
	  Reporter.log("Yes",true);
  }
}
