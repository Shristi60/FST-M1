package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5 {

	/*
	 * Checking the page title Header Tests: Find the third header and assert the
	 * text in the h3 tag. Find and assert the colour of the fifth header tag
	 * element. Button Tests: Find the button with the class emerald and assert it
	 * text. Find and assert the colour of the first button in the third row. Group
	 * the Header tests under a group, HeaderTests. Group the Button tests under a
	 * group, ButtonTests.
	 */
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass(alwaysRun = true )
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/target-practice");

	}

	@Test(groups = { "HeaderTests", "ButtonTests"})
	public void titleTest() {
		Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
	}

	@Test( groups = { "HeaderTests" })
	public void HeaderTest1() {
		String header3 = driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText();
		Assert.assertEquals(header3, "Heading #3");

	}

	@Test( groups = { "HeaderTests" })
	public void HeaderTest2() {
		Color header5color = Color
				.fromString(driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color"));
		Assert.assertEquals(header5color.asHex(), "#9333ea");
	}

	@Test(groups = { "ButtonTests" })
	public void ButtonTest1() {
		WebElement emerald = driver.findElement(By.xpath("//button[text()='Emerald']"));
		Assert.assertEquals(emerald.getText(), "Emerald");
	}

	@Test(groups = { "ButtonTests" })
	public void ButtonTest2() {
		WebElement purple = driver.findElement(By.xpath("//button[text()='Purple']"));
		Color purpleButton = Color.fromString(purple.getCssValue("color"));
		Assert.assertEquals(purpleButton.asHex(), "#581c87");
	}

	@AfterClass(alwaysRun = true)
	public void shutDown() {
		driver.quit();
	}

}
