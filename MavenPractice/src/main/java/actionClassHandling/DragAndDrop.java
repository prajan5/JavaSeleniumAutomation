package actionClassHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
	
		WebElement ddb = driver.findElement(By.id("form:conpnl"));
		
		Actions ob=new Actions(driver);
		
		ob.dragAndDropBy(ddb, 200, 0).perform();//rough values.
	}

}
