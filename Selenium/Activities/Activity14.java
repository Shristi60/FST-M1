package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity14 {

	public static void main(String[] args) {
		// Tables
		/*
		 * Open a new browser to https://training-support.net/webelements/tables Get the
		 * title of the page and print it to the console. Using xpaths on the table:
		 * Find the number of rows and columns in the table and print them. Find and
		 * print the Book Name in the 5th row. Click the header of the Price column to
		 * sort it in ascending order. Find and print the Book Name in the 5th row
		 * again. Close the browser.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("The title of page is: "+ driver.getTitle());
		
		List<WebElement> columns=driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("No. of columns: "+columns.size());
		
		List<WebElement> rows=driver.findElements(By.xpath("//tbody/tr"));
		System.out.println("No. of rows: "+rows.size());
		
		WebElement Book5=driver.findElement(By.xpath("//tbody/tr[5]/td[2]"));
		System.out.println("The Book Name in the 5th row: "+Book5.getText());
		
		driver.findElement(By.xpath("//th[text()='Price']")).click();
		Book5=driver.findElement(By.xpath("//tbody/tr[5]/td[2]"));
		System.out.println("The Book Name in the 5th row after sorting: "+Book5.getText());
		driver.quit();	

	}

}
