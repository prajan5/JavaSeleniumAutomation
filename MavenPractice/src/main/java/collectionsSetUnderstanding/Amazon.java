package collectionsSetUnderstanding;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in");
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("phone",Keys.ENTER);
		List<WebElement> allPhonePrice = driver.findElements(By.className("a-price-whole"));
		int size = allPhonePrice.size();
		System.out.println(size);
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (WebElement s:allPhonePrice)
		{
			String spricetext = s.getText();
			//remove , from price
			
			String pricereplacecomma = spricetext.replaceAll(",","");
			//System.out.println(pricereplacecomma);
			
			//convert String Price to Integer Price 
			
			int parseIntPrice = Integer.parseInt(pricereplacecomma);
			list.add(parseIntPrice);
			
		}
		
		//convert List into Set to remove duplicate values
		
		Set<Integer> priceSet = new TreeSet<Integer>(list);
		System.out.println("Price After converting List to Set"+priceSet);// No duplicate value in Tree set
		
		int setSize = priceSet.size();
		System.out.println("SetSize:"+setSize);
		if (size !=setSize)
		{
			System.out.println("No duplicate values present");
		}else {
			System.out.println("duplicate values present");
			
		}

		
	}

}
