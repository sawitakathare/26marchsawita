package misc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
        String mainId = driver.getWindowHandle();// to get main page ID
        System.out.println(mainId);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[3]")).click();
       
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[3]")).click();
        

        Set<String> Ids = driver.getWindowHandles();
        for(String i:Ids)
        {
        	System.out.println(i);
        	if(!i.equals(mainId))
        	{
        		driver.switchTo().window(i);
        		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
        		Thread.sleep(5000);
        	}
        }
        	
        driver.switchTo().window(mainId);
        String text = driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[3]")).getText();
        System.out.println(text);
	}

}
