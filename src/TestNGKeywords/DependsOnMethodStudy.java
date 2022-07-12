package TestNGKeywords;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodStudy {
	 @Test
	  public void n() 
	  {
		  Reporter.log("N",true);
	  }
	  @Test(dependsOnMethods = {"a"},priority=-1)
	  public void p() 
	  {
		  Reporter.log("P",true);
	  }
	  @Test
	  public void a() 
	  {
		 // assert.fail();
		  Reporter.log("A",true);
	  }
}
