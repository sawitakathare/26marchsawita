package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		KiteLoginPage login= new KiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clicOnLoginButton();
		
		Thread.sleep(2000);
		KitePinPage pin= new KitePinPage(driver);
		pin.sendPin();
		pin.clickContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserName();
		home.logOut();
		driver.close();
		

	}

}
