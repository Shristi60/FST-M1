package activities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {
	/*
	 * Open a new browser to https://training-support.net/webelements/tabs Get the
	 * title of the page and print it to the console. Find the button to open a new
	 * tab and click it. Wait for the new tab to open. Once it opens, print all the
	 * handles. Switch to the newly opened tab, print the new tab's title and
	 * message. Repeat the steps by clicking the button in the new tab page. Close
	 * the browser.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/tabs");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		System.out.println("The title of page is: " + driver.getTitle());
		String currentHandle = driver.getWindowHandle();
		System.out.println("Current window handle: " + currentHandle);
		driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(handles))
				driver.switchTo().window(handle);
		}
		System.out.println(driver.getWindowHandle());
		System.out.println("The text on new window is: "
				+ driver.findElement(By.xpath("//h1[contains(@class,' h-60 flex')]")).getText());
		WebElement tab_new = driver.findElement(By.xpath("//button[text()='Open Another One']"));
		wait.until(ExpectedConditions.elementToBeClickable(tab_new));
		tab_new.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		// Set<String> handlesdriver.getWindowHandles();

		handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(currentHandle))
				driver.switchTo().window(handle);
		}
		currentHandle = driver.getWindowHandle(); // update again
        System.out.println("Switched to: " + currentHandle);
        System.out.println("The text on another new window is: " + driver.findElement(By.tagName("h1")).getText());

        driver.quit(); 

	}

}
