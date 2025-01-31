package leafGroundButtons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteractions {

	public static void main(String[] args) {
		//Instantiate Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Load URL
		driver.get("https://leafground.com/button.xhtml");
		
		boolean b1 = driver.findElement(By.xpath("//button/span[text()='Click']")).isEnabled();
		System.out.println(b1);
		//- Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//button/span[text()='Click']")).click();
		//- Verify that the title of the page is ‘dashboard.’
		String getTitle = driver.findElement(By.xpath("//div[@class='route-bar-breadcrumb']")).getText();
		if (getTitle.contains("Dashboard"))
		{
			System.out.println(getTitle+" displayed correctly");
		}
		else
		{
			System.out.println("title is not displayed correctly");
		}
		//Navigate back
		driver.navigate().back();
		//- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		
		if(driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled()==false)
		{
		System.out.println("Confirm button is disabled");
		}
		else
		{
			System.out.println("Confirm button is not disabled");
		}	
			
		
		//- Find and print the position of the button with the text ‘Submit.’
		
		System.out.println("Location of Submit button"+driver.findElement(By.xpath("//span[text()='Submit']/parent::button")).getLocation());
			
			
		//- Find and print the background color of the button with the text ‘Find the Save button color.’
		System.out.println("Color of Save button"+driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("Color"));
		//- Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		
		System.out.println("Height of Submit button: "+driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)[2]")).getSize());
		//- Close the browser window.
		driver.close();
		

	}

}
