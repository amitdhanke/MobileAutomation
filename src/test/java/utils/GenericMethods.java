package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;


public class GenericMethods {
	
	public WebDriver driver = Hooks.driver;
	
	
	
	/**
	 * click on the element 
	 * @param element
	 */
	
	 public void clickOnElement(WebElement element)
	{
		explicitWait(element, 10); 
		element.click();
	}
	 
	 /**
	  * enter value into input field
	  * @param element
	  * @param value
	  */
	 
	  public void setTextToInputFeild(WebElement element,String value)
	 {
		 element.clear();
		 element.sendKeys(value);
	 }
	 
	 /**
	  * explicit wait for element to be clickable
	  * @param element
	  * @param waitInSecound
	  */
	 
	 public void explicitWait(WebElement element,int waitInSecound)
	{
		 WebDriverWait wait = new WebDriverWait(driver, waitInSecound);	
		 
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	 
	 /**
	  * scroll for element by resource id and text
	  * @param ele
	  * @param text
	  */
	 
	 public void scrollIntoElementByResourceIdText(WebElement ele,String text)
	{
		 WebElement element = (WebElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId("+ele+")).scrollIntoView("
					+ "new UiSelector().text("+text+"))"));
		    
		    element.click();
	}

}
