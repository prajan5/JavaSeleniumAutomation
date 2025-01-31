package webTableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		//Instantiate Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Load URL
		driver.get("https://leafground.com/table.xhtml");
		//1st row, 1st col
		String text1 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println("1st row, 1st col: "+text1);
		
		//3rd row, 2nd column
		String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[2]")).getText();
		System.out.println("3rd row, 2nd column: "+text2);
		
		//row size
		List<WebElement> rowsize = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int noofrows = rowsize.size();
		System.out.println("Row Count:"+noofrows);
		
		//row size
		List<WebElement> columnsize = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int noofcolumns = columnsize.size();
		System.out.println("Colum Count:"+noofcolumns);
		
		for(int i=1;i<noofrows;i++)
		{
			for (int j=1;j<noofcolumns;j++)
			{
				String text3=driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text3);
			}
			
		}
		
	}

}
