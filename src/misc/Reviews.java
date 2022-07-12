package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reviews {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/redmi-note-11-horizon-blue-64-gb/p/itm2a388ca843b21");
        Thread.sleep(2000);
        WebElement reviews = driver.findElement(By.xpath("(//div[@class='aMaAEs']//span)[7]"));
        System.out.println(reviews.getText());
	}

}
