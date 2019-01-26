package stepDefination;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import utils.Hooks;

public class LaunchApplication {
	/*
	public static void main(String[] args) 
	{
		
		Hooks hook = new Hooks();
		try {
			hook.setDriver("driver");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 @org.junit.Test
	 public void launchApplicationTest() throws MalformedURLException, InterruptedException
	{
		//appium code 
		
		URL appiumURL = new URL("http:\\localhost:4723/wd/hub");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(Platform.ANDROID);
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\admin\\Desktop\\MobileAutomation\\Apk\\Flipkart_6.9.apk");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "e5aac03");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(appiumURL,caps);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.flipkart.android:id/mobileNo")).click();
		
		//wait till handle pop None of above for login
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//click on the None of above pop up(handled using XPATH)
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.gms:id/cancel")));
		driver.findElement(By.id("com.google.android.gms:id/cancel")).click();
		
		//enter the mobile number
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/text1")));
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(By.id("com.flipkart.android:id/mobileNo")).clear();
		driver.findElement(By.id("com.flipkart.android:id/mobileNo")).sendKeys("7387585699");
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
		
		//Enter the password and click on the sign in button 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.flipkart.android:id/et_password")));
		driver.findElement(By.id("com.flipkart.android:id/et_password")).sendKeys("Dad.9822898593");
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
		
		//enter into search box for for items 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.flipkart.android:id/search_widget_textbox")));
		driver.findElement(By.id("com.flipkart.android:id/search_widget_textbox")).setValue("mobiles");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.flipkart.android:id/txt_subtitle")));
		driver.findElement(By.id("com.flipkart.android:id/txt_subtitle")).click();
		
		//handle allow location permission pop up using locator
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.flipkart.android:id/allow_button")));
	    driver.findElement(By.id("com.flipkart.android:id/allow_button")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.packageinstaller:id/permission_allow_button")));
	    driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	    
	    //scroll into flipkart app screen
	    AndroidElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.flipkart.android:id/action_bar_root\")).scrollIntoView("
				+ "new UiSelector().text(\"Redmi Note 6 Pro (Blue, 64 GB)#OnlyOnFlipkart\"))"));
	    
	    element.click();
	    
	    //dont use the close method to close native application because that will invalid method for native application it will through exception
		driver.quit();
	}
*/	

}
