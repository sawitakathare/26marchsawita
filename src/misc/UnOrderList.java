package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.name("q")).sendKeys("Honda");
        Thread.sleep(700);
        List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
        System.out.println(searchResults.size());
        
        for(WebElement r:searchResults)
        {
        	System.out.println(r.getText());
        }
        for(WebElement result:searchResults)
        {
        String actualText = result.getText();
        String expectedText = "honda amaze";
       
       if(actualText.equals(expectedText))
       {
    	   result.click();
    	   break;
       
       }
        }
        
           driver.findElement(By.linkText("Images")).click();

	}

}
