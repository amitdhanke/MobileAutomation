package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GenericMethods {
	
	public AndroidDriver driver = Hooks.driver;
	public Hooks hook;
	
	
	
	/**
	 * click on the element 
	 * @param element
	 */
	
	 public void clickOnElement(WebElement element)
	{
		element.click();
	}
	 
	 /**
	  * enter value into input field
	  * @param element
	  * @param value
	  */
	 
	  public void setTextToInputFeild(AndroidElement element,String value)
	 {
		 element.clear();
		 element.setValue(value);
	 }
	 
	 /**
	  * explicit wait for element to be clickable
	  * @param element
	  * @param waitInSecound
	  */
	 
	 public void explicitWait(AndroidElement element,int waitInSecound)
	{
		 WebDriverWait wait = new WebDriverWait(driver, waitInSecound);	
		 
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	 
	 /**
	  * scroll for element by resource id and text
	  * @param ele
	  * @param text
	  */
	 
	 public void scrollIntoElementByResourceIdText(AndroidElement ele,String text)
	{
		 AndroidElement element = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId("+ele+")).scrollIntoView("
					+ "new UiSelector().text("+text+"))"));
		    
		    element.click();
	}

}
