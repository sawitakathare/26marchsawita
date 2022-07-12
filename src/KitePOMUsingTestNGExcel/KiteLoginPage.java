package KitePOMUsingTestNGExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	//1.data member
	
	@FindBy(id = "userid")private WebElement userName;
	@FindBy(id = "password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	//2.constructor
	
	public KiteLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void sendUserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	  public void sendPassword(String PassWord)
	  {
		 password.sendKeys(PassWord);
	  }

	public void clicOnLoginButton()
	{
		loginButton.click();
	}

}
