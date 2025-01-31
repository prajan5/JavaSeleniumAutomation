package staticKeyword;

public class staticVariableMethodBlock {
	//static keyword common reference value 
	static String companyName;
	int id ;
	String name;
	
	void display()
	
	{
		System.out.println("Name:"+name);
		System.out.println("id:"+id);
		System.out.println("CompanyName:"+companyName);
	}
	
	//static method 
		public static void printCompanyName()
		{
			companyName="HCL";
			//System.out.println(companyName);
		}
		
		
		static {
			companyName="TCS";
			System.out.println("static block: "+companyName);
		}

	public static void main(String[] args) {
		
		staticVariableMethodBlock obj1 = new staticVariableMethodBlock();
		staticVariableMethodBlock.companyName= "IBM";
		obj1.name = "Ranjani";
		obj1.id = 100;
		
		
		staticVariableMethodBlock obj2 = new staticVariableMethodBlock();
		obj2.name = "Madhu";
		obj2.id = 200;
		
		staticVariableMethodBlock.printCompanyName();
		obj1.display();
		obj2.display();
		
		//static method is the latest one so it takes value from that for the objects
		/*static block: TCS
		Name:Ranjani
		id:100
		CompanyName:HCL
		Name:Madhu
		id:200
		CompanyName:HCL */
		
	//	if variable is the latest one then variable will be considered for the objects
		
	}

}
