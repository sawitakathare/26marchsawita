package PopUps_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(1000);
        
        WebElement text = driver.findElement(By.xpath("//h1[@align='center']"));
        System.out.println(text.getText());
        
        WebElement text1 = driver.findElement(By.id("alertBox"));
        text1.click();
        Alert alt = driver.switchTo().alert();
        alt.accept();
        
       Thread.sleep(1000);
       driver.findElement(By.id("confirmBox")).click();
       Alert alt1= driver.switchTo().alert();
       System.out.println(alt1.getText());
       Thread.sleep(1000);
       alt1.dismiss();
       
       WebElement text2 = driver.findElement(By.id("promptBox"));
       text2.click();
       Alert alt2= driver.switchTo().alert();
       System.out.println(alt2.getText());
       alt2.sendKeys("Hi i am an alert popup");
       alt2.accept();
       
      System.out.println(driver.findElement(By.id("output")).getText()); 
       
        
        
       
	}

}
