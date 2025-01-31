package staticKeyword;

public class staticMethod {
	//static keyword common reference value 
	static String companyName;
	int id ;
	String name;
	
	void display()
	
	{
		System.out.println("Name:"+name);
		System.out.println("id:"+id);
		System.out.println("CompanyName"+companyName);
	}
	
	//static method 
		public static void printCompanyName()
		{
			companyName="HCL";
			//System.out.println(companyName);
		}

	public static void main(String[] args) {
		
		staticMethod obj1 = new staticMethod();
		//staticMethod.companyName= "IBM";
		obj1.name = "Ranjani";
		obj1.id = 100;
		
		
		staticMethod obj2 = new staticMethod();
		obj2.name = "Madhu";
		obj2.id = 200;
		
		staticMethod.printCompanyName();
		obj1.display();
		obj2.display();
		
		
		
		/*  
		  Name:Ranjani
	id:100
	CompanyNameHCL
	Name:Madhu
	id:200
	CompanyNameHCL
	   */
		
	}

}
