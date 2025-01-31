package leafGroundButtons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeapGroundCheckbox {

	public static void main(String[] args) {
	
		//Instantiate Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Load URL
		driver.get("https://www.leafground.com/checkbox.xhtml");
		// Click on the "Basic Checkbox.”
		//Select Basic checkbox
				WebElement basicChkbox = driver.findElement(By.xpath("((//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[1])"));
				basicChkbox.click();
		// Click on the "Notification Checkbox."
		// Verify that the expected message is displayed.
		// Click on your favorite language (assuming it's related to checkboxes).
		// Click on the "Tri//State Checkbox."
		// Verify which tri//state option has been chosen.
		// Click on the "Toggle Switch."
		// Verify that the expected message is displayed.
		// Verify if the Checkbox is disabled.
		// Select multiple options on the page (details may be needed).
		// Perform any additional actions or verifications required.
		// Close the web browser when done.

	}

}
