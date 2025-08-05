package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//Open the training support site. (https://training-support.net)
		driver.get("https://training-support.net/");

        //Print the title of the page
		System.out.println("The title of page is: "+ driver.getTitle());

        //Click the about us button
		//driver.findElement(By.xpath("/a[text()='About Us']")).click();
		driver.findElement(By.linkText("About Us")).click();

        //Print the title of the new page
		//Thread.sleep(2000);
		System.out.println("The title of page is: "+ driver.getTitle());
		driver.quit();

	}

}
