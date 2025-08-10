package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) throws InterruptedException {
		// Input Events #1
		//Mouse actions
		/*
		 * Open a new browser to https://training-support.net/webelements/mouse-events
		 * Get the title of the page and print it to the console. On the page, perform:
		 * Left click on the Cargo.lock button, move the cursor to the Cargo.toml button
		 * and then click it. Print the confirmation text at the end of the sequence.
		 * Double click on the src button. Then right click on the target button and
		 * select open. Print the confirmation text at the end of the sequence. Close
		 * the browser.
		 */
		WebDriver driver= new ChromeDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		Actions act= new Actions(driver);
		WebElement cargoLock= driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoToml= driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement src= driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement target= driver.findElement(By.xpath("//h1[text()='target']"));
		
		act.moveToElement(cargoLock).click().pause(Duration.ofSeconds(5)).moveToElement(cargoToml).click().build().perform();
		System.out.println("Confirmation text: "+driver.findElement(By.xpath("//p[@id='result']")).getText());
		act.moveToElement(src).doubleClick().pause(Duration.ofSeconds(3)).contextClick(target).build().perform();
	
		act.moveToElement(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"))).pause(Duration.ofSeconds(7)).click().build().perform();
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("Confirmation text: "+driver.findElement(By.xpath("//p[@id='result']")).getText());
		driver.quit();
		
	}

}
