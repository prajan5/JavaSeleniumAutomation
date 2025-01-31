package opportunityMarathon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CreateOpportunity extends ProjectSpecificMethod {
	

	
		@BeforeTest
		public void setValues() {
			//Assign Sheet name 
			SheetName = "Create";
        }
		
		
		@Test(dataProvider = "getData")
		public void createOpportunity(String oppName,String amount) throws InterruptedException
		{
			//Click on the Dropdown icon in Opprotunity tab(dropdown) 
			driver.findElement(By.xpath("//span[text()='Opportunities List']/ancestor::one-app-nav-bar-item-dropdown")).click();
			Thread.sleep(3000);
			//Click on New Opportunity
			WebElement js = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
			driver.executeScript("arguments[0].click();", js);
			//Enter the opportunity name 
			driver.findElement(By.xpath("//div/input[@name='Name']")).sendKeys(oppName);
			//Enter the amount
			driver.findElement(By.xpath("//div/input[@name='Amount']")).sendKeys(amount);
			//Select the date as 13 in the current month
			driver.findElement(By.xpath("//div/input[@name='CloseDate']")).click();
			driver.findElement(By.xpath("//span[text()='13']")).click();
			//Select Needs Analysis in stage dropdown
			driver.findElement(By.xpath("//div/label[text()='Stage']")).click();
			driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
			//Click Save and Edit 
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			//Verify opportunity Name created
			String opnpame = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
			if (opnpame.equals("Salesforce Automation by PriyaRajan"))
					{
				  System.out.println("OpportunityName"+opnpame);
				  System.out.println("OpportunityName is correct");
					
					}
					else
					{
						 System.out.println("OpportunityName is not correct");
					}
			
		}

	

}
