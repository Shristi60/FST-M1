package Activities;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 extends BaseTest {

	/*
	 * WebDriver driver; WebDriverWait wait;
	 * 
	 * @BeforeClass() public void setUp() {
	 * 
	 * driver = new ChromeDriver(); wait = new WebDriverWait(driver,
	 * Duration.ofSeconds(10)); driver.get(
	 * "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login"); }
	 */
	
	@Test
	public void verifyTitle() {
		String homeTitle= driver.getTitle();
		wait.until(ExpectedConditions.titleContains("Orange"));
		assertEquals(homeTitle, "OrangeHRM");
	}
	/*
	 * @AfterClass() public void tearDown() { driver.quit();
	 * 
	 * }
	 */

}
