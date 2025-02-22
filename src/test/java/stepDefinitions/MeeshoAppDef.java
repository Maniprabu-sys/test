package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.meeshoLogin;

public class MeeshoAppDef {
	
	WebDriver driver;
	
	meeshoLogin meeshLogin;
	
	@Given("user launch meesho app as per the given URL")
	public void user_launch_meesho_app_as_per_the_given_url() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		meeshLogin=new meeshoLogin(driver);
	    
	}
	@Then("user land meesho app home page")
	public void user_land_meesho_app_home_page() {
		
		String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	}
	@When("user click profile button from right corner")
	public void user_click_profile_button_from_right_corner() {
	    meeshLogin.profileClk();
	}
	@Then("verify sign-up button enabled")
	public void verify_sign_up_button_enabled() {
	    meeshLogin.signUp();
	}
	@When("user click sign-up button and redirect to sign-up page")
	public void user_click_sign_up_button_and_redirect_to_sign_up_page() {
	    
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	@Then("user confirm land sign-up page")
	public void user_confirm_land_sign_up_page() {
	    WebElement signText = driver.findElement(By.xpath("//h6[contains (text(),'view your profile')]"));
	    String text = signText.getText();
	    System.out.println(text);
	}
	@When("user enter valid {string}")
	public void user_enter_valid(String number) {
		meeshLogin.phone("6381121156");
	    
	}
	@When("click continue button")
	public void click_continue_button() {
	    meeshLogin.continueBtn();
	}

}
