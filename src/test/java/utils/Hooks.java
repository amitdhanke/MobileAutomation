package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hooks {

	public static AndroidDriver<WebElement> driver;
	
	/**
	 * initialize android driver here
	 * @param property
	 * @throws MalformedURLException 
	 */
	
	
	@Before
	 public void setDriver() throws MalformedURLException
	{
		 
//		if(initilizeProperty(property).equals("Android"))
//		{
			URL appiumURL = new URL("http:\\localhost:4723/wd/hub");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setPlatform(Platform.ANDROID);
			caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\admin\\Desktop\\MobileAutomation\\Apk\\Flipkart_6.9.apk");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "e5aac03");
			
			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(appiumURL,caps);
//		}
	}
	
	 
	 /**
	  * read the property file
	  * @param key
	  * @return
	  */
	 
	 public String initilizeProperty(String key)
	{
		 Properties pro = new Properties();
		 
		 try {	 
			 //to load and read the property file
			 FileInputStream in = new FileInputStream("C:\\Users\\admin\\workspace\\FlipkartAndroid\\resources\\userdefault.properties");
			 pro.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro.getProperty(key);
	}
	 
//	 @After
//	 public void cleanUp()
//	{
//	   Hooks.driver.quit();	
//	}
}
