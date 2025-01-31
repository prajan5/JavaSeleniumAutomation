package dynamicParameterizaiton;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{

	
	
	@DataProvider(name="getData")
	public String[][] setValue()
	{
		String[][] data = new String[2][4];
		data[0][0]="TCS";
		data[0][1]="Ramya";
		data[0][2]="krishnan";
		data[0][3]="TeamMember";
		
		data[1][0]="CTS";
		data[1][1]="Helan";
		data[1][2]="Raj";
		data[1][3]="Lead";
		
		
		return data;
				
	
	}
	@Test(dataProvider="getData")
	public void runcreate_Lead(String cName,String fName, String lName, String tle) {
	
		//Create Lead
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		//Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		//Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(tle);
		
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
