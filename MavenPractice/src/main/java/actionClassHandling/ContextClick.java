package actionClassHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		

		WebElement rightClick = driver.findElement(By.xpath("//span[contains(@class,'context-menu')]"));
		
		Actions contxt = new Actions(driver);
		contxt.contextClick(rightClick).perform();
		
	}

}
