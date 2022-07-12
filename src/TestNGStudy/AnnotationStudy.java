package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy {
  @Test
  public void UserIdValidation() 
  {
	  Reporter.log("User id is valid",true);
  }
  @BeforeMethod
  public void KiteLogin() 
  {
	  Reporter.log("Login sucessful",true);
  }

  @AfterMethod
  public void KiteLogout() 
  {
	  Reporter.log("Logout sucessful",true);
  }

  @BeforeClass
  public void KiteLaunch() 
  {
	  Reporter.log("Browser Launched",true);
  }

  @AfterClass
  public void BrowserClose() 
  {
	  Reporter.log("Browser closed",true);
  }
  @Test()
  public void DashboardValidation()
  {
	  Reporter.log("Valid Dashboard",true);
  }

}
