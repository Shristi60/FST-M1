package activities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {
	/*
	 * Open a new browser to https://training-support.net/webelements/popups Print
	 * the title of the page. Find the button on the page and click it to launch the
	 * popup. Wait for the popup to appear and then enter the credentials: username:
	 * admin password: password Click submit and print the message on the page after
	 * logging in. Finally, close the browser.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/popups");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		System.out.println("The title of page is: " + driver.getTitle());
		WebElement popup=driver.findElement(By.xpath("//button[@id='launcher']"));
		popup.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']")));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(@class,'mt-5')]")));
		System.out.println(driver.findElement(By.xpath("//h2[contains(@class,'mt-5')]")).getText());
		
        driver.quit(); 

	}

}
