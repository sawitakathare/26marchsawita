package iFrame_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	
        Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']"));
		System.out.println(text.getText());
		
		WebElement text1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(text1.getText());
        
      
		driver.switchTo().frame("frame1");
        WebElement text2 = driver.findElement(By.tagName("input"));
        text2.click();
        text2.sendKeys("Iframe study");
        
        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();
        
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement animals = driver.findElement(By.id("animals"));
        Select s= new Select(animals);
        s.selectByValue("avatar");
        
       
	}

}
