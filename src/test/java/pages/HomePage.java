package pages;

import java.util.Iterator;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HomePage {

	WebDriver driver;
	
	
	
	By loginUserName = By.xpath("//p[@class='oxd-userdropdown-name']");
	By searchButton = By.xpath("//input[@placeholder='Search']");
	//Create Admin role element
	By recordPage = By.xpath("//span[@class='oxd-text oxd-text--span']");
	By header = By.xpath("//h6[text()='Add User']");
	By admin = By.xpath("//span[text()='Admin']");
	By addbtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By userrole= By.xpath("(//div[text()='-- Select --'])[1]");
	By empname = By.xpath("//input[@placeholder='Type for hints...']");
	By userstatus= By.xpath("(//div[text()='-- Select --'])[2]");
	By usernametext = By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Username']");
	By usernameinput = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	By password = By.xpath("(//input[@type='password'])[1]");
	By confirmpassword = By.xpath("(//input[@type='password'])[2]");
	By save = By.xpath("//button[@type='submit']");
	By toast = By.xpath("//div[@id='oxd-toaster_1']");
	
	
	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	// home page user creation elements
	
	public void userLogin() {
		WebElement loginUser = driver.findElement(loginUserName);
		
		@SuppressWarnings("deprecation")
		String userNameLogin = loginUser.getAttribute("value");
		System.out.println(userNameLogin + " Logged In");
	}
	
	public void record() {
		WebElement recordlist = driver.findElement(recordPage);
		
		@SuppressWarnings("deprecation")
		String attribute = recordlist.getAttribute("value");
		System.out.println("Your are in now User creation page, Here the records : " + attribute);
	}

	public void add() {
		WebElement addUser = driver.findElement(addbtn);
		addUser.click();
	}

	public void head() {
		WebElement heading = driver.findElement(header);
		String text = heading.getText();
		System.out.println("You are now at User creation page, Please " + text);
	}

	public void adminele() {
		driver.findElement(admin).click();

	}
	public void search(String value) {
		driver.findElement(searchButton).sendKeys(value);

	}
	
	public void roleSelect() {
		List<WebElement> list = driver.findElements(userrole);
		for (WebElement webElement : list) {
			String text = webElement.getText();
			System.out.println(text);
		}
		

	}
	
	public void empName(String employeNmae) {
		WebElement employName = driver.findElement(empname);
		employName.sendKeys(employeNmae);
	}
	
	public void userStatus() {
		List<WebElement> ustatus = driver.findElements(userstatus);
		if(!ustatus.isEmpty()) {
			WebElement state = ustatus.get(0);
			state.click();
		}

	}
	public void useName(String roleUserName) {
		WebElement uName = driver.findElement(usernametext);
		uName.sendKeys(roleUserName);
	}
	public void pass(String userPassword) {
		WebElement upassword = driver.findElement(password);
		upassword.sendKeys(userPassword);
	}
	public void cpass(String confirmUserPassword) {
		WebElement cpass = driver.findElement(confirmpassword);
		cpass.sendKeys(confirmUserPassword);
	}
	
	public void saveBtn() {
		WebElement sButton = driver.findElement(save);
		sButton.click();
	}
	
	public void toast() {
		WebElement toastMessage = driver.findElement(toast);
		
		String text = toastMessage.getText();
		System.out.println(text);
	}
	
	public void createAdminRole(String employeNmae, String roleUserName, String userPassword, String confirmUserPassword) {
		
		driver.findElement(empname).sendKeys(employeNmae);
		driver.findElement(usernametext).sendKeys(roleUserName);
		driver.findElement(password).sendKeys(userPassword);
		driver.findElement(confirmpassword).sendKeys(confirmUserPassword);

	}

}
