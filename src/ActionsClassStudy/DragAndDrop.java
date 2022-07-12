package ActionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement destination = driver.findElement(By.id("amt7"));
		Actions act= new Actions(driver);
		
		act.dragAndDrop(source, destination).perform();
	}

}
