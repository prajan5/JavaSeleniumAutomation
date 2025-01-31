package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{

	
	

	
	@Test
	public void runcreate_Lead() {
	
		//Create Lead
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fname");
		//Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname");
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Devv");
		
		//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Leadd");
		
		//Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		

		String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (firstname=="Fname")
		{
			System.out.println("Lead Created");
		}
		else
		{
			System.out.println("Lead is not Created");
		}
		
		//Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		//System.out.println(title);
		if (title.contains("View Lead | opentaps CRM"))
		{
			System.out.println("title is displayed correctly: "+title);
			
		}
		else
		{
			System.out.println("title is not displayed correctly");
			
		}
		System.out.println(driver.getCurrentUrl());
	
	}
	


	

}
