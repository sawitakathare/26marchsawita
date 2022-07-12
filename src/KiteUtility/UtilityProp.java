package KiteUtility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.io.FileHandler;

import KiteBase.Base;

public class UtilityProp extends Base
{
	public static void captureScreenshot(String TCID) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\SreenShot\\myScreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream myfile= new FileInputStream("C:\\Users\\Mukesh\\eclipse-workspace\\Java_Selenium\\myProperties.properties");
		prop.load(myfile);
	    String value = prop.getProperty(key);
	    return value;
	    
		
	}

}
