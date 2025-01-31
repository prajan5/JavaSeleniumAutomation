package opportunityMarathon;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditOpportunity extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setValues() {
		//Assign SheetName
		SheetName = "Edit";
    }
	
	@Test(dataProvider = "getData")
	public void editOpportunity(String oppName,String deliveryStatus, String Stage, String description) throws InterruptedException {
		
			//Click Opportunity tab
			WebElement opportunity=	driver.findElement(By.xpath("//span[text()='Opportunities']/ancestor::one-app-nav-bar-item-root"));
			opportunity.click();
			//Search for the Opportunity Created 
			driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(oppName,Keys.ENTER);
		    Thread.sleep(3000);
		    //Click the Drop down and select Edit
		    driver.findElement(By.xpath("(//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]")).click();
			driver.findElement(By.xpath("//a[@title='Edit']")).click();
			//Select the date 15 in the current month
			driver.findElement(By.xpath("//div/input[@name='CloseDate']")).click();
			//Xpath1
			//driver.findElement(By.xpath("//span[text()='14']")).click();
			//Xpath2
			driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//td/span[text()='15']")).click();
			//Select Perception Analysis in stage dropdown
			driver.findElement(By.xpath("//div/label[text()='Stage']")).click();
			driver.findElement(By.xpath("//span[text()='"+deliveryStatus+"']")).click();
			//select Delivery/Installation Status as In progress
			WebElement delivery = driver.findElement(By.xpath("//button[@id='combobox-button-314']"));
			driver.executeScript("arguments[0].click();", delivery);
			driver.findElement(By.xpath("//span[text()='"+Stage+"']")).click();
			//Enter description
			driver.findElement(By.xpath("//div/textarea[@class='slds-textarea']")).sendKeys(description);
			//Click Save and Edit 
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			Thread.sleep(3000);
			//Click the current opportunity name 
			driver.findElement(By.xpath("//a[text()='"+oppName+"']")).click();
			
			//Verify the current stage
			String currentStage = driver.findElement(By.xpath("//a[@aria-selected='true' and @aria-current = 'true']/span[2]")).getText();
			if (currentStage.equals(Stage))
			{
		       System.out.println("Current Stage:"+currentStage);
		       System.out.println("Current Stage is correct");
			
			}
			else
			{
				 System.out.println("Current Stage is not correct");
			}
	
            }

			
		
		
	

}
