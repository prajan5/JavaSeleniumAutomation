package realtimeTCMarathon;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1BookCinemaTicket {

	public static void main(String[] args) throws InterruptedException {
	//1) Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window and add implicit waait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//2) Load the Url "https://www.pvrcinemas.com/"
		driver.get("https://www.pvrcinemas.com");
	//3) Choose Your location as "Chennai"
		//driver.findElement(By.xpath("//h4[text()='Select City']")).click();
		//driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
	//4) Click on Cinima under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	//5) Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
	//6) Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[contains(text(),'Mon')]")).click();
	//7) Select Your Movie
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='GAME CHANGER']")).click();
	//8) Select Your Show Time
		driver.findElement(By.xpath("//span[text()='10:10 PM']")).click();
	//9) Click on Book Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//10) Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[text()='Accept']")).click();
	//11) Click any one available seat
		driver.findElement(By.xpath("//span[@id='CL.CLUB|K:36']")).click();
		//12) Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	//13) Print the Seat info under book summary
		System.out.println(driver.findElement(By.xpath("//div[@class='seat-number']/p[1]")).getText());
		Thread.sleep(3000);
	//14) Print the grand total under book summary
		System.out.println(driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//following::span")).getText());
	//15) Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
	//16) Close the pop-up
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2']//i)[2]")).click();
	//17) Print Your Current Page title
		System.out.println(driver.getTitle());
	//18) Close Browser
		driver.close();
	}
}



