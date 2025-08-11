package Activties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {
	/*
	 * Add 4 @Test methods. In the first @Test method, use getTitle() to get and
	 * assert the title of the page. In the second @Test method, use findElement()
	 * to look for the black button. Make an incorrect assertion. (This test case is
	 * meant to throw an error) For the third @Test method, skip it by setting it's
	 * enabled parameter to false. The third method will be skipped, but will not be
	 * shown as skipped. For the fourth @Test method, skip it by throwing a
	 * SkipException inside the method. The fourth method will be skipped and it
	 * will be shown as skipped. Observe the result in the console.
	 */

	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/target-practice");
	}

	@Test
	public void testCase1() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "Selenium: Target Practice");

	}

	@Test
	public void testCase2() {
		WebElement blackButton=driver.findElement(By.xpath("//button[text()='Black']"));
		Assert.assertTrue(blackButton.isDisplayed());
		Assert.assertEquals(blackButton.getText(), "Black");

	}

	@Test(enabled = false)
	public void testCase3() {
		WebElement cyan=driver.findElement(By.xpath("//button[text()='Cyan']"));
		Assert.assertEquals(cyan.getText(), "Cyan");

	}

	@Test
	public void testCase4() throws SkipException {
		WebElement cyan=driver.findElement(By.xpath("//button[text()='Cyan']"));
		if(cyan.getText().equalsIgnoreCase("cyan"))
		{
			throw new SkipException("Skip exception thrown");
		}

	}

	@AfterClass
	public void shutDown() {
		driver.quit();
	}

}
