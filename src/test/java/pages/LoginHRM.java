package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginHRM  {
	
	WebDriver driver;
	
	By usernameField = By.xpath("//input[@name='username']");
	By passwordField = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//button[@type='submit']");
	
	public LoginHRM(WebDriver driver) {
		
		this.driver = driver;

	}
	
	public void enterUsername(String username) {
		WebElement usernameElement = driver.findElement(usernameField);
		usernameElement.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		WebElement passwordElement = driver.findElement(passwordField);
		passwordElement.sendKeys(password);
	}
	
	public void clickButton() {
		WebElement lgbtnElement = driver.findElement(loginButton);
		lgbtnElement.click();
	}
	
	public void login(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		
		
	}
	
	public void click() {
		driver.findElement(loginButton).click();
	}
	
	
	
	

}
