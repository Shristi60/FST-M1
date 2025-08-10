package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// Drag and Drop
		/*
		 * Open a new browser to https://training-support.net/webelements/drag-drop Get
		 * the title of the page and print it to the console. On the page, perform: Find
		 * the ball and simulate a click and drag to move it into "Dropzone 1". Verify
		 * that the ball has entered Dropzone 1. Once verified, move the ball into
		 * "Dropzone 2". Verify that the ball has entered Dropzone 2. Close the browser.
		 */
		WebDriver driver= new ChromeDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		WebElement ball=driver.findElement(By.xpath("//img[@id='ball']"));
		WebElement dropZone1=driver.findElement(By.xpath("//div[@id='dropzone1']"));
		WebElement dropZone2=driver.findElement(By.xpath("//div[@id='dropzone2']"));
		
	    Actions act= new Actions(driver);
	    act.dragAndDrop(ball, dropZone1).build().perform();
	    if(driver.findElement(By.xpath("(//span[contains(@class,'dropzone-text')])[1]")).getText().equalsIgnoreCase("Dropped!"))
	    {
	    	System.out.println("The ball has dropped in dropzone1");
	    }
	    
	    act.dragAndDrop(dropZone1, dropZone2).build().perform();
	    if(driver.findElement(By.xpath("(//span[contains(@class,'dropzone-text')])[2]")).getText().equalsIgnoreCase("Dropped!"))
	    {
	    	System.out.println("The ball has dropped in dropzone2");
	    }
	    
	    driver.quit();

	}

}
