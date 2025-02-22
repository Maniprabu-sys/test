package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import faceBook.FbLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	WebDriver driver;
	FbLoginPage fbLoginPage;
	
	@Before
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		

	}
	
	@After 
	public void tearDown() {
		if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }

	}
	
	public WebDriver getdDriver() {
		return driver;
		
	}
	
	public FbLoginPage getFbLoginPage() {
        return fbLoginPage;
    }

}
