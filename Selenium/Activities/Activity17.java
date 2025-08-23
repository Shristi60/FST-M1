package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Open a new browser to https://training-support.net/webelements/selects Get
		 * the title of the page and print it to the console. On the Multi Select:
		 * Select the "HTML" option using the visible text. Select the 4th, 5th and 6th
		 * options using the index. Select the "Node" option using the value. Deselect
		 * the 5th option using index. Close the browser.
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/selects");
		driver.manage().window().maximize();
		System.out.println("The title of page is: " + driver.getTitle());

		WebElement multiSelect = driver.findElement(By.xpath("//select[contains(@class,'h-80')]"));
		Select s = new Select(multiSelect);
		s.deselectAll();
		s.selectByVisibleText("HTML");
		for (int i = 3; i <= 5; i++) {
			s.selectByIndex(i);
		}
		s.selectByValue("nodejs");
		s.deselectByIndex(4);
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		
		driver.quit();

	}

}
