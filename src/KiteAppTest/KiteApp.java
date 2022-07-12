package KiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button"));
		userid.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys("982278");
		continueButton.click();
		Thread.sleep(1000);

		WebElement text = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualdata = text.getText();
	    String expectedData = "ELR321";
	    if (actualdata.equals(expectedData)) 
	    {
			System.out.println("UID matching TC passed");
		}
	    else {
			System.out.println("UID mismatch TC failed");
		}
	    text.click();
	    Thread.sleep(1000);
	    
	  driver.findElement(By.xpath("//a[@target='_self']")).click();
	  Thread.sleep(1000);
		
		

	}

}
