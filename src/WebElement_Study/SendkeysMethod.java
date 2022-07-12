package WebElement_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.discoveryplus.in/");
	
	Thread.sleep(30000);
	//driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	WebElement signin = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
	driver.manage().window().maximize();
	System.out.println(signin.getText());
	signin.click();
	
	Thread.sleep(15000);
	WebElement GetOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	System.out.println(GetOTP.isEnabled());
	GetOTP.isEnabled();
	
	Thread.sleep(2000);
	driver.findElement(By.id("mobileNumber")).sendKeys("9545090776");
	
	
	Thread.sleep(1000);
	GetOTP.click();
	
	Thread.sleep(20000);
	
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(7000);
	
	driver.findElement(By.xpath("(//h6[text()='My Account'])[1]")).click();
	
	driver.navigate().back();
	
	
	
	
	
	
	
	
	}

}
