package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NormalClass {
  @Test
  public void Test() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		System.out.println("Brower Launched");
		Reporter.log("Hi");
		Reporter.log("Hellow",true);
		
  }
  @Test
  public void Test1() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		System.out.println("Brower Launched");
		Reporter.log("Hey");
		Reporter.log("Horror",true);
		
  }
  
}
