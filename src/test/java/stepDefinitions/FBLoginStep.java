package stepDefinitions;


import org.openqa.selenium.WebDriver;

import baseClass.Hooks;
import faceBook.FbLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FBLoginStep {
	
	WebDriver driver;
	
	FbLoginPage fbLoginPage;
	
	@Given("user launch facebook URL")
	public void user_launch_facebook_url() {
		this.driver = new Hooks().getdDriver();  // Get the WebDriver from Hooks
        
	}
	@Then("user enter valid credentials as {string} and {string}")
	public void user_enter_valid_credentials_as_and(String username, String password) {
	    fbLoginPage.fbCred(username, password);
	}
	@Then("click login button")
	public void click_login_button() {
	   fbLoginPage.loginBtn();
	}
	@Then("user navigate to homePage")
	public void user_navigate_to_home_page() {
	   
		String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	}


}
