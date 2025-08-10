package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {

	public static void main(String[] args) {
		/*
		 * Open a new browser to
		 * https://training-support.net/webelements/target-practice Get the title of the
		 * page and print it to the console. Using xpath: Find the 3rd header on the
		 * page and print it's text to the console. Find the 5th header on the page and
		 * print it's color. Using any other locator: Find the purple button and print
		 * all it's classes. Find the slate button and print it's text. Close the
		 * browser.
		 */
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		System.out.println("3rd header on the page: "+driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText());
		
		/* Color header_5th= Color.fromString() */
		//
		System.out.println("Color of 5th header: "+Color.fromString(driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color")));
		//getClass()- Returns the runtime Class object that represents the Java type of the instance.
		System.out.println("Class of purple button: "+driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class"));
		
		System.out.println("Text of slate button: "+driver.findElement(By.xpath("//button[text()='Slate']")).getText());
		
		driver.quit();

	}

}
