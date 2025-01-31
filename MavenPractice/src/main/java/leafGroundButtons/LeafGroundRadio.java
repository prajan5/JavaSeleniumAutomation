package leafGroundButtons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadio {

	public static void main(String[] args) throws InterruptedException {
			//Instantiate Browser
				ChromeDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//add Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
				//Load URL
				driver.get("https://www.leafground.com/radio.xhtml");
				
				//- Select 'Your most favourite browser' from the radio buttons
				
			    driver.findElement(By.xpath("(//label[text()='Firefox'])[1]")).click();	
			    
			   	System.out.println(("Firefox selection: "+driver.findElement(By.xpath("//input[@id ='j_idt87:console1:1']")).isSelected()));
				//*Click on a radio button, then click on the same radio button again to verify that it becomes unselected*//
			   	driver.findElement(By.xpath("(//label[text()='Firefox'])[1]")).click();	
			    System.out.println(("Firefox selection: "+driver.findElement(By.xpath("//input[@id ='j_idt87:console1:1']")).isSelected()));
				
				//- Identify the radio button that is initially selected by default.
			   
			    
			if (driver.findElement(By.xpath("//input[@id ='j_idt87:console2:0']")).isSelected()==true)
			{
			   	System.out.println(("Default browser selection: "+driver.findElement(By.xpath("//label[@for='j_idt87:console2:0']")).getText()));
			}
			
			
			
			if (driver.findElement(By.xpath("//input[@id ='j_idt87:console2:1']")).isSelected()==true)
			{
			   	System.out.println(("Default browser selection: "+driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']")).getText()));
			}

			if (driver.findElement(By.xpath("//input[@id ='j_idt87:console2:2']")).isSelected()==true)
			{
			   	System.out.println(("Default browser selection: "+driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText()));
			}
			
			if (driver.findElement(By.xpath("//input[@id ='j_idt87:console2:3']")).isSelected()==true)
			{
			   	System.out.println(("Default browser selection: "+driver.findElement(By.xpath("//label[@for='j_idt87:console2:3']")).getText()));
			}
			
			//Select the age group (only if not selected)
			
			if (driver.findElement(By.xpath("//input[@id='j_idt87:age:0'and @value='1-20 Years']")).isSelected()==false)
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
				
			}
			System.out.println("1-20 Years:"+driver.findElement(By.xpath("//input[@id='j_idt87:age:0' and @value='1-20 Years']")).isSelected());
			
			driver.close();
}}
