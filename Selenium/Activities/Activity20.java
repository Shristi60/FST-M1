package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/alerts");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
		System.out.println("The title of page is: "+ driver.getTitle());
		WebElement prompt=driver.findElement(By.xpath("//button[@id='prompt']"));
		prompt.click();	
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alertPrompt=driver.switchTo().alert();
		String alertText= alertPrompt.getText();
		System.out.println("Alert Text: "+alertText);
		alertPrompt.sendKeys("Shristi");
		Thread.sleep(5000);
		alertPrompt.accept();
		System.out.println("Text entered: "+driver.findElement(By.id("result")).getText());
		driver.quit();

	}

}
