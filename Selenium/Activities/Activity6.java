package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

	public static void main(String[] args) {
		// Check if elements are selected
		/*
		 * Open a new browser to
		 * https://training-support.net/webelements/dynamic-controls Get the title of
		 * the page and print it to the console. On the page, perform: Find the checkbox
		 * input element. Check if the checkbox is selected and print the result. Click
		 * the checkbox to select it. Check if the checkbox is selected again and print
		 * the result. Close the browser.
		 */
		WebDriver driver= new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='checkbox']"));
		System.out.println("Is checkbox selected: "+checkbox.isSelected());
		checkbox.click();
		System.out.println("Is checkbox selected: "+checkbox.isSelected());
		checkbox.click();
		System.out.println("Is checkbox selected: "+checkbox.isSelected());
		driver.quit();

	}

}
