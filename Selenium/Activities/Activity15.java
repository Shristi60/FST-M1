package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dynamic attributes
		/*
		 * Open a new browser to
		 * https://training-support.net/webelements/dynamic-attributes Get the title of
		 * the page and print it to the console. Find the input fields and type in the
		 * required data in the fields. Wait for success message to appear and print it
		 * to the console. Close the browser.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("The title of page is: "+ driver.getTitle());
		driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]")).sendKeys("Shristi");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("23042025");
		driver.findElement(By.xpath("//textarea[contains(@id, 'additional-details')]")).sendKeys("Testing dynamic attributes");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String msg=driver.findElement(By.xpath("//h3[text()='Your event has been scheduled!']")).getText();
		System.out.println(msg);
		driver.quit();
	}

}
