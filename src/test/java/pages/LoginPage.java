package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.GenericMethods;
import utils.Hooks;

public class LoginPage extends GenericMethods {

	public WebDriver driver = null;

	
	public LoginPage() {
		this.driver = Hooks.driver;
		PageFactory.initElements(this.driver, this);
	}

	@AndroidFindBy(id = "com.flipkart.android:id/mobileNo")
	public WebElement prepopulatedMobileNumber;
	
	@AndroidFindBy(id = "com.google.android.gms:id/cancel")
	WebElement cancelBtnOnPrepopulatedMobileNumber;
	
	@AndroidFindBy(id = "android:id/text1")
	WebElement mobileNumberInputFeild;
	
	@AndroidFindBy(id = "com.flipkart.android:id/mobileNo")
	WebElement mobileNumberInput;
	
	@AndroidFindBy(id = "com.flipkart.android:id/btn_mlogin")
	WebElement logInBtn;
	
	@AndroidFindBy(id = "com.flipkart.android:id/et_password")
	WebElement passInputFeild;
    
	@AndroidFindBy(id ="com.flipkart.android:id/search_widget_textbox")
	WebElement searchInputFeild;
	
	@AndroidFindBy(id ="com.flipkart.android:id/txt_subtitle")
	WebElement searchSubTitle;
	
	@AndroidFindBy(id ="com.flipkart.android:id/allow_button")
	WebElement allowPermissionBtn;
	
	@AndroidFindBy(id ="com.android.packageinstaller:id/permission_allow_button")
	WebElement permissionAllowBtn;
	
	@AndroidFindBy(id ="com.flipkart.android:id/action_bar_root")
	WebElement scrollToElement;
	
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
