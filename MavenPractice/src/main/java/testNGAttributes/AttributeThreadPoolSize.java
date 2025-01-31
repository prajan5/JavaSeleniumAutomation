package testNGAttributes;

import org.testng.annotations.Test;

public class AttributeThreadPoolSize {

	
	//if no priority set it will check for the AScii value of method 
	//enabled takes precedence when it is combined with priority
	  @Test
	  public void createLead() {
		  System.out.println("CreateLead");
	  }
	  
	  @Test
	  public void editLead() {
		  System.out.println("EditLead");
	  }
	  
	 @Test(priority=1,enabled=false)
	 public void deleteLead() {
	System.out.println("DeleteLead");
	  }
	 
	 
	 @Test(enabled=false)
	 public void duplicateLead() {
	System.out.println("DuplicateLead");
	  }

}
