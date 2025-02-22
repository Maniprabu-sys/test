package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class meeshoHomePage {
	
	WebDriver driver;
	Actions a;
	
	By womenEthnic = By.xpath("//span[text()='Women Ethnic']");
	By womenWestern = By.xpath("//span[text()='Women Western']");
	By men = By.xpath("//span[text()='Men']");
	By kids = By.xpath("//span[text()='Kids']");
	By homeKitchen = By.xpath("//span[text()='Home & Kitchen']");
	By beautyHealth = By.xpath("//span[text()='Beauty & Health']");
	By jwellAccess = By.xpath("//span[text()='Jewellery & Accessories']");
	By bagsFoot = By.xpath("//span[text()='Bags & Footwear']");
	By electronics = By.xpath("//span[text()='Electronics']");
	By sportsFitt = By.xpath("//span[text()='Sports & Fitness']");
	By carMotor = By.xpath("//span[text()='Car & Motorbike']");
	By listOfEle = By.xpath("//div[@class='NavBarDesktop__StyledLevel3-sc-xsryom-1 jlTvnV']");
	By allSaree = By.xpath("//p[text()='All Sarees']");
	
	public meeshoHomePage(WebDriver driver) {
		this.driver=driver;
		this.a = new Actions(driver);
	}
	
	public void womenEth() {
		WebElement womenthnic = driver.findElement(womenEthnic);
		
		a.moveToElement(womenthnic).perform();

	}
	public void womenWest() {
		WebElement womentern = driver.findElement(womenWestern);
		
		a.moveToElement(womentern).perform();

	}
	public void kidss() {
		WebElement kid = driver.findElement(kids);
		a.moveToElement(kid).perform();

	}
	public void beauty() {
		WebElement homeKitc = driver.findElement(homeKitchen);
		a.moveToElement(homeKitc).perform();

	}
	public void jwell() {
		WebElement access = driver.findElement(jwellAccess);
		a.moveToElement(access).perform();

	}
	public void bag() {
		WebElement foot = driver.findElement(bagsFoot);
		a.moveToElement(foot).perform();

	}
	public void elect() {
		WebElement electron = driver.findElement(electronics);
		a.moveToElement(electron).perform();

	}
	public void sport() {
		WebElement fit = driver.findElement(sportsFitt);
		a.moveToElement(fit).perform();

	}
	
	public void menele() {
		WebElement mens = driver.findElement(men);
		a.moveToElement(mens).perform();

	}
	public void car() {
		WebElement motor = driver.findElement(carMotor);
		a.moveToElement(motor).perform();

	}
	
	public void allele() {
		List<WebElement> list = driver.findElements(listOfEle);
		for (WebElement webElement : list) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}
	
	public void allSarees() {
		WebElement saree = driver.findElement(allSaree);
		saree.click();
	}

}
