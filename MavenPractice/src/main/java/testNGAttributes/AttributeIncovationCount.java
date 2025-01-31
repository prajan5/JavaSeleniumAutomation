package testNGAttributes;

import org.testng.annotations.Test;

public class AttributeIncovationCount {

	
	//will execute for 3 times with 3 seconds gap for each testcase
	  @Test(invocationCount=3,timeOut=3000)
	  public void createLead() {
		  System.out.println("CreateLead");
	  }
	 

}
