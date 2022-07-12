package KitePOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
          File myfile= new File("C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\Excel26MarchB.xlsx");
          Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
          String UN = mySheet.getRow(4).getCell(0).getStringCellValue();
          String PWD = mySheet.getRow(4).getCell(1).getStringCellValue();
          String PIN = mySheet.getRow(4).getCell(2).getStringCellValue();
          
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\chromedriver_win32\\chromedriver.exe");
  		WebDriver driver= new ChromeDriver();
  		driver.get("https://kite.zerodha.com/");
  		Thread.sleep(2000);
  		
  		KiteLoginPage login= new KiteLoginPage(driver);
  		login.sendUserName(UN);
  		login.sendPassword(PWD);
  		login.clicOnLoginButton();
  		
  		Thread.sleep(2000);
  		KitePinPage pin= new KitePinPage(driver);
  		pin.sendPin(PIN);
  		pin.clickContinueButton();
  		
  		Thread.sleep(1000);
  		KiteHomePage home= new KiteHomePage(driver);
  		home.validateUserName(UN);
  		home.logOut();
  		driver.close();
  		


	}

}
