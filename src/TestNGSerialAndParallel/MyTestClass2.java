package TestNGSerialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestClass2 {
	 @Test
	  public void MyMethod() 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.co.in/");
			
	  }
}
