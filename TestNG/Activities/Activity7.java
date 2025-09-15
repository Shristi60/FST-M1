package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/login-form");
	}	
	@Test(priority=1)
	public void titleTest()
	{
		assertEquals(driver.getTitle(), "Selenium: Login Form");
	}
	@DataProvider(name="Authentication")
	public static Object[][] credentials(){
		return new Object[][] {
			{"admin","Wrong password"},
			{"admin","password1"},
			{"abcf","unnecessary"}
		};
	}
	
	@Test(dataProvider = "Authentication", priority=2)
	public void LoginTest(String username, String password) {
		WebElement usernameField=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwordField= driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButton=driver.findElement(By.xpath("//button[text()='Submit']"));
		
		//Clear the fields
		usernameField.clear();
		passwordField.clear();
		
		//Enter the credentials
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
		
		//Assertions
		
		String loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subheading"))).getText();
        Assert.assertEquals(loginMessage, "Invalid credentials");
	}
	@AfterClass
	public void shutDown() {
		driver.quit();
	}



}
