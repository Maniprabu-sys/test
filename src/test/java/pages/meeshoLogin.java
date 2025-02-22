package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class meeshoLogin {

	WebDriver driver;

	By logProfile = By.xpath("//span[text()='Profile']");
	By logSignUp = By.xpath("//span[text()='Sign Up']");
	By logMyOrder = By.xpath("//span[text()='My Orders']");
	By logDeleteAcc = By.xpath("//span[text()='Delete Account']");
	By logText = By.xpath("//h6[contains (text(),'view your profile')]");
	By logPhone = By.xpath("//input[@class='Input__InputField-sc-1goybxj-1 kkRHxN']");
	By logContinueBtn = By.xpath("//span[text()='Continue']");

	public meeshoLogin(WebDriver driver) {
		this.driver=driver;
	}

	public void profileClk() {
		WebElement profileButton = driver.findElement(logProfile);
		profileButton.click();
	}

	public void signUp() {
		WebElement signUpButton = driver.findElement(logSignUp);
		signUpButton.click();

	}

	public void phone(String number) {
		WebElement phoneField = driver.findElement(logPhone);
		phoneField.sendKeys(number);

	}

	public void continueBtn() {
		WebElement continueButton = driver.findElement(logContinueBtn);
		continueButton.click();

	}

}
