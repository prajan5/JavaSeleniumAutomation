package constructor;

public class ThisKeyword {
	
	boolean pass;
	int age;
	String name;
	
	public ThisKeyword()
	{
		System.out.println("Default constructor");
	}
	
	public ThisKeyword(boolean pass, int age, String name)
	{
		//default constructor(previous) will be called it should be as first line 
		this();
		//global and local variable same so using this keyword
		
		this.pass = pass;
		this.age = age;
		this.name = name;
		System.out.println("status: "+pass+"\n"+"age: "+age+"\n"+"name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ThisKeyword  cd1 = new ThisKeyword(true,14,"Ramya");
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
