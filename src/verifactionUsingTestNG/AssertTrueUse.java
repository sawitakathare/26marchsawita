package verifactionUsingTestNG;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void myMethod() 
  {
	  boolean a= true;
	  boolean b= false;
	  
	 // Assert.assertTrue(b,"TC us failed value is false");
	  // Reporter.log("a and b values are matching TC PASED",true);
	  
	  Assert.assertFalse(a, "TC is failed value is true");
	  Reporter.log("TC is passed value is false",true);
  }
}
