package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Be regular in practice");
		
		driver.findElement(By.xpath("//input[@name='radio']")).click();
		
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		

		
	}

}
