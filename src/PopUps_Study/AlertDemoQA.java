package PopUps_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
        
		//Thread.sleep(2000);
       // driver.findElement(By.id("alertButton")).click();
       // Alert alt = driver.switchTo().alert();
        //System.out.println(alt.getText());
        //alt.accept();
        
        //Thread.sleep(10000);
        //driver.findElement(By.id("timerAlertButton")).click();
       // Thread.sleep(15000);
       // Alert alt1 = driver.switchTo().alert();
       // System.out.println(alt1.getText());
       // alt1.accept();
       
 		
       // driver.findElement(By.id("confirmButton")).click();
        //Alert a = driver.switchTo().alert();
       // System.out.println(a.getText()); 
       // a.accept();
        
        
        WebElement text = driver.findElement(By.id("promtButton"));
        text.click();
        Thread.sleep(2000);
        Alert a1 = driver.switchTo().alert();
        System.out.println(a1.getText());
        a1.sendKeys("sawi");
        Thread.sleep(2000);
        a1.accept();
       //WebElement text3 = driver.findElement(By.id("promptResult"));
       //System.out.println( text3.getText());
        System.out.println(driver.findElement(By.id("promptResult")).getText());
	}

}
