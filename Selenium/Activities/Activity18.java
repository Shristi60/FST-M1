package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Alerts
		/*
		 * Open a new browser to https://training-support.net/webelements/alerts Get the
		 * title of the page and print it to the console. Find the button to open a
		 * SIMPLE alert and click it. Switch the focus from the main window to the Alert
		 * box and get the text in it and print it. Close the alert once with OK. Close
		 * the browser.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/alerts");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
		System.out.println("The title of page is: "+ driver.getTitle());
		WebElement alert=driver.findElement(By.xpath("//button[@id='simple']"));
		alert.click();	
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alertJS=driver.switchTo().alert();
		String alertText= alertJS.getText();
		System.out.println("Alert Text: "+alertText);
		alertJS.accept();
		driver.quit();

		
		

	}

}
