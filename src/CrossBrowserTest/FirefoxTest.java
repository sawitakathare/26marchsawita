package CrossBrowserTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;


public class FirefoxTest {
  @Test
  public void MyMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver= new ChromeDriver();
	  WebDriver driver= new FirefoxDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");


		Thread.sleep(1000);
  }
}
