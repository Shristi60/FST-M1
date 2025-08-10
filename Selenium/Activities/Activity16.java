package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Select 
		/*
		 * Open a new browser to https://training-support.net/webelements/selects Get
		 * the title of the page and print it to the console. On the Single Select:
		 * Select the second option using the visible text. Select the third option
		 * using the index. Select the fourth option using the value. Get all the
		 * options and print them to the console. Close the browser.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		WebElement dropdown= driver.findElement(By.xpath("//select[contains(@class,'h-10')]"));
		Select s= new Select(dropdown);
		s.selectByVisibleText("One");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByIndex(2);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("three");
		System.out.println(s.getFirstSelectedOption().getText());
		for(WebElement options: s.getOptions())
		{
			System.out.println(options.getText());
			}
		driver.quit();

	}

}
