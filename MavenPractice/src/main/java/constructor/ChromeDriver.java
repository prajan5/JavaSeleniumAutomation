package constructor;

public class ChromeDriver {
	
	boolean pass;
	int age;
	String name;
	
	public ChromeDriver()
	{
		System.out.println("Default constructor");
	}
	
	public ChromeDriver(boolean p, int a, String n)
	{
		//gloabal variable = local variable
		
		pass = p;
		age = a;
		name = n;
		System.out.println("status: "+p+"\n"+"age: "+a+"\n"+"name: "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver  cd = new ChromeDriver();
		ChromeDriver  cd1 = new ChromeDriver(true,14,"Ramya");
		//Prints default vlaues : false 0 null
		System.out.println(cd.pass+"\n"+cd.age+"\n"+cd.name);
	
		

	}
	
/*
 * Default constructor
status: true
age: 14
name: Ramya
false
0
null

 */

}
