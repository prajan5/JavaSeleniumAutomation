package staticKeyword;

public class staticVariable {
	//static keyword common reference value 
	static String companyName;
	int id ;
	String name;
	
	//non static method 
	void display()
	
	{
		System.out.println("Name:"+name);
		System.out.println("id:"+id);
		System.out.println("CompanyName"+companyName);
	}
	
	

	public static void main(String[] args) {
		
		staticVariable obj1 = new staticVariable();
		staticVariable.companyName= "IBM";
		obj1.name = "Ranjani";
		obj1.id = 100;
	
		//call static method name 
		
		
		staticVariable obj2 = new staticVariable();
		obj2.name = "Madhu";
		obj2.id = 200;
	
	
		obj1.display();
		obj2.display();
		
		/*  
Name:Ranjani
id:100
CompanyNameIBM
Name:Madhu
id:200
CompanyNameIBM

	   */
		
	}

}
