package ActionsClassStudy;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement SeleniumButton = driver.findElement(By.linkText("Selenium"));
		Actions act= new Actions(driver);
		//act.moveToElement(SeleniumButton).click().build().perform();
		//act.click(SeleniumButton).perform();
		
		//How to right click (contextclick) using actions class
		//WebElement rightclickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.contextClick(rightclickButton).perform();
		//for(int i=0; i<=2; i++)
		//{
			//act.sendKeys(Keys.ARROW_DOWN).perform();
		//	Thread.sleep(100);
		//}
		//WebElement list = driver.findElement(By.xpath("(//ul//li//span)[3]"));
		//act.click(list).perform();
		
		//Alert alt = driver.switchTo().alert();
		//alt.accept();
		
		//How to double click using Actions class
		//WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//act.doubleClick(doubleClickButton).perform();
		
		//Alert alt1 = driver.switchTo().alert();
		//alt1.accept();
		
		act.click(SeleniumButton).perform();
		for(int i=1 ;i<=19 ;i++)
		{
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(200);
			
		
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		

								 
		
       
	}

}
