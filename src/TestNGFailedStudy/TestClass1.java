package TestNGFailedStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
	@Test
	  public void a() 
	  {
		Assert.fail();
		  Reporter.log("a is running, sanity",true );
	  }
	  @Test
	  public void b() 
	  {
		  Reporter.log("b is running, regression",true );
	  }
	  @Test
	  public void c() 
	  {
		  Reporter.log("c is running, sanity",true );
	  }
	  @Test
	  public void d() 
	  {
		  Assert.fail();
		  Reporter.log("d is running, regression",true );
	  }
}
