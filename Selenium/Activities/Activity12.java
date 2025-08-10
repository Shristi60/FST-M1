package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		/*
		 * Open a new browser to
		 * https://training-support.net/webelements/dynamic-content Get the title of the
		 * page and print it to the console. On the page, perform: Find and click the
		 * "Click me!" button. Wait till the word "release" appears. Get the text and
		 * print it to console. Close the browser.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-content");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement release=driver.findElement(By.xpath("//h2[@id='word']"));
		wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='word']"), "release"));
		System.out.println("Word found: "+release.getText());
		
		driver.quit();


	}

}
