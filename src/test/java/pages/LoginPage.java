package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.GenericMethods;
import utils.Hooks;

public class LoginPage extends GenericMethods {

	public AppiumDriver<AndroidElement> driver;

	
	public LoginPage() {
		this.driver = Hooks.driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}

	@FindBy(id = "com.flipkart.android:id/mobileNo")
	AndroidElement prepopulatedMobileNumber;
	
	@FindBy(id = "com.google.android.gms:id/cancel")
	AndroidElement cancelBtnOnPrepopulatedMobileNumber;
	
	@FindBy(id = "android:id/text1")
	AndroidElement mobileNumberInputFeild;
	
	@FindBy(id = "com.flipkart.android:id/mobileNo")
	AndroidElement mobileNumberInput;
	
	@FindBy(id = "com.flipkart.android:id/btn_mlogin")
	AndroidElement logInBtn;
	
	@FindBy(id = "com.flipkart.android:id/et_password")
	AndroidElement passInputFeild;
    
	@FindBy(id ="com.flipkart.android:id/search_widget_textbox")
	AndroidElement searchInputFeild;
	
	@FindBy(id ="com.flipkart.android:id/txt_subtitle")
	AndroidElement searchSubTitle;
	
	@FindBy(id ="com.flipkart.android:id/allow_button")
	AndroidElement allowPermissionBtn;
	
	@FindBy(id ="com.android.packageinstaller:id/permission_allow_button")
	AndroidElement permissionAllowBtn;
	
	@FindBy(id ="com.flipkart.android:id/action_bar_root")
	AndroidElement scrollToElement;
	
	/**
	 *Enter mobileNo/EmailID  
	 * @param mobileNo
	 */
	
	public void enterMobileNumber(String mobileNo) {
		
		clickOnElement(prepopulatedMobileNumber);
        
		
		// wait till handle pop None of above for login
		explicitWait(cancelBtnOnPrepopulatedMobileNumber, 5);

		// click on the None of above pop up(handled using XPATH)
		clickOnElement(cancelBtnOnPrepopulatedMobileNumber);

		// enter the mobile number
		explicitWait(mobileNumberInputFeild, 5);
		clickOnElement(mobileNumberInputFeild);
		
		setTextToInputFeild(mobileNumberInput, mobileNo);
		
		
		
	}
	
	/**
	 * click on the login button
	 */
	
	 public void clickOnLogInBtn()
	{
		clickOnElement(logInBtn);
	}
	
	 /**
	  * enter the password
	  * @param password
	  */
	 
	 public void enterPassword(String password)
	{
		explicitWait(passInputFeild, 5);
		setTextToInputFeild(passInputFeild, password);
		clickOnLogInBtn();
	}
	 
	 /**
	  * enter into search box
	  * @param searchVal
	  */
	 
	 public void enterIntoSearchBox(String searchVal)
	{
		explicitWait(searchInputFeild, 5);
		setTextToInputFeild(searchInputFeild, searchVal);
		clickOnElement(searchSubTitle);
	}
	 
	public void handleLocationPopUp()
	{
		explicitWait(allowPermissionBtn, 5);
		clickOnElement(allowPermissionBtn);
		explicitWait(permissionAllowBtn, 5);
		clickOnElement(permissionAllowBtn);
	}
	
	/**
	 * scroll to element and click
	 * @param itemName
	 */
	
	public void scrollToElementAndClick(String itemName)
	{
		scrollIntoElementByResourceIdText(scrollToElement, itemName);
	}

}
