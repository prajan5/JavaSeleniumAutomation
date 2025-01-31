package actionClassHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class DragAndDropBy {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement scr = driver.findElement(By.id("form:drag_content"));
		
		WebElement target = driver.findElement(By.id("form:drop"));
		
		Actions obj = new Actions(driver);
		obj.dragAndDrop(scr, target).perform();
	}

}
