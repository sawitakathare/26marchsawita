package KitePOMUsingTestNGExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTestClass {
	
	WebDriver driver;
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	Sheet mySheet;
	@BeforeClass
	public void BorwserLaunch() throws EncryptedDocumentException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
  		driver= new ChromeDriver();
  		driver.get("https://kite.zerodha.com/");
  		 home= new KiteHomePage(driver);
  		 pin= new KitePinPage(driver);
  		 
  		 File myfile= new File("C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\Excel26MarchB.xlsx");
         mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
         login= new KiteLoginPage(driver);
         pin= new KitePinPage(driver);
         home= new KiteHomePage(driver);
	}
	
  @BeforeMethod
  public void LoginKiteApp()
  {
	  String UN = mySheet.getRow(4).getCell(0).getStringCellValue();
      String PWD = mySheet.getRow(4).getCell(1).getStringCellValue();
      String PIN = mySheet.getRow(4).getCell(2).getStringCellValue();
      
	  
	  login.sendUserName(UN);
	  Reporter.log("sending userName",true);
	  
	  login.sendPassword(PWD);
	  Reporter.log("sending password",true);
	  
	  login.clicOnLoginButton();
	  Reporter.log("clicking on loging Button",true);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  pin.sendPin(PIN);
	  Reporter.log("sending pin",true);
	  
	  pin.clickContinueButton();
	  Reporter.log("clicking on countinue Btton",true);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	  
  }
  
  
  @Test
  public void ValidateUsername() 
  {
	  String actualUserId = home.ActualUId();
	  String expectedUserId = mySheet.getRow(4).getCell(0).getStringCellValue();
	  Reporter.log("validating UserName",true);
	  Assert.assertEquals(actualUserId, expectedUserId, "Actual and expected userId not matching TC is failed");
  }
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  
	 home.logOut();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 Reporter.log("logginh out",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
	  Reporter.log("closing browser",true);
  }
  
  
  
}
