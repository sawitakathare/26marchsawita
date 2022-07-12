package KiteBase;




import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;




public class Base 
{
 protected static WebDriver driver;
	public void OpenBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
  		driver= new ChromeDriver();
  		driver.get("https://kite.zerodha.com/");
  		Reporter.log("Launching browser",true);
  		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
		

		}
	public String CrossBrowserSetup(String name)
	{
		if (name.equals("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
	  		driver= new ChromeDriver();
		}
		else if (name.equals("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
  		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  		return name;
  		
	}
	
}
