package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginHRM;

public class HomePageDef {
	
	WebDriver driver;
	
	
	HomePage homePage;
	LoginHRM loginHRM;
	
	@Given("User launch browser")
	public void user_launch_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    loginHRM = new LoginHRM(driver);
	    homePage = new HomePage(driver);
	}
	@When("user enters credentials {string} and {string}")
	public void user_enters_credentials_and(String username, String password) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    loginHRM.login(username, password);
	}
	@Then("user clicks login button")
	public void user_clicks_login_button() {
	    loginHRM.click();
	}
	@Then("user lands home page")
	public void user_lands_home_page() {
	   
		String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	}
	
	
	
	
	@Given("User lands home page with proper login")
	public void user_lands_home_page_with_proper_login() {
	    homePage.userLogin();
	}
	@When("User clicks admin in homePage")
	public void user_clicks_admin_in_home_page() {
	    homePage.adminele();
	}
	@Then("user land user creation page")
	public void user_land_user_creation_page() {
	    homePage.record();
	}
	@When("user click Add User button on user creation page")
	public void user_click_add_user_button_on_user_creation_page() {
	    homePage.add();
	}
	@Then("user can able to see admin creation from")
	public void user_can_able_to_see_admin_creation_from() {
	    homePage.head();
	}
//	@When("User entered all required fields input as select employee role, employee status, {string}, {string} , {string}, {string}")
//	public void user_entered_all_required_fields_input_as_select_employee_role_employee_status(String employeNmae, String roleUserName, String userPassword, String confirmUserPassword) {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		homePage.roleSelect();
//	    homePage.userStatus();
//	    homePage.createAdminRole(employeNmae, roleUserName, userPassword, confirmUserPassword);
//	}
//	@Then("User clicks save button")
//	public void user_clicks_save_button() {
//	    homePage.saveBtn();
//	}
//	@Then("Verify successfull toast message")
//	public void verify_successfull_toast_message() {
//	    homePage.toast();
//	}


}
