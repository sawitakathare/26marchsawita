package KiteTest;



import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMUsingTestNG.KiteHomePage;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;
import KiteUtility.Utility;




public class ValidationKiteUserIDCrossBrowserTesting extends Base 
{
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	@Parameters("Browser name")
	@BeforeClass
	public void launchBrowser(String name)
	{
		CrossBrowserSetup(name);
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(Utility.readDataFromExcel(4, 0));
		login.sendPassword(Utility.readDataFromExcel(4, 1));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromExcel(4, 2));
		pin.clickContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.ActualUId(), Utility.readDataFromExcel(4, 0),"Actual and Expected are not matching Tc is failed");
  }
  @AfterMethod
  public void logOutFromKiteApp() throws InterruptedException 
  {
	 home.logOut(); 
  }
  
  @AfterClass
  public void closeBrowser() 
  {
	  driver.close();
  }
  
}
