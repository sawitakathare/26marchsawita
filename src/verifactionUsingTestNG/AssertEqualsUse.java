package verifactionUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void MyMethod() 
  {
	  String a= "Pune";
	  String b= "pune";
	  
	  //Assert.assertEquals(a, b);
	  //Reporter.log("a and b values are matching TC PASSED",true);
	  
	  Assert.assertNotEquals(a,b);
	  Reporter.log("a and b values are not mtching TC Passed",true);
  }
}
