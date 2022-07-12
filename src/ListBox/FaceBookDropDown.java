package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropDown {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(15000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Sawita");
		
		Thread.sleep(1000);
	    WebElement lastname = driver.findElement(By.name("lastname"));
	    lastname.sendKeys("Kathare");
	    
	    Thread.sleep(5000);
	    WebElement MobNo = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    MobNo.sendKeys("9172969801");
	    
	    Thread.sleep(2000);
	    WebElement passward = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    passward.sendKeys("sawi@123");
	    
	    
	    
		
	   Thread.sleep(3000);
	   WebElement day = driver.findElement(By.id("day"));
	   Select s1= new Select(day);
	   //s1.selectByIndex(15);
	  s1.selectByVisibleText("16");
	   //s1.selectByValue("16");
	   
	   Thread.sleep(1000);
	   WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
	   Select s2= new Select(Month);
	   //s2.selectByVisibleText("Sep");
	   s2.selectByValue("9");
	  // s2.selectByIndex(8);
	   
	   Thread.sleep(1000);
	   WebElement year = driver.findElement(By.id("year"));
	   Select s3= new Select(year);
	   s3.selectByValue("1993");
	   //s3.selectByVisibleText("1993");
	   
	   Thread.sleep(1000);
	   WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
	   gender.click();
	   
	   Thread.sleep(1000);
	   WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	   submit.click();
	   
	   
	   
	   
		
	}

}
