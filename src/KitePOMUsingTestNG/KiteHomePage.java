package KitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	//1. data member
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logOutButton;
	
	//2.constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void validateUserName()
	{
		String expectedUserName = "ELR321";
		String actualUserName = userName.getText();
		
		if (expectedUserName.equals(actualUserName)) {
			System.out.println("Actual and Expected User Id are matching TC is passed");
			
		}
		else {
			System.out.println("Actual and Excepted User Id are not matching TC is failed");
		}
		
		
	}
	public void logOut() throws InterruptedException {
		userName.click();
		Thread.sleep(200);
		logOutButton.click();
	}
	
	public String ActualUId()
	{
		String ActualUserName = userName.getText();
		return ActualUserName;
	}

}
