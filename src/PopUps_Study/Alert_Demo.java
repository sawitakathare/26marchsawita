package PopUps_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(1000);
        WebElement text = driver.findElement(By.id("promptBox"));
        text.click();
        Alert alt= driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.sendKeys("Hi i am an alert popup");
        alt.accept();
        
       System.out.println(driver.findElement(By.id("output")).getText()); 
        
        
	}

}
