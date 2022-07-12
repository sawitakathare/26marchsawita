package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.name("dropdown-class-example"));
		
		Select s= new Select(listBox);
		s.selectByVisibleText("Option3");
		Thread.sleep(1000);
		s.selectByValue("option1");
		Thread.sleep(1000);
		s.selectByIndex(2);
	}

}
