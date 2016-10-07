package automationFramework;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {
	public static WebDriver driver;
	public static String driverPath = "D:\\software\\java software\\selenium\\";
	public static String sBookKey = "Selenium";
	public static final String sAddToCart = "(//input[contains(@value,'Add to Cart')])[1]";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\software\\java software\\selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click();
		
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website");
        Thread.sleep(1000);
		//endSession();

	}
}