package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utils.GenericMethods;

public class FlipkartStepDefination extends GenericMethods{
	
	LoginPage loginPage = new LoginPage();
	
	
	@Given("^sing in flipkart with \"([^\"]*)\",\"([^\"]*)\"$")
	public void singInFlipKart(String mobileNumber,String password)
	{
		loginPage.enterMobileNumber(mobileNumber);
		loginPage.clickOnLogInBtn();
		loginPage.enterPassword(password);
	}
	
	@When("^enter \"([^\"]*)\",\"([^\"]*)\" for search$")
	public void searchProducts(String productCat,String productToSearch){
		
		loginPage.enterIntoSearchBox(productCat);
		loginPage.handleLocationPopUp();
		loginPage.scrollToElementAndClick(productToSearch);
		
		
	}

}
