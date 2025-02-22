package baseClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	// Declare constants
    private final int TIMEOUT = 10;
    
    // Declare WebDriver (using protected so it can be accessed by subclasses)
    protected static WebDriver driver;
    
    // Declare WebDriverWait instance
    private WebDriverWait wait;
    
    // Constructor
    public BaseClass(WebDriver driver) {
        // Initialize the driver
        BaseClass.driver = driver;
        
        // Initialize WebDriverWait with Duration
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        
    }
    
    protected void waitForVisibleElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}
}
