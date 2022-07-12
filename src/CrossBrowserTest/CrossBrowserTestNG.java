package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestNG {
	@Parameters("browserName")
  @Test
  public void myMethod(String name) throws InterruptedException 
  {
		 WebDriver driver = null;
		if (name.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		else if (name.equals("chrome")) 
		{
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
			  driver= new ChromeDriver();
		}
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.close();
	    Thread.sleep(1000);
	 
  }
}
