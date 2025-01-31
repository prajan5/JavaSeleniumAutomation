package frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrameW3Schools {

	public static void main(String[] args) {
		//instantiate browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		//click Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Switch to Alert
		Alert alert = driver.switchTo().alert();
		//cancel the alet
		alert.dismiss();
		//get text on the webpage after cancelling the alert
		String stextcancel = driver.findElement(By.id("demo")).getText();
		System.out.println(stextcancel);
		//click Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		alert.accept();
		////get text on the webpage after accepting the alert
		String stextokay = driver.findElement(By.id("demo")).getText();
		System.out.println(stextokay);
		
		
	
		

	}

}
