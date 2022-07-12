package SetSizeAndPosition;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println(driver.manage().window().getSize());
		//to set size
		Thread.sleep(1000);
		Dimension d= new Dimension(1200, 200);
		driver.manage().window().setSize(d);
	
		
		//d.setSize(1200, 200);
		
		
		
		
	}

}
