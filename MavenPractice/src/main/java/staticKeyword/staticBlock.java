package staticKeyword;

public class staticBlock {
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
		/*public static void printCompanyName()
		{
			companyName="HCL";
			//System.out.println(companyName);
		}*/
		
		
		static {
			companyName="TCS";
			System.out.println("static block: "+companyName);
		}

	public static void main(String[] args) {
		
		staticBlock obj1 = new staticBlock();
		//staticMethod.companyName= "IBM";
		obj1.name = "Ranjani";
		obj1.id = 100;
		
		
		staticBlock obj2 = new staticBlock();
		obj2.name = "Madhu";
		obj2.id = 200;
		
		//staticBlock.printCompanyName();
		obj1.display();
		obj2.display();
		
		
	//No static variable and method name, so company name from static block
	
		/* 	
static block: TCS
Name:Ranjani
id:100
CompanyName:TCS
Name:Madhu
id:200
CompanyName:TCS*/

		
	}

}
