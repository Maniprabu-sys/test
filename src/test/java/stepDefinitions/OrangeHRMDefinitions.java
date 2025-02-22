package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginHRM;

public class OrangeHRMDefinitions{
	
	WebDriver driver;
	LoginHRM loginHRM;
	
	@Given("user launch app URL")
	public void user_launch_app_url() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("");
	    
	}
	@Then("verify the URL")
	public void verify_the_url() {
	    
	}
	@When("user enter creadentials {string} and {string}")
	public void user_enter_creadentials_and(String string, String string2) {
	    
	}

	
	

}
