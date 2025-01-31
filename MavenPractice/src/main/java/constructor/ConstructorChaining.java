package constructor;

public class ConstructorChaining {
	
	boolean pass;
	int age;
	String name;
	
	public ConstructorChaining()
	{
		System.out.println("Default constructor");
	}
	
	public ConstructorChaining(boolean p, int a, String n)
	{
		//default constructor(previous) will be called it should be as first line 
		this();
		//gloabal variable = local variable
		
		pass = p;
		age = a;
		name = n;
		System.out.println("status: "+pass+"\n"+"age: "+age+"\n"+"name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorChaining  cd = new ConstructorChaining();
		ConstructorChaining  cd1 = new ConstructorChaining(true,14,"Ramya");
		//Prints default vlaues : false 0 null
		//System.out.println(cd.pass+"\n"+cd.age+"\n"+cd.name);
	
		

	}
	
/*
 Default constructor
status: true
age: 14
name: Ramya
 */

}
