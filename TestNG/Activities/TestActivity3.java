package Activties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {
	/*
	 * Find the login input fields - username and password Enter the credentials -
	 * admin and password - and click the "Log in" button. Read the confirmation
	 * message and make and assertion to check if the correct message has been
	 * printed.
	 */
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/login-form");
	}

	@Test
	public void loginTest() {
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		userName.sendKeys("admin");
		password.sendKeys("password");
		WebElement login = driver.findElement(By.xpath("//button[text()='Submit']"));
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
		String msg = driver.findElement(By.xpath("//h1[contains(text(),' Success!')]")).getText();
		Assert.assertEquals(msg, "Login Success!");
	}

	@AfterClass
	public void shutDown() {
		driver.quit();
	}

}
