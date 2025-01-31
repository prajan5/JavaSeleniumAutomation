package testNGAttributes;

import org.testng.annotations.Test;

public class AttributeTimeout {

	
	//will execute for 3 times within 3 seconds 
	  @Test(invocationCount=3,invocationTimeOut=3000)
	  public void createLead() {
		  System.out.println("CreateLead");
	  }
	 

}
