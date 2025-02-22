package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.meeshoHomePage;
import pages.meeshoLogin;

public class MeeshoHomePage {
	
	WebDriver driver;
	
	meeshoLogin mlogin;
	meeshoHomePage mhPage;
	
	@Given("select one of the menu form the Home Page")
	public void select_one_of_the_menu_form_the_home_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.meesho.com/");
	   driver.manage().window().maximize();
	   
	   mlogin = new meeshoLogin(driver);
	   mhPage = new meeshoHomePage(driver);
	}
	@Then("verify all sub menus are present in the parent menu")
	public void verify_all_sub_menus_are_present_in_the_parent_menu() {
		mhPage.womenEth();
		
	}
	@When("get all catogories from one of the submenu")
	public void get_all_catogories_from_one_of_the_submenu() {
	    mhPage.allele();
	}
	@When("select one product")
	public void select_one_product() {
	    mhPage.allSarees();
	}

}
