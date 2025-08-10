package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Open a new browser to
		 * https://training-support.net/webelements/dynamic-controls Get the title of
		 * the page and print it to the console. On the page, perform: Find the checkbox
		 * on the page. Click the "Toggle Checkbox" button to remove the checkbox. Wait
		 * for the checkbox to disappear. Toggle the checkbox again. Wait for it appear
		 * and then select it. Close the browser.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='checkbox']"));
		System.out.println("Checkbox visibility: "+checkbox.isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		System.out.println("Checkbox visibility: "+checkbox.isDisplayed());
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.visibilityOf(checkbox)).click();
		System.out.println("Checkbox selected: "+checkbox.isSelected());
		driver.quit();
		
		
		
		


	}

}
