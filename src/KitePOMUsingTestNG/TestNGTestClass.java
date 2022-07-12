package KitePOMUsingTestNG;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
	
	@BeforeClass
	public void BorwserLaunch()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
  		driver= new ChromeDriver();
  		driver.get("https://kite.zerodha.com/");
  		 home= new KiteHomePage(driver);
  		 pin= new KitePinPage(driver);
  		
	}
	
  @BeforeMethod
  public void LoginKiteApp()
  {
	  login= new KiteLoginPage(driver);
	  login.sendUserName("ELR321");
	  login.sendPassword("Dhana1111");
	  login.clickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendPin("'982278");
	  pin.clickContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
  }
  
  
  @Test
  public void ValidateUsername() 
  {
	  String actualUserId = home.ActualUId();
	  String expectedUserId = "ELR321";
	  Assert.assertEquals(actualUserId, expectedUserId, "Actual and expected userId not matching TC is failed");
  }
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  
	 home.logOut();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
  
  
  
}
