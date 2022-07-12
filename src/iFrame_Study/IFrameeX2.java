package iFrame_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameeX2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		Thread.sleep(2000);
	String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
	System.out.println(text);
	
	//driver.switchTo().frame("Frame1");
	
	driver.switchTo().frame(0);
	
	String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
	System.out.println(text1);
	
	driver.switchTo().parentFrame();
	
	//xpath by linkedText
	
	String text2 = driver.findElement(By.linkText("Pavilion")).getText();
	System.out.println(text2);
	
	driver.switchTo().frame(1);
	String text3 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
	System.out.println(text3);
	
	//xpath by partial LinkedText
	driver.switchTo().defaultContent();
	String text4 = driver.findElement(By.partialLinkText("Blog")).getText();
		System.out.println(text4);
		
		

	}

}
