package PopUps_Study;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChileBrowserStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
        
        String mainPageID = driver.getWindowHandle();

        System.out.println(mainPageID);
        System.out.println("=======================");
        driver.findElement(By.name("NewTab")).click();
        
        Thread.sleep(2000);
        //to handle multiple windows/ to get multiple ids
        Set<String> allPageIDs = driver.getWindowHandles();
        Iterator<String> it = allPageIDs.iterator();
       // while(it.hasNext())
       // {
        //	System.out.println(it.next());
        //}
    System.out.println("=============================");
    
    String mainPageId = it.next();// will return main page id
    System.out.println(mainPageId);
    String childPageId = it.next();// will return child page id
    System.out.println(childPageId);
    // to switch focus to child window
   
    driver.switchTo().window(childPageId);//changing focus from main page to child page
    //driver.manage().window().maximize();
    driver.findElement(By.name("email")).sendKeys("Sawi@");
    
    driver.switchTo().window(mainPageId);
    Thread.sleep(1000);
    String text = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']")).getText();
    System.out.println(text);

    String text1 = driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']")).getText();
    System.out.println(text1);
    
    Thread.sleep(2000);
    driver.findElement(By.name("NewWindow")).click();
     
    //change focus from main page to child page
    Set<String> ids = driver.getWindowHandles();
    Iterator<String> itr = ids.iterator();
    
    Thread.sleep(2000);
    String mainpageid = itr.next();
    System.out.println(mainpageid);
    String childpagetabid = itr.next();
    System.out.println(childpagetabid);
    String childbrowserid = itr.next();
    System.out.println(childbrowserid);
    driver.switchTo().window(childbrowserid);
    driver.manage().window().maximize();
    
    driver.findElement(By.id("the7-search")).sendKeys("selenium tool");
    
   driver.switchTo().window(mainpageid);
   String text3 = driver.findElement(By.xpath("//p[text()='Click below to download a file']")).getText();
   System.out.println(text3);
   
  // driver.findElement(By.xpath("//input[@value='Download']")).click();
   
   //Alert popup = driver.switchTo().alert();
   //popup.accept();
   
   
    
    
    
	}

}
