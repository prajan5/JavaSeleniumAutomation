package abstractionUnderstanding;

public interface DatabaseConnection {
	//interface can have static and final variables must  be intitialized. 
	/*Interface are frameworks.
Frameworks defines certain rules and regulation and these rules & regulations need to be followed 
by classes when using interfaces
An abstract or a normal/concreate class can IMPLEMENT an interface or more than one interface
Interfaces have static and final variables, 
which have to be initialised and is compulsory i.e. we need to 
declare the variable value and this value cannot be changed in the classes implementing the interface
Static and final variables may uses static  or final keywords. Even if they are not defined they will be static and final variables
Static and final variables in interfaces can be have only PUBLIC .specifiers. . Even if PUBLIC are not defined they will be PUBLIC . We do not PROTECTED and PRIVATE global variables in interfaces
*/
	//private static String  dbconn = "Sql"; private is illegal modifier
	public final int noofconnection = 0;
	
	//Must add body for default and static method
	default void connect()
	{
		System.out.println("connect method from DatabaseConnection interface ");
	}
	
	//no need to create object for static 
	public static void disconnect() {
		System.out.println("disconnect method from DatabaseConnection interface ");
	}
	
	
	//abstract method 
	void executeUpdate();
	

}
