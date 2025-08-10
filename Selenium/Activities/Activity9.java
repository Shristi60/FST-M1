package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		// Input Events #2
		/*
		 * Open a new browser to
		 * https://training-support.net/webelements/keyboard-events Get the title of the
		 * page and print it to the console. On the page, type out a string from the
		 * Selenium script to show on the page Print the message to the console. Close
		 * the browser.
		 */
		WebDriver driver= new ChromeDriver();
		driver.get("https://training-support.net/webelements/keyboard-events");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		Actions act= new Actions(driver);
		act.sendKeys("Text from Selenium Script").build().perform();
		
		System.out.println("Text entered: "+driver.findElement(By.xpath("//h1[contains(@class,'mt-3')]")).getText());
		
		driver.quit();
		

	}

}
