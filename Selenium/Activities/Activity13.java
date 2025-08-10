package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity13 {

	public static void main(String[] args) {
		
		//Tables
		/*
		 * Open a new browser to https://training-support.net/webelements/tables Get the
		 * title of the page and print it to the console. Using xpaths on the table:
		 * Find the number of rows and columns in the table and print them. Find and
		 * print all the cell values in the third row of the table. Find and print the
		 * cell value at the second row second column. Close the browser.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		List<WebElement> columns=driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("No. of columns: "+columns.size());
		
		List<WebElement> rows=driver.findElements(By.xpath("//tbody/tr"));
		System.out.println("No. of rows: "+rows.size());
		
		List<WebElement> thirdrow=driver.findElements(By.xpath("//tbody/tr[3]/td"));
		for(WebElement cell:thirdrow)
		{
			System.out.println(cell.getText());
		}
		
		System.out.println("cell value at the second row second column: "+driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText());
		driver.quit();
	}

}
