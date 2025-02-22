package faceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;



public class FbLoginPage extends BaseClass{
	
	public FbLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	

	
	
	By fblgusername = By.id("email");
	By fblgpass = By.id("pass");
	By fblgBtn = By.id("loginbutton");
	
	public void uname(String username) {
		WebElement uname = driver.findElement(fblgusername);
		uname.sendKeys(username);

	}
	
	public void pass(String password) {
		WebElement uname = driver.findElement(fblgusername);
		uname.sendKeys(password);

	}
	
	public void loginBtn() {
		WebElement btn = driver.findElement(fblgBtn);
		btn.click();
	}
	
	public void fbCred(String username, String password) {
		driver.findElement(fblgusername).sendKeys(username);
		driver.findElement(fblgpass).sendKeys(password);

	}

}
