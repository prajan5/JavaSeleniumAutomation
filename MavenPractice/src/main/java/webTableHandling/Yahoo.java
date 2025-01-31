package webTableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the url 
		driver.get("https://finance.yahoo.com");
		//click Markets ->Crypto
		
		
		 driver.findElement(By.xpath("//li/a/span[text()='Markets']")).click();
		 driver.findElement(By.xpath("//span[text()='Crypto']")).click();
		Thread.sleep(3000);
	
		//row size
			List<WebElement> rowsize = driver.findElements(By.xpath("//table/tbody/tr"));
			int noofrows = rowsize.size();
			System.out.println("Row Count:"+noofrows);
			
			//row size
			List<WebElement> columnsize = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
			int noofcolumns = columnsize.size();
			System.out.println("Colum Count:"+noofcolumns);
			
			//Print the cryptocurrency names 
			
			for (int i= 1 ;i<noofrows;i++)
			{
				String currencyName = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				System.out.println(currencyName);
			}
		
		

	}

}
