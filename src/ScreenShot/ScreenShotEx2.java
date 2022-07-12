package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotEx2 {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//driver.get("https://m.facebook.com/login/?locale=en_GB");
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String str = RandomString.make(2); //to add random string this will avoid overwriting of file
	    
	    File destiantion= new File("C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\selenium\\ScreenShotOfSeleniumPra\\fbimage"+str+" .png");
	    FileHandler.copy(source, destiantion);
	}

}
