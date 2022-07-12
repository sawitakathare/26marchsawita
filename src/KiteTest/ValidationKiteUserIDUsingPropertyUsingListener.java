package KiteTest;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;
import KitePOMUsingTestNGExcel.KiteHomePage;

import KiteUtility.UtilityProp;
@Listeners(KiteUtility.Listener.class)
public class ValidationKiteUserIDUsingPropertyUsingListener extends Base{
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	
	@BeforeClass
	
	public void launchBrowser() 
	{
		OpenBrowser();
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
		login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickContinueButton();
		
		
		
	}
  @Test
  public void validationUserID() throws InterruptedException, IOException 
  {
   Assert.assertEquals(home.ActualUId(), UtilityProp.getDataFromPropertyFile("UN"));
	 Assert.fail();
	
  }
  @AfterMethod
  public void logOutFromKite() throws InterruptedException
  {
	  home.logOut();
  }
  @AfterClass
  public void closeBrowser() 
  {
	  driver.close();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
