package Activties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity_1 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));	
		driver.get("https://training-support.net/");
	}
	
	@Test(priority=1)
	public void homePageTest() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "Training Support");
	}
	
	@Test(priority=2)
	public void aboutPageTest() {
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		wait.until(ExpectedConditions.titleContains("About"));
		String title1= driver.getTitle();
		Assert.assertEquals(title1, "About Training Support");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	

}
