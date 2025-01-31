package collectionListUnderstanding;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberOfLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");

		List<WebElement> listElements = driver.findElements(By.tagName("a"));
		
		int size = listElements.size();
		
		System.out.println("total links"+size);
		
		String text = listElements.get(1).getText();
		
		System.out.println(text);//no text for index 1
		
		for (int j = 0; j<size;j++)
		{
			String text1 = listElements.get(j).getText();
			System.out.println(text1);
		}
	}
	
	/* total links7



	Forgot Your Password?
	Use Custom Domain
	Try for Free

	Privacy */


}
