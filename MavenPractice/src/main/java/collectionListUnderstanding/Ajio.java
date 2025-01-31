package collectionListUnderstanding;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// Launch the URL https://www.ajio.com/
	driver.get("https://www.ajio.com");
	// In the search box, type as "bags" and press enter
	WebElement txtSearch = driver.findElement(By.xpath("//input[@name='searchVal']"));
	txtSearch.sendKeys("bags",Keys.ENTER);
	//-To the left of the screen under "Gender" click on "Men"
	//driver.findElement(By.xpath("//input[@type ='checkbox' and @id='Men']")).click();
	driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class='fnl-plp-afliter']//span")).getText());
	Thread.sleep(3000);
	//Under "Category" click "Fashion Bags"
	driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class='fnl-plp-appliedFliters ']//div[2]/span")).getText());
	// Print the count of the items found.
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//div[@class='length']/strong")).getText());
	//- Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandAllitems = driver.findElements(By.xpath("//div[@class='brand']//strong"));
	
	for(WebElement brand: brandAllitems)
   {
		String brandname = brand.getText();
		System.out.println(brandname);
	}
	//- Get the list of names of the bags and print it

	List<WebElement> namesofBags = driver.findElements(By.xpath("//div[@class='contentHolder']/div[2]"));
	
	for(WebElement name: namesofBags)
   {
		String bagName = name.getText();
		System.out.println(bagName);
	}
	
	
	

	}

}
